import java.io.Serializable;
<<<<<<< HEAD
=======
import java.util.ArrayList;

>>>>>>> 6456ade9ae41c4a71b1715c91603abed1669519a
public class Pharmacy implements Serializable{

	public static final int MAX_PRESCRIPTIONS = 20;
	
	private
		String name;
		String address;
		String phoneNum;
	    ArrayList<Prescription> prescriptionList;
		
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
	
	public void newPrescription(String name, int frequency, int dose){
		Prescription newPrescription = new Prescription(name, frequency, dose);
		prescriptionList.add(newPrescription);
		
	}
}