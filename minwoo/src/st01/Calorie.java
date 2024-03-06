package st01;

public class Calorie {

	public static void main(String[] args) {
        double protein = 100; // 단백질
        double carb = 50; // carb: 탄수화물
        double fat = 10; // fat:지방
        System.out.println("단백질 :"+protein +"g"+ "\n탄수화물 :"+carb + "\n지방 :"+fat);

        double total = protein + carb + fat;

        System.out.println("총 칼로리: " + total + " kcal");
	}
}
