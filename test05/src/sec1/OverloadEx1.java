package sec1;
//pro1 객체!
public class OverloadEx1 {
	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.print();
		pro1.print("별우리");
		pro1.print(99990);
		pro1.print("파티 축제",99990);
		pro1.print(99990,"수호의 날개");
	}
}