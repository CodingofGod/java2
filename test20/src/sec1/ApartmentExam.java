package sec1;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartmentExam {
	public static void main(String[] args) {
		List<Apartment> am = new ArrayList<>();
			for(int i=0; i<=6; i++) {
				Apartment ap = new Apartment("강남"+i, "반포자이", 5, 103, 101, 165);		
				am.add(ap);
			}	
			for(Apartment a :am) {
				System.out.println(a.toString());
			}
	}
}
