package lianxi;

import java.util.Scanner;

public class CaiQuan {
	static	Scanner input = new Scanner(System.in);
	/**
	 *人分数
	 */
	static int psco=0;
	/**
	 *电脑分数
	 */
	static int csco=0;
	/**
	 *次数 
	 */
	static int count=0;
	public static void main(String[] args) {
		while (true) {
			//电脑
			int com =(int)(Math.random()*10)%3+1;
			switch(com){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
				
			}
			//人
			System.out.println("请输入您要出的操作1.石头  2.剪刀  3.布");
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
				System.out.println(" 人"+psco+"分 ");
				System.out.println(" 机"+csco+"分 ");
				count++;
			}else{
				csco+=1;
				System.out.println(" 人"+psco+"分 ");
				System.out.println(" 机"+csco+"分 ");
				count++;
				}
			if(csco==3||psco==3){
				System.out.println(" 人"+psco+"分 ");
				System.out.println(" 机"+csco+"分 ");
				break;
			}
			
			}
		
		}	
		
    }

