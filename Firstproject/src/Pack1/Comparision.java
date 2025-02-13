package Pack1;

public class Comparision {

	public static void main(String[] args) {
		var a = 10;
		var b = 5;
		var c = 20;
		var d = 7;
		
		boolean result = a < b;
		System.out.println(result);
		
		boolean result1 = b > c;
		System.out.println(result1);
		
		boolean result2 = a == c;
		System.out.println(result2);
		
		boolean result3 = a != d;
		System.out.println(result3);
		
		boolean result4 = (a > c) && (b < c);
		System.out.println(result4);
		
		boolean result5 = (a > c) || (b < c);
		System.out.println(result5);
	
	}


}
