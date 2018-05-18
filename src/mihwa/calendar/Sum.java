package mihwa.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 입력:키보드로 두수의 입력을 받는다
		Scanner scanner = new Scanner(System.in);
		//출력:화면에 두수의 합을 출력한다
		System.out.println("첫번째 수를 입력하시오!");
		int num1 = scanner.nextInt();
		System.out.println("두번째 수를 입력하시오");
		int num2 = scanner.nextInt();
		
		int result = num1 + num2;
		
		
		System.out.println("두수의 합은:" + result);
		scanner.close();
	}

}
