package sec2;

public class StudentExam1 {
	public static void main(String[] args) {
	
		Student s1 = new Student("강민우", 1, 100000);
		Student s2 = new Student("이무진", 1, 200000);
		Student s3 = new Student("박정재", 1, 300000);
		
		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();

		
		//이무진 학생이 버스(102번 버스)를 두 번 이용하고, 지하철 2호선을 세 번 이용하였을 경우
		//이무진 학생의 정보와 버스 101호 정보와 지하철 2호선의 정보를 출력하여라
		Subway sub2 = new Subway(2);
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.print();
		bus1.show();
		sub2.show();		
	}

}
