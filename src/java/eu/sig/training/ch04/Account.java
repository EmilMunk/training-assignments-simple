package eu.sig.training.ch04;

public abstract class Account {
    public void addInterest(Money balance, float INTEREST_PERCENTAGE) {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}