import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.AssertJUnit.assertEquals;


public class Main {
    private Employee arrayOfEmps[] = { new Employee(1, "Jeff Bezos", 100000.0), new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0) };
    @Test
    void first(){
        List<EmployeeRecord> empList = Arrays.asList(
                new EmployeeRecord(1, "luka", 100.0),
                new EmployeeRecord(2, "nika", 200.0),
                new EmployeeRecord(3, "aleko", 300.0),
                new EmployeeRecord(4, "luka", 400.0));
        List<Integer> identifiers = Arrays.asList(2,3,4,5);
        List<EmployeeRecord> filtered = empList.stream()
                .filter(c ->identifiers.contains((int)c.id()))
                .collect(Collectors.toList());
        System.out.println(filtered);
    }

    //	Home Work
	@Test
	public void whenFilterEmployees_thenGetFilteredStream() {
	    Integer[] empIds = { 1, 2, 3, 4 };
        List<Integer> employeeId = Arrays.stream(empIds)
                .filter(e -> Employee.getEmployeeById(e,arrayOfEmps))
                .collect(Collectors.toList());
        List<Employee> employees = Arrays.stream(arrayOfEmps).filter(c ->employeeId.contains((int) c.getId()))
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 200000)
                .collect(Collectors.toList());
        System.out.println(employeeId);
        System.out.println(employees);
        assertEquals(Arrays.asList(arrayOfEmps[2]), employees);
	}

}
