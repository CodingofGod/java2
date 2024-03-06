package sec1;

public class OverloadEx2 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBno(101);
		b1.setBname("초보 자바프로그래밍");
		b1.setPrice(20000);
		b1.setAuthor("강민우");
		b1.setPub("강민우지음");
		
		Book b2 = new Book();
		b2.setBno(102);
		b2.setBname("중급 자바프로그래밍");
		b2.setPrice(22000);
		b2.setAuthor("강민우");
		b2.setPub("강민우지음");
	
		Book b3 = new Book();
		b3.setBno(103);
		b3.setBname("고급 자바프로그래밍");
		b3.setPrice(25000);
		b3.setAuthor("강민우");
		b3.setPub("강민우지음");
	}

}
