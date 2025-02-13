package Pack1;

public class Variable2 {
	
	
	int num1 = 500;
	static int num2 = 900;

	public static void main(String[] args) {
//		Value of num1 for v1 before change
//	 	Updated value of num1 for v1
		Variable2 v1 = new Variable2();
		System.out.println(v1.num1);
		v1.num1 = 600;
		System.out.println(v1.num1);
//		Value of num1 for new object v2
		Variable2 v2 = new Variable2();
		System.out.println(v2.num1);
//		Value of v1 for new object v3
		Variable2 v3 = new Variable2();
		System.out.println(v3.num1);
		
		System.out.println( "Edited here");
		System.out.println();
		System.out.println("******Static Variable*****");
		System.out.println();
		
		System.out.println(v1.num2);
		v1.num2 = 1000;
		System.out.println(v1.num2);

		System.out.println(v2.num2);
		System.out.println(v3.num2);
		
		num2 = 700;
		System.out.println(num2);
		
	}

}
