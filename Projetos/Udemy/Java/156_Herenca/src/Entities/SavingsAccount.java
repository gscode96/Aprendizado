package Entities;

public final class SavingsAccount extends Account { //Palava final impede que a classe seja herdada por outra subclasse

    private Double interestRate;

    public SavingsAccount() {
        super();

    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {

        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount;

    }

}