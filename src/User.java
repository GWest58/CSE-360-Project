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
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String password;
	
	public User(String name,  String email, String phoneNumber, String address, String password){
//constructor method		
		this.name=name;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.password=password;
	}
//getter methods for each var	
	public String getname(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPassword(){
		return password;
	}
//setter methods for each var	
	public void setName(String name){
		this.name=name;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
//this is where we get the user object from the text file	
	public User getUser(){
		User user = null;
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
