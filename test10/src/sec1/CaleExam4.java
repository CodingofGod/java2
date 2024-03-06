package sec1;

public class CaleExam4 {
	int num1 = 100;
	int num2 = 3;
	
	public static void main(String[] args) {
		Calcurator cal1;
		
		//메소드의 구현 내용이 없어 인터페이스 생성자로 객체를 생성할 수 없으니
		//메소드의 구현 내용을 별도로 기술하면, 객체를 생성할 수 았음
		cal1 = new Calcurator() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}

			@Override
			public int divide(int num1, int num2) {
				int su = 0;
				if(num1 > num2) su = num1 - num2;
				else su = num2 - num1;
				return num1 - num2;
			}
			abstract int power(int num1, int num2); //추상 메소드
		}
	}
}

