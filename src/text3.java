import java.util.Scanner;

public class text3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ָ��");
		
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();
		double bmi = weight / (height*height);
		if(bmi>=18.5 && bmi<=23.9)	{
			System.out.println("bmi��׼");
		}else {
			System.out.println("bmi����׼");
		}	
	}
}