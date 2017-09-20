import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(Library.menu());
		String usersinput = input.nextLine();

		input.close();
	}

}
