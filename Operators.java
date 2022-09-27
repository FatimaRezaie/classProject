
package classProject;

	import java.util.Scanner;

	public class Operators {
		
		
		public static void main(String[] args) {
			
			
			
			Scanner firstObj = new Scanner(System.in);
			System.out.print(" please enter a digit number ");
			
			Scanner secondObj = new Scanner(System.in);
			int input01 = firstObj.nextInt();
			
			System.out.print(" please enter another digit number");
			int input02 = secondObj.nextInt();
			
			System.out.println(" the addition of these numbers are:"); 
			System.out.println( input01 + input02  );
			System.out.println(" the minus of these numbers are:");
			System.out.println( input01 - input02  );
			System.out.println(" the substraction of these numbers are:");
			System.out.println( input01 * input02  );
			System.out.println(" the remainings of these numbers are:");
			System.out.println( input01 % input02  );
			
			
			System.out.println(" please write down your countery of birth:");
			
			Scanner stringObj = new Scanner(System.in);
			String inputString = stringObj.nextLine();
			System.out.println("You are from"  + inputString);
			
			
			 
			
		}

	}

