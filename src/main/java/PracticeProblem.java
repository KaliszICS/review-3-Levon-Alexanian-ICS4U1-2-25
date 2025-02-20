import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Get a string using "In: " as the prompt. Output the first character of the string.
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        String name = scan.nextLine();
		System.out.println(name.charAt(0));
	}

	public static void q2() {
		//Get a boolean using "In: " as the prompt. Output the opposite boolean.
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        boolean bool = scan.nextBoolean();
		System.out.println(!bool);
	}

	public static void q3() {
//Get an integer using "In: " as the prompt. Output true if the number is greater than 5. False otherwise.
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        double num = scan.nextDouble();
		System.out.println(num >= 5); 
	}

	public static void q4() {
	//Get a double using "In: " as the prompt. Output true if the number is between -2 and 2 (inclusive). False otherwise.	
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		double num = scan.nextDouble();
		System.out.println(num >= -2 && num <= 2); 
	}

	public static void q5() {
		//Get a String using "In: " as the prompt. Output true if the string is "Hello World". False otherwise
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		String bird = scan.nextLine();
		System.out.println(bird.equals("Hello World")); 
	}

	public static void q6() {
		//Get 2 integers using "In: " as the prompt. Output true if the first integer is less than or equal to the second. False otherwise.
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		int num = scan.nextInt();
		System.out.print("In: ");
		int num1 = scan.nextInt();
		System.out.println(num <= num1); 
	}

	public static void q7() {
		//Get 2 doubles using "In: " as the prompt. Output true if the first integer is greater than the second. False otherwise.
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		double num = scan.nextDouble();
		System.out.print("In: ");
		double num1 = scan.nextDouble();
		System.out.println(num > num1); 
	}

}
