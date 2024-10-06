package School;

public class Student extends Person {
    int studentNumber;
    int score;
    String major;

	public int getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

    public Student() {
        super();
        studentNumber = 0;
        score = 0;
        major = "";
    }

    public Student(String name, int age, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    public void print() {
        super.print();
        System.out.println("Absen: " + studentNumber);
        System.out.println("Nilai: " + score);
        System.out.println("Jurusan: " + major);
    }
}
