import java.util.Hashtable;

public class LoginServer {

	private final String fileName = "userpass.txt";
	private Hashtable<String,String> hashtable;
	
	public LoginServer(){
		
	}
	
	public boolean isValid(String username, String password) {
		return true;
	}
}
