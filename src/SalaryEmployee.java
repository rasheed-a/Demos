
public class SalaryEmployee {
	
	private String name; // employee's name
	private String title; // employee's job title
	private double wage; // employee's annual salary/wage
	
	//Constructor method
	public SalaryEmployee(String name, String title, double wage) {
		this.name = name;
		this.title = title;
		this.wage = wage;
	}

	//return monthly salary
	public double getOwed() {
		return wage/12.0;
	}
	
	@Override
	public String toString() {
		String s = name + "(" + title + ")\n\t$" + wage;
		return s;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
}
