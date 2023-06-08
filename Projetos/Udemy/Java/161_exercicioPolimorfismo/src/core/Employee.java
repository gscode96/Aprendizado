package core;

public class Employee {

    private String name;
    private int hours;
    private double valuerPerHours;

    public Employee() {
    }

    public Employee(String name, int hours, double valuerPerHours) {
        this.name = name;
        this.hours = hours;
        this.valuerPerHours = valuerPerHours;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getvaluerPerHours() {
        return this.valuerPerHours;
    }

    public void setvaluerPerHours(double valuerPerHours) {
        this.valuerPerHours = valuerPerHours;
    }

    public double payment() {

        return hours * valuerPerHours;

    }

}