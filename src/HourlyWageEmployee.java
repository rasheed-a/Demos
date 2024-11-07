
public class HourlyWageEmployee extends SalaryEmployee {
	
	private int hoursWorked;
	
	public HourlyWageEmployee(String name, String title, double wage) {
		super(name, title, wage);
		hoursWorked = 0;
	}
	
	@Override
	public double getOwed() {
		return getWage() * hoursWorked;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\\n\tHours Worked: " + hoursWorked;
		return s;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
}
