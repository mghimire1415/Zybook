	import java.util.Scanner;
	public class basic_input {
	    public static void main(String[] args) {
	        Scanner scnr = new Scanner(System.in);
	        int userInt;
	        double userDouble;

	        System.out.print("Enter integer:\n");
	        userInt = scnr.nextInt();

	        char userChar;
	        String userString;

	        System.out.print("Enter double:\n");
	        userDouble=scnr.nextDouble();
	        System.out.print("Enter character:\n");
	        userChar=scnr.next().charAt(0);
	        System.out.print("Enter string:\n");
	        userString=scnr.next();

	        System.out.println(userInt+" "+userDouble+" "+userChar+" "+userString);

	        System.out.println(userString+" "+userChar+" "+userDouble+" "+userInt);

	        System.out.println(userDouble+" cast to an integer is "+(int)userDouble);
	        scnr.close();
	        return;
	    }
	}
