package sec3;
// static : 정적 필드 (공유 데이터) : 객체와 관계없이 메모리가 공유된다
public class PeopleExam {
	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200;			//people.selNum = 200 와 동일 => 클래스 변수 == 정적 필드 == 공유 데이터
		p1.name = "강민우";		//인스턴스 변수 == 동적 필드
		p1.age = 26;		//
		p1.addr = "공릉동";
		
		People p2 = new People();
		p2.selNum = 300;			//people.selNum = 300
		p2.name = "이무진";
		p2.age = 29;
		p2.addr = "방이동";
		System.out.println(p1.selNum+","+p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.selNum = 400;
		
		System.out.println(p1.selNum+","+p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.print1();	
		p2.print1();
		
		p1.print2();	//peolpe.print2() 와 동일
		p2.print2();	//peolpe.print2()
		
		//정적(static) 요소 : static으로 선언된 필드 또는 메소드, 객체의 생성없이 활용 가능
		//정적(static) 메소드 :객체의 생성없이 클래스에서 바로활용하는 메소드
		System.out.println("정적 메소드 == 클래스 메소드");
		People.print2();
		People.selNum = 500;
		p1.print1();
		p2.print1();
		
	}

}
