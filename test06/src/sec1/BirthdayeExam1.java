package sec1;

public class BirthdayeExam1 {
	public static void main(String[] args) {
		Birthday birth1 = new Birthday();
		birth1.setName("강민우");
		birth1.setYear(1999);
		birth1.setMonth(6);
		birth1.setDay(16);
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setName("강찬우");
		birth2.setYear(1992);
		birth2.setMonth(6);
		birth2.setDay(26);
		birth2.birth();
		birth2.birthAddr();
		
		Birthday birth3 = new Birthday();
		birth3.setName("아무이름");
		birth3.setYear(2004);
		birth3.setMonth(3);
		birth3.setDay(12);
		birth3.birth();
		birth3.birthAddr();
	}
	
}
