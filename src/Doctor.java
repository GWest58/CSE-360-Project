/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grant
 */
import java.util.*;
public class Doctor {
    private String name, email, address, phone, hospital, pass, secretQuestion, secretAnswer;
    //private ArrayList<Patient> patientList;
    
    public Doctor()
    {
        name = null;
        email = null;
        address = null;
        phone = null;
        hospital = null;
        pass = null;
        secretQuestion = null;
        secretAnswer = null;
       // patientList = new ArrayList<Patient>();
    }
    
    public Doctor(String docName, String docEmail, String docAddress, 
            String docPhone, String docHospital, String docPass, String docSecret, String docAnswer)
    {
        name = docName;
        email = docEmail;
        address = docAddress;
        phone = docPhone;
        hospital = docHospital;
        pass = docPass;
        secretQuestion = docSecret;
        secretAnswer = docAnswer;
        //patientList = new ArrayList<Patient>();
    }
    
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
