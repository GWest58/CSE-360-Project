import java.io.Serializable;

public class Pharmacy implements Serializable{

	public static final int MAX_PRESCRIPTIONS = 20;
	
	private
		String name;
		String address;
		String phoneNum;
		Prescription prescriptionList[];
		
	public Pharmacy(String nm, String addr, String phone){
		name = nm;
		address = addr;
		phoneNum = phone;
		prescriptionList = new Prescription[MAX_PRESCRIPTIONS];
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
	
	public void changeName(String newName){
		name = newName;
	}
	
	public void changeAddr(String newAddr){
		address = newAddr;
	}
	
	public void changePhone(String newPh){
		phoneNum = newPh;
	}
	
	public void newPrescription(String name, int frequency, int dose, int index){
		prescriptionList[index] = new Prescription(name, frequency, dose);
		
	}
}