import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(Library.menu());
		String userinput = input.nextLine();
		
		do {
			System.out.println(Library.menu());
			userinput = input.nextLine();

		} while (!userinput.equals("1")&&!userinput.equals("2")&&!userinput.equals("3")&&!userinput.equals("4")&&!userinput.equals("5")&&!userinput.equals("6"));

		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
