package sec1;

import java.util.Scanner;

public class StudentExam1 {
	public static void main(String[] args) {
		// int[] arr = {6,3,1,7,5,4,2};
		Student[] s = new Student[5];
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			s[i] = new Student(); //개별 객체 생성
			s[i].setNo(i+1);
			System.out.print((i+1)+"번째 국어 : ");
			s[i].setKor(scn.nextInt());
			System.out.print((i+1)+"번째 영어 : ");
			s[i].setEng(scn.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			s[i].setMat(scn.nextInt());
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(int i=0; i<5; i++);
			
		}
	}
