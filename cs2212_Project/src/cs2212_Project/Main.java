package cs2212_Project;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Login login = new Login();
		
			Scanner input = new Scanner(System.in);
			
			String username="";
			String password="";
			
			System.out.print("Please enter your username: ");
			username = input.next();
			
			
			System.out.print("Please enter your password: ");
			password = input.next();
			
			input.close();
			login.signIn(username,password);

	}

}
