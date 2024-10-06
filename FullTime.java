package School;

public class FullTime extends Teacher{
    int salary;
    String unit;

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

    public FullTime() {
        super();
        salary = 0;
        unit = "";
    }

    public FullTime(String name, int age, String subject, int salary, String unit) {
        super(name, age, subject);
        this.salary = salary;
        this.unit = unit;
    }

    public void print() {
        super.print();
        System.out.println("Gaji: Rp" + salary + ",-");
        System.out.println("Unit: " + unit);
    }

}
