package homeworks.gayane.gevorgyan.homework7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Aram", "Aramyan", 100000);
        Employee employee2 = new Employee(2, "Poghos", "Poghosyan", 150000);
        Employee employee3 = new Employee(3, "Karapet", "Hayrapetyan", 100000);

        System.out.println("Emloyee [id= " + employee1.getId() + ", name = " + employee1.getFirstName() + " " + employee1.getLastName() + ", salary =  " + employee1.getSalary() + "]");
        System.out.println("Emloyee [id= " + employee2.getId() + ", name = " + employee2.getFirstName() + " " + employee2.getLastName() + ", salary =  " + employee2.raiseSalary(25) + "]");
        System.out.println("Emloyee [id= " + employee3.getId() + ", name = " + employee3.getFirstName() + " " + employee3.getLastName() + ", salary =  " + employee3.getAnnualSalary() + "]");
    }
}
