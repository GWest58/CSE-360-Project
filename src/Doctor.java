
/**
 *
 * @author Grant
 */
//contains the Doctor object and all methods to access and modify doctor attributes
import java.util.*;
import java.io.*;
public class Doctor extends User {
    private String  hospital, secretQuestion, secretAnswer;
    private ArrayList<Patient> patientList;
    
    //constructor
   public Doctor(String docName, String docEmail,String docPhone, String docAddress, 
		    String docPass, String docHospital, String docSecret, String docAnswer)
    {
        super(docName, docEmail, docPhone, docAddress, docPass);
        hospital = docHospital;
        secretQuestion = docSecret;
        secretAnswer = docAnswer;
        patientList = new ArrayList<Patient>();
       
        
        
    }
    
   //accessor methods for all data
 
    public String getHospital()
    {
        return hospital;
    }
    public String getSecret()
    {
        return secretQuestion;
    }
    
    public String getAnswer()
    {
        return secretAnswer;
    }
    public ArrayList<Patient> getPatientList()
    {
    	return patientList;
    }
    
    //mutator methods
    public void setHospital(String changeHospital)
    {
        hospital = changeHospital;
    }
    
    public void setSecret(String changeSecret)
    {
        secretQuestion = changeSecret;
    }
    
    public void setAnswer(String changeAnswer)
    {
        secretAnswer = changeAnswer;
    }
    public void registerPatient(Patient newPatient)
    {
    	patientList.add(newPatient);
    }
    public void writeToFile(Doctor doc)
    {
    	 String fileName = "doctor.bin";
         try{
         	ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
				os.writeObject(doc);
				os.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();

         }
    }
    
}
    
    
   

