package worker;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
    }

    //    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate) {
//        super(name, birthDate, employeeId, hireDate);
//    }
//
//    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
//        super(name, birthDate, employeeId, hireDate);
//        this.annualSalary = annualSalary;
//        this.isRetired = isRetired;
//    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
