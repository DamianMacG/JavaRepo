package worker;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
    }

    //    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate) {
//        super(name, birthDate, employeeId, hireDate);
//    }
//
//    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
//        super(name, birthDate, employeeId, hireDate);
//        this.hourlyPayRate = hourlyPayRate;
//    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
