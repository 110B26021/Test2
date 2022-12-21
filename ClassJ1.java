import java.util.Scanner;

public class J1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outsideloop:for(int j=1 ;j<=3;j++) { 
			insideloop:for(int i=1;i<=3;i++) {

				System.out.print("密碼輸入測試:\n");
				Scanner wrt = new Scanner(System.in);
				int setpass1=wrt.nextInt();

				//
				if ( setpass1 < 0 || setpass1 > 9999 ){
				System.out.println("請再輸入一次密碼\n");
				break ;
				}

				System.out.print("請再輸入一次密碼:\n");
				Scanner wrti = new Scanner(System.in);
				int setpass2=wrti.nextInt();

				if ( setpass2 < 0 || setpass2 > 9999 ){
				System.out.println("請再輸入一次密碼\n");
				break;
				}

				 

				/* 
				//if 001
				if (i==3) {
				System.out.println("EROR");
				break outsideloop;
				}
				//if 002 
				if ( setpass1 < 0 || setpass1 > 9999 ){
				System.out.println("請再輸入一次密碼\n");
				}
				//if 003
				if ( setpass2 < 0 || setpass2 > 9999 ){
				System.out.println("請再輸入一次密碼\n");
				}

				*/

				//else if 001
				else if (setpass1==setpass2){
				System.out.print("密碼正確");
				break outsideloop;
				} 
				//else if 002
				else if (setpass1 !=setpass2){
				System.out.print("與第一次的輸入不同\n");

				//else if 002中的if 001
				if (j==3) {
				System.out.println("EROR");
				break outsideloop;
				}
				}

				 


				
				}
			
				}


				}
				}
