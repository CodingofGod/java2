package sec2;

public class ArrayCopy2 {
	//System.arraycopy(원본배열, 원본시작위치, 복사배열, 복사시작위치 , 개수);
	public static void main(String[] args) {
		int[] arr1 = {80,70,65,90,85,95,60};
		int[] arr2 = {5,3,8,7,6,4,2};
		int[] arr3 = {5,3,8,7,6,4,2};
		System.out.println("arr1"+arr1);
		System.out.println("arr2"+arr2);
		System.out.println("arr3"+arr3);
		arr2 = arr1;	//얕은 복제
		for(int i=0;i<arr1.length;i++) {	//1:1전달 => 깊은 복제
			arr3[i] = arr1[i];
		}
		arr3[2] = 75;
		System.out.println("arr1"+arr1);
		System.out.println("arr2"+arr2);
		System.out.println("arr3"+arr3);
	}

}
