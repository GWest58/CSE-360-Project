import java.util.ArrayList;


public class Patient extends User {
	Pharmacy pharmacy;
	ArrayList<Symptom> symptomList;
	Doctor associatedDoctor;
	
	Patient(String name, String email, String phoneNumber, String address, String password, Pharmacy phar, Doctor doc){
		super(name, email, phoneNumber, address, password); //call the parent constructor to fill in those fields
		pharmacy = phar;
		associatedDoctor = doc;
	}
		
	Pharmacy getPharmacy(){
		return pharmacy;
	}
	
	Doctor getDoctor(){
		return associatedDoctor;
	}
	
	void newSymptom(String symptomName, int symptomLevel, String symptomDate){
		Symptom newSymptom = new Symptom(symptomName, symptomLevel, symptomDate);
		symptomList.add(newSymptom);
	}
}