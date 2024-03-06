package sec1;

public class GenericExam {
	public static void main(String[] args) {
		//생성자에 대한 제네릭의 타입 생략 가능 - 자바 1.7 이상
		Generic1<Student> s = new Generic1<>();
		Student a = new Student("장원영", 21);
		s.setFieldl(a);
		
		Generic1<Teacher> t = new Generic1<>();
		Teacher b = new Teacher("강민우", 26);
		t.setFieldl(b);
		
		Generic1<Integer> i = new Generic1<>();
		i.setFieldl(1004);
		
		Generic1<String> str = new Generic1<>();
		str.setFieldl("강민우");
	}

}
