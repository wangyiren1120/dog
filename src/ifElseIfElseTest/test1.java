package ifElseIfElseTest;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入成绩:");
	int score = scanner.nextInt();
	if(score>=90) {
		System.out.println("演唱会门票");
	}else if (score>=70) {
		System.out.println("好吃的");
	}else if (score>=60) {
		System.out.println("iphone");
	}else {
		System.out.println("批评");
		}
	}
	
}
	
	


