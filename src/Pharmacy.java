import java.io.Serializable;
import java.util.ArrayList;

// the class is responsible for storing the pharmacy information like name, address, and phone number as well
// as hold a list of prescriptions assigned to a patient.
public class Pharmacy implements Serializable{
	
	private
		String name;
		String address;
		String phoneNum;
	    ArrayList<Prescription> prescriptionList; // list of prescriptions that are assigned to the patient
	
	// constructor of Pharmacy	
	public Pharmacy(String nm, String addr, String phone){
		name = nm;
		address = addr;
		phoneNum = phone;
		prescriptionList = new ArrayList<Prescription>();
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}

	public String getPhone(){
		return phoneNum;
	}
	
	public ArrayList<Prescription> getPrescriptions(){
		return prescriptionList;
	}
	
	public void changeName(String newName){
		name = newName;
	}
	
	public void changeAddr(String newAddr){
		address = newAddr;
	}
	
	public void changePhone(String newPh){
		phoneNum = newPh;
	}
	
	// adds a new prescription by taking in the information as a parameter such as name, frequency, and dose.
	public void newPrescription(String name, int frequency, double dose){
		Prescription newPrescription = new Prescription(name, frequency, dose);
		prescriptionList.add(newPrescription);
		
	}
}