package arr;

import java.util.Scanner;

public class Ine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入"+(i+1)+"个同学成绩");
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}


	}

}
