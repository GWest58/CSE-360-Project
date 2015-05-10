import java.io.*;
import java.util.*;

/* Class used to read a write objects within the system into a 
 * serializable file
 */
public class Serialize {

	public static void serialize(ArrayList<Doctor> docList, String fileName)	//used to write doctor objects to the file.
	{
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))){
			os.writeObject(docList);
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
	
	public static ArrayList<Doctor> deserialize(String fileName)	//used to find and return doctor objects from the file
	{
		ArrayList<Doctor> docList = null;
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
			try {
				docList = (ArrayList<Doctor>)is.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return docList;
	}
	
	
}

	
