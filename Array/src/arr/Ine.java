package arr;

import java.util.Scanner;

public class Ine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("������"+(i+1)+"��ͬѧ�ɼ�");
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}


	}

}
