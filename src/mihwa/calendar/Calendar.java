package mihwa.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {//main�Լ�
		System.out.println("일   월   화    수   목   금   토");//
		System.out.println("--------------------");//
		System.out.println(" 1 2  3  4  5  6  7");//
		System.out.println(" 8 9 10 11 12 13 14");//
		System.out.println("15 16 17 18 19 20 21");//
		System.out.println("22 23 24 25 26 27 28");//
		
		//숫자를 입력받아 해당하는 달의 최대일수를 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		int a;//달 12까지
		
		//30 - 4,6,9,11,12 
		//28 - 2
		//31  -1,3,5,7, 8 ,10 
		while(true) {
		System.out.println("달을 입력하시오");
		System.out.println(">>>");
		a = scanner.nextInt();
		
		int [] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("%d월은 %d일까지입니다.\n" , a ,maxDays[a -1]);
		}
		
	/*	switch (a) {
		case b:
			
			break;
		case day:
			
			break;
		case day:
			
			break;

		default:
			break;
		}*/
		
	}

}
