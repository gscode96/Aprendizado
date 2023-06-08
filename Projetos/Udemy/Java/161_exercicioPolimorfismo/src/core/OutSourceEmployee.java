package core;

public class OutSourceEmployee extends Employee {

    private double additionalCharge;

    public OutSourceEmployee() {
        super();
    }

    public OutSourceEmployee(String name, int hours, double valuePerHours, double additionalCharge) {
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return this.additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {

        return super.payment() + additionalCharge * 1.1;
    }

}
