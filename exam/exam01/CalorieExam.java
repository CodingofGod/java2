package exam01;

import java.util.Scanner;

public class CalorieExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("단백질 :");
			int protein = sc.nextInt();
			
			System.out.println("탄수화물 :");
			int carbohydrate = sc.nextInt();
					
			System.out.println("지방 :");
			int fat = sc.nextInt();
			System.out.println("단백질 :"+protein + "\n탄수화물 :" + carbohydrate + "\n지방 :" + fat);
			
			int calorie = protein*4 + carbohydrate*4 + fat*9;
			System.out.println("총 칼로리는"+calorie+"입니다");
	}
	
}
