import java.io.*;
public class Serialize {

	public void serialize(Doctor doc, String fileName)	//used to write doctor objects to the file.
	{
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))){
			os.writeObject(doc);
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
	
	public Doctor deserialize(String email, String pass, String fileName)	//used to find and return doctor objects from the file
	{
		Doctor doc = null;
		boolean found = false;
		try{
		 ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
		 boolean run = true;
		 try{
		 while(run)
		 {
			 doc = (Doctor)is.readObject();
			 if(doc.getEmail().equalsIgnoreCase(email))	//doc with matching email found
			 {
				 if(doc.getPassword().equals(pass))		//doctor with matching pass found
				 {
					 run = false;	
					 found = true;
				 }
			 }
		 }
		 }catch(EOFException ex){
			 found = false;
		 }
	 }catch(Exception ex){
		 ex.printStackTrace();
	 
	 }
		if(found)	//return the doctor if it was found, else it returns null;
		{
			return doc;
		}
		else
		{
			return null;
		}
	}
	
}

	
