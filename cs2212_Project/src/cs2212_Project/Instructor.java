package cs2212_Project;

public class Instructor {
	
	
	
	private int instructorID;
	private String username;
	private String name;
	private String surname;
	private int phoneNumber;
	private String email;
	
	public Instructor(String name,String surname, int ID, String email,int phoneNumber, String username) {
	
		this.name = name;
		this.surname = surname;
		instructorID = ID;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.username = username;
		
	}
	
	public int getInstructorID(){
		return this.instructorID;
	}
	public void setInstructorID(int ID){
		this.instructorID = ID;
	}
	public String getInstructorUserName(){
		return this.username;
	}
	public void setInstructorUserName(String username){
		this.username = username;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getSurName(){
		return this.surname;
	}
	public void setSurName(String surname){
		this.surname = surname;
	}
	public int getPhoneNum(){
		return this.phoneNumber;
	}
	public void setPhoneNumber(int phonenumber){
		this.phoneNumber = phonenumber;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	

}
