package com.javaex.ex05;
import java.util.*;

public class CalcApp {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print(">> ");
			String sNum = sc.nextLine();

			if(sNum.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String[] sArray = sNum.split(" ");
			int num1 = Integer.parseInt(sArray[0]), num2 = Integer.parseInt(sArray[2]);
			String op = sArray[1];	

			if(op.equals("+")) {
				Add add = new Add();
				System.out.println(">> " + add.calculate(num1, num2));
			}
			else if(op.equals("-")) {
				Sub sub = new Sub();
				System.out.println(">> " + sub.calculate(num1, num2));
			}
			else if(op.equals("/")) {
				Div div = new Div();
				System.out.println(">> " + div.calculate(num1, num2));
			}
			else if(op.equals("*")) {
				Mul mul = new Mul();
				System.out.println(">> " + mul.calculate(num1, num2));
			}
			else {
				System.out.println("알 수 없는 연산입니다.");
			}					
		}
	}
}
