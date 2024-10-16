package OopInheritance.InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate,
            double annualSalary, boolean isRetired) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 12;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;

        return (int) adjustedPay;
    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }

}
