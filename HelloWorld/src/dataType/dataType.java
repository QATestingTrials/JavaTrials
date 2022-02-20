package dataType;

public class dataType {

	public static void main(String[] args) {
		{
// Simple String, Integer, Double, Float, Character and Boolean examples
		String msg;
		msg = "Let's Learn Java." + "\nJay Swaminarayan\n-----------";
		int num = 10;
		double num1=10.5;
		float num2=10.5f;
		char ch= 'e';
		boolean a,b;
		a=true;
		b=false;
		System.out.println("String is " + msg);
		System.out.println("Integer is " + num);
		System.out.println("Double is " + num1);
		System.out.println("Float is " + num2);
		System.out.println("Character is " + ch);
		System.out.println("Boolean a is " + a + ". Boolean b is " + b);
	}
		//Implicit Conversion
		{
			System.out.println("\n\nImplicit Conversion\n-----");
			int n = 10;
	        char ch = 'h';
	        int sum = n + ch;
	        System.out.println(sum);
	    }
		//Explicit Conversion
		{
			System.out.println("\n\nExplicit Conversion\n-----");
			int sum = 23;
			int n = 7;
			double avg;
			avg = (double) sum / n;
			System.out.println("Average = " + avg);
		}

		}
}