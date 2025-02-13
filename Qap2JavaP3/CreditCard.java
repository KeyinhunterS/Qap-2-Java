public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // Copy to prevent security issues
        this.balance = new Money(0); // Initial balance is zero
    }

    // Get balance (returns a copy)
    public Money getBalance() {
        return new Money(balance);
    }

    // Get credit limit (returns a copy)
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get owner details as a string
    public String getPersonals() {
        return owner.toString();
    }

    // Charge the credit card
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        }
    }

    // Make a payment
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
