package sec2;

public class Student {
	private String name;
	private int grade;
	private int money;

	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//takeBus() <-메소드 학생이 버스를 타면 생기는 현상
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	//학생이 지하철을 타면 생기는 현상
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void print() {
		System.out.println ("student [name=" + name + ", grade=" + grade + ", money=" + money + "]");
	}
	public void print1() {
		System.out.println ("student [name=" + name + ", grade=" + grade + ", money=" + money + "]");
	}

}
