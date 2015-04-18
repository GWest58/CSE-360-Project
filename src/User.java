/*
 * Matthew Clark 
 * CSE 360 Efferent Patient Care project
 * Spring '15 Balasooriya 10:10-11:20
 * 	
 * User class stores the basic information for each user in the system rather that be a doctor or a patient. The doctor or patient classes
 * will inherit this basic information. User objects are stored in a text file that both read and written to. User only reads this file. 
 * 
 * To do: 
 * link with login UI
 * parse function
 * 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
//i named the class cereal because I have lame jokes
//implements serializable so we can store users as objects and retrieve them
//private vars for each var listed in user class diagram
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String email;
	private boolean authenticated;
	private String username;
	private String password;
	private User user;
	
	public User(String firstName, String lastName, String email, int phoneNumber, boolean authenticated, String username, String password){
//constructor method		
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.authenticated=authenticated;
		this.username=username;
		this.password=password;
		User user;
	}
//getter methods for each var	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public int getPhoneNumber(){
		return phoneNumber;
	}
	
	public boolean getAuthenticated(){
		return authenticated;
	}
	
	public String getUserName(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
//setter methods for each var	
	public void setFirstName(){
		this.firstName=firstName;
	}
	
	public void setLastname(){
		this.lastName=lastName;
	}
	
	public void setEmail(){
		this.email=email;
	}
	
	public void setPhoneNumber(){
		this.phoneNumber=phoneNumber;
	}
	
	public void setAuthenticated(){
		this.authenticated=authenticated;
	}
	
	public void setUsername(){
		this.username=username;
	}
	
	public void setPassword(){
		this.password=password;
	}
//this is where we get the user object from the text file	
	public User getUser(){
		try{
			FileInputStream fileInput= new FileInputStream("user.txt");
			ObjectInputStream objectInput= new ObjectInputStream (fileInput);
			user=(User) objectInput.readObject();
			objectInput.close();
		}
		catch (IOException except){
			except.printStackTrace();
		}
		catch (ClassNotFoundException except){
			except.printStackTrace();
		}
		return user;
	}
}
