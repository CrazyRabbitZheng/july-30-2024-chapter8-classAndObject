/**
 * This class creates 2 Date objects and one Employee object
 * @author--Zheng Wang
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Harry", birth, hire);

        System.out.println(employee);

    }
}
