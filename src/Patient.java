import java.util.ArrayList;


public class Patient extends User {
	String address;
	Pharmacy pharmacy;
	ArrayList<Symptom> symptomList;
	
	Patient(String fN, String lN, String pN, String addr, String eM, String pW, Pharmacy phar){
		super(fN, lN, pN, eM, pW); //call the parent constructor to fill in those fields
		address = addr;
		pharmacy = phar;
	}
	
	String getAddress(){
		return address;
	}
	
	Pharmacy getPharmacy(){
		return pharmacy;
	}
	
	void changeAddress(String newAddr){
		address = newAddr;
	}
	
	void viewSubmissionHistory(){	
		// call the Patient UI class
	}
	
	void newSymptom(String symptomName, int symptomLevel, String symptomDate){
		Symptom newSymptom = new Symptom(symptomName, symptomLevel, symptomDate);
		symptomList.add(newSymptom);
	}
}