package sec3;

public class People {
	//static : 
	public static int selNum = 100;	//고유번호
	public String name;	//이름
	public int age;	//나이
	public String addr;	//주소
	
	public void print1() {
		System.out.println("selNum : "+this.selNum);
		System.out.println("name : "+this.name);
	}
	public static void print2() { // 정적(static) 메소드
		System.out.println("name : 이무진");
		System.out.println("Age : 26");
	}
	
}
