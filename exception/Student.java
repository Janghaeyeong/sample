public class Student {
	private String name;
	private String grade;
	private int kor;
	private int eng;
	private int math;
	private double avg;

	public Student() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return (kor + eng + math);
	}

	public double getAvg() {
		return (double) getTotal()/3;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}