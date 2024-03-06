package sec2;

public class BookExam {
	public static void main(String[] args) {
		//100 개의 Book 배열 선언
		Book[] book = new Book[100];
		
		for(int i=0;i<10;i++) {
			book[i] = new Book("책 제목"+i, "저자"+i);		
		book[0] = new Book ("자바 프로그래밍 입문", "강민우");
		book[1] = new Book ("HTML/CSS", "강민우");
		book[2] = new Book ("자바란 무엇일까", "강민우");
		book[3] = new Book ("오지게 어렵다", "강민우");
		book[4] = new Book ("머리속이 텅텅", "강민우");
		}
		for(int i=0; i<5;i++) {
			System.out.println(book[i].toString());
		}
	}
}
