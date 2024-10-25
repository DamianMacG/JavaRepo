package worker;

public class Main {
    public static void main(String[] args) {
        Employee Damian = new Employee("Damian", "21/11/1993", "01/01/2024");
        SalariedEmployee Damian2 = new SalariedEmployee("Damian2", "21/11/1993", "01/01/2024", 35000);

        System.out.println(Damian);
        System.out.println(Damian2);
        System.out.println(Damian.getAge());
        System.out.println(Damian2.collectPay());

        Damian2.retire();
        System.out.println(Damian2.collectPay());

    }


}
