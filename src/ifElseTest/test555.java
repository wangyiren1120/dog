package ifElseTest;

public class test555 {
	public static void main(String[] args) {
		int a=4 ,b=6, c=5;
		int max;
		
		if (a>=b) {
			if (a>=c) {
				max = a;
			}else{
				max = c;
			}
		} else {
			if (b>=c) {
				max = b;
			}else{
				max = c;
			}
		}	
		System.out.println(max);
		}	
	}

