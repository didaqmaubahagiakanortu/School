package School;

public class PartTime extends Teacher{
    int hoursWorked;

	public int getHoursWorked() {
		return this.hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

    public PartTime() {
        super();
        hoursWorked = 0;
    }

    public PartTime(String name, int age, String subject, int hoursWorked) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
    }

    public int salary(int a) {
        int salary = a * 100000;
        return salary;
    }

    public void print() {
        super.print();
        System.out.println("Jam kerja: " + hoursWorked + " jam");
        System.out.println("Gaji: Rp" + salary(hoursWorked) + ",-");
    }


}
