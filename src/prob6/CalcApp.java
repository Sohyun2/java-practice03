package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();

			if(expression.equals("quit")) break;
			
			/*  코드를 완성 합니다 */
			String[] tokens = expression.split(" ");
			
			String op = tokens[1]; //operation의 위치
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[2]);
			int result = 0;
			switch(op) {
			case "+":
				Add add = new Add();
				add.setValue(num1, num2);
				result = add.caluclate();
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				result = sub.caluclate();
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(num1, num2);
				result = mul.caluclate();
				break;
			case "/":
				Div div = new Div();
				div.setValue(num1, num2);
				result = div.caluclate();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
			 
			System.out.println(">> " + result);
			
		}
		System.out.println("프로그램 종료");
	}
}
