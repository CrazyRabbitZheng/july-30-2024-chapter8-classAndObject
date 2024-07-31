/**
 * This class uses objects from other class as its fields
 * This class has a static(classwide) variable -- employeeCount
 * @author--Zheng Wang
 */
public class Employee {
    private static int employeeCount = 0;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        employeeCount++;
    }

    public String toString(){
        return String.format("%s, %s Hired:%s Birthday:%s", lastName, firstName, hireDate, birthDate);
    }

    public static int getEmployeeCount() {//这边这个static一定要写，不然在driver class用不了这个method --- 就是不能Employee.getEmployeeCount()
        return employeeCount;
    }
}
