package cs2212_Project;

import java.util.Scanner;

public class Login {

	LoginServer server;
	Scanner input;
	SystemStatus status;
	
	public Login() {
		status = new SystemStatus();
		server = new LoginServer("userpass.txt");
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			String username="";
			String password="";
			
			System.out.print("Please enter your username: ");
			username = input.next();
			
			
			System.out.print("Please enter your password: ");
			password = input.next();
		
			if (server.isValid(username, password).equals("a")) {
				AdministratorSession session = new AdministratorSession(username);
				int a = input.nextInt();
				if (a==1) {
					status.start();
				}
				
				else if (a==2) {
					status.stop();
				}
				
				else {
					session.chooseOperation(a);
				}
			}
			
			else if (server.isValid(username, password).equals("s")) {
				if (status.isStarted()) {
					StudentSession session = new StudentSession(username);
					int a = input.nextInt();
					session.chooseOperation(a);
				}
				else {
					System.out.println("Sorry, you are not allowed to use the system at the moment, for more info, call admins");
				}
			}
			
			else if(server.isValid(username, password).equals("i")) {
				if (status.isStarted()) {
					InstructorSession session = new InstructorSession(username);
					int a = input.nextInt();
					session.chooseOperation(a);
				}
				else {
					System.out.println("Sorry, you are not allowed to use the system at the moment, for more info, call admins");
				}
			}
		}
		
		input.close();
	}
	
	public static void main(String[] args) {
		
		Login login = new Login();
	}
	
}
