
/**
 *
 * @author Grant
 */
//contains the Doctor object and all methods to access and modify doctor attributes
import java.util.*;
public class Doctor extends User {
    private String name, email, phone, address, hospital, pass, secretQuestion, secretAnswer;
    //private ArrayList<Patient> patientList;
    
    //constructor
   public Doctor(String docName, String docEmail,String docPhone, String docAddress, 
		    String docPass, String docHospital, String docSecret, String docAnswer)
    {
        super(docName, docEmail, docPhone, docAddress, docPass);
        hospital = docHospital;
        secretQuestion = docSecret;
        secretAnswer = docAnswer;
        //patientList = new ArrayList<Patient>();
    }
    
   //accessor methods for all data
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getHospital()
    {
        return hospital;
    }
    
    public String getPass()
    {
        return pass;
    }
    public String getSecret()
    {
        return secretQuestion;
    }
    
    public String getAnswer()
    {
        return secretAnswer;
    }
    
    //mutator methods for all data
     public void setName(String changeName)
    {
        name = changeName;
    }
    
    public void setEmail(String changeEmail)
    {
        email = changeEmail;
    }
    
    public void setAddress(String changeAddress)
    {
        address = changeAddress;
    }
    
    public void setPhone(String changePhone)
    {
        phone = changePhone;
    }
    
    public void setHospital(String changeHospital)
    {
        hospital = changeHospital;
    }
    
    public void setPass(String changePass)
    {
        pass = changePass;
    }
    public void setSecret(String changeSecret)
    {
        secretQuestion = changeSecret;
    }
    
    public void setAnswer(String changeAnswer)
    {
        secretAnswer = changeAnswer;
    }
}
    
    /*public void registerPatient(Patient addPatient)
    {
        patientList.add(new Patient(...));
    }
   
}*/
