package week_3.assignment;

public class Employee {
    static class EmployeeDetails {
        String empName;
        double salary;
        boolean permanent;
    }

    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails();

        System.out.println("Name: " + employee.empName);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Permanent: " + employee.permanent);
    }
}