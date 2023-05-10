package Entities;

public class BussinessAccount extends Account {

    private Double loanLimit;

    public BussinessAccount() {
        super();

    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {

            balance += amount - 10.0;

        }

    }

    @Override
    public final void withdraw(Double amount) { //final no metodo impede que seja sobreescrito na subclasse
        super.withdraw(amount);
        balance -= 2.0;

    }

}