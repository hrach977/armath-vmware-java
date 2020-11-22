package homeworks.gayane.gevorgyan.homework4;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int i, String f, String l, int s){
        id = i;
        firstName = f;
        lastName = l;
        salary = s;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int persent){
        return salary + salary * persent / 100;
    }
}
