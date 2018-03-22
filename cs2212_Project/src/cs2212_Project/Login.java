package cs2212_Project;

import java.util.Scanner;

public class Login {

	LoginServer server;
	Scanner input;
	
	public Login() {
		server = new LoginServer("userpass.txt");
	}
	
	public void signIn(String username,String password) {
		
		server.isValid(username, password);

		
		
	}
	
}
