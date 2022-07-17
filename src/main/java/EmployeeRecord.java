public record EmployeeRecord(long id, String name, double salary) {
	
	public double salaryIncrement( double s) {
	
		return this.salary+s;
	}


	@Override
	public boolean equals(Object obj) {
		if(this.name.equalsIgnoreCase(((EmployeeRecord)obj).name()))
				return true;
		else 
			return false;
		
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
}
