package lianxi;

import java.util.Scanner;

public class CaiQuan {
	static	Scanner input = new Scanner(System.in);
	/**
	 *�˷���
	 */
	static int psco=0;
	/**
	 *���Է���
	 */
	static int csco=0;
	/**
	 *���� 
	 */
	static int count=0;
	public static void main(String[] args) {
		while (true) {
			//����
			int com =(int)(Math.random()*10)%3+1;
			switch(com){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
				
			}
			//��
			System.out.println("��������Ҫ���Ĳ���1.ʯͷ  2.����  3.��");
			int peo = input.nextInt();
			switch(peo){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
				
			}if(peo==com){
				count++;
			}else if((peo==1 && com==2 )||(peo==2 && com==3 )||(peo==3 && com==1)){
				psco+=1;
				System.out.println(" ��"+psco+"�� ");
				System.out.println(" ��"+csco+"�� ");
				count++;
			}else{
				csco+=1;
				System.out.println(" ��"+psco+"�� ");
				System.out.println(" ��"+csco+"�� ");
				count++;
				}
			if(csco==3||psco==3){
				System.out.println(" ��"+psco+"�� ");
				System.out.println(" ��"+csco+"�� ");
				break;
			}
			
			}
		
		}	
		
    }

