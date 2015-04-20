
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
   public Doctor(String docName, String docEmail,String docPhone, String docStreetAddress, 
		    String docCityStateAddress, String docPass, String docHospital, String docSecret, String docAnswer)
    {
        super(docName, docEmail, docPhone, docStreetAddress, docCityStateAddress, docPass);
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
    
    /*
    public void writeToFile()
    {
    	 String fileName = "doctor.bin";
         try{
         	ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
				os.writeObject(this);
				os.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();

         }
    }
    
    public Doctor readFromFile()
    {
    	String fileName = "doctor.bin";
    	Doctor doc = null;
    	try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
			try {
				doc = (Doctor)is.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				doc = null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return doc;
    }
    */
   
   

public static void main(String args[])
{
	 Doctor Grant = new Doctor("Grant West", "GrantMD@health.net", "6230005211", "0000 W Cure St.", "Tempe, AZ, 85281",  "catsrcool", "Software Hospital", "What is your mother's maiden name?", "Micham");
	 Doctor Nizar = new Doctor("Nizar Kury", "NizarMD@health.net", "6231111234", "9999 S Health Dr.", "Tempe, AZ, 85281", "ilovemonkeys", "Software Hospital", "Who was your childhood hero?", "Batman" );
	 Doctor Luis = new Doctor("Luis Saenz", "LuisMd@health.net", "6232225656", "5555 S Healing Ln.", 
			 "Tempe, AZ, 85281", "concoosion", "Software Hospital", "How much wood would a woodchuck chuck?", "5 woods" );
	ArrayList<Doctor> docList = new ArrayList<Doctor>();
	docList.add(Grant);
	docList.add(Nizar);
	docList.add(Luis);
	Serialize.serialize(docList, "src/doctor.bin");
	
	ArrayList<Doctor> print = Serialize.deserialize("src/doctor.bin");
	for(int i = 0; i < print.size(); i++)
	{
		System.out.println("Name = " + print.get(i).getname());
	}
}
}

		 



    
    
   

