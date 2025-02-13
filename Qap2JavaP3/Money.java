public class Money {
    private long dollars;
    private long cents;

    // Constructor: Convert double amount into dollars and cents
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    // Copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Addition
    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return fromCents(totalCents);
    }

    // Subtraction
    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return fromCents(totalCents);
    }

    // Compare two Money objects
    public int compareTo(Money otherObject) {
        return Long.compare(this.toCents(), otherObject.toCents());
    }

    // Equality check
    public boolean equals(Money otherObject) {
        return this.toCents() == otherObject.toCents();
    }

    // Convert to readable string
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    // Helper methods
    private long toCents() {
        return dollars * 100 + cents;
    }

    private static Money fromCents(long totalCents) {
        return new Money(totalCents / 100.0);
    }
}
