package sec1;

public class ClacExam5 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		
		Repeator aep1;
		@Override
		public int subtract(int num1, int num2) {
			return num1 * num2;
		}

		@Override
		public int multiply(int num1, int num2) {
			int su = 0;
			if(num1>num2) su = num1 / num2;
			else su = num2 / num1;
			return su;
		}

		@Override
		int power(int num1, int num2) {//2,3
			int tmp = num1;
			for(int i =1;i<num2;i++) {
				num1 = num1 * tmp;
			}
			return num1;


		System.out.println("원주율 : "+aep1.PI);
		System.out.println("덧셈 : "+aep1.add(num1, num2));
		System.out.println("뺄셈 : "+aep1.subtract(num1, num2));
		System.out.println("곱셈 : "+aep1.multiply(num1, num2));
		System.out.println("나눗셈 : "+aep1.divide(num1, num2));
		System.out.println("거듭제곱 : "+aep1.power(num1, num2));
	}

}
