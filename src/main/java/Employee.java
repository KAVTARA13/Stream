public class Employee {
	private long id;
	private String name;
	private double salary;

	public Employee(long id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double salaryIncrement(double s) {
//		return s;
		return salary += s;
	}

	public static boolean getEmployeeById(Integer id, Employee[] arrayOfEmps){
		boolean contain = false;
		for (Employee e : arrayOfEmps){
			if (e.id == id){
				contain = true;
				break;
			}
		}
		return contain;
	}

	@Override
	public String toString() {

		return id + ", " + name + "," + salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
