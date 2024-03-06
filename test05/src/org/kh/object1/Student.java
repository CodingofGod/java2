package org.kh.object1;

public class Student {
	String name = "리무진";
	int kor = 100;
	int eng = 80;
	int mat = 70;
	int tot() {
		return this.kor+this.eng+this.mat;
	}
	double avg() {
		return (this.kor+this.eng+this.mat) / 3.0f;
	}
	void resulting() {
		System.out.println("이름 : "+this.name+", 총점 : "+this.tot()+"평균 : "+this.avg());
	}
}
