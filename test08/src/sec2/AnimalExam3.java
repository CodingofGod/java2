package sec2;

public class AnimalExam3 {
	public static void main(String[] args) {
		Animal a1; //Animal 객체 선언
		a1 = new Animal();
		a1.setName("토끼");
		a1.setSpine(true);
		a1.print();
		System.out.println(a1.print());
		
		a1 = new Mamma1();
		a1.setName("다람쥐");
		//a1.leg =4;
		a1.print();
		System.out.println(a1.print());
		
		
		a1 = new Birds();
		a1.setName("올빼미");
		a1.print();
		System.out.println(a1.print());
	}

}
