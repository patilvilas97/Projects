package stepDefinitions;

public class VIls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Solve(3,4);
	}

	private static void Solve(long x, long y) {
		long num1 = 1;
		long num2 = x-1;
		if(num1+num2 == x && (num1^num2)==y ) {
			System.out.println(num1 + " " + num2);
		}else {
			System.out.println(-1);
		}
		
	}

}
