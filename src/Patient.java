import java.util.ArrayList;


public class Patient extends User {
	private Pharmacy pharmacy;
	private ArrayList<Symptom> symptomList;
	private Doctor associatedDoctor;
	private ArrayList<String> messageList; // messages sent to patient from doctor.
											// structured like this: MM/DD/YYYY <Message>
								   			// Access date of message by doing message.substring(0, 11); 
											// Access message by doing message.substring(12, message.length());
	
	public Patient(String name, String email, String phoneNumber, String streetAddress, String cityStateAddress, String password, Pharmacy phar, Doctor doc){
		super(name, email, phoneNumber, streetAddress, cityStateAddress, password); //call the parent constructor to fill in those fields
		pharmacy = phar;
		associatedDoctor = doc;
		messageList = new ArrayList<String>();
	}
		
	public Pharmacy getPharmacy(){
		return pharmacy;
	}
	
	public Doctor getDoctor(){
		return associatedDoctor;
	}
	
	public ArrayList<String> getMessageList(){
		return messageList;
	}
	
	public void addMessage(String message){
		// message should be in the form: MM/DD/YYYY <message>
		messageList.add(message);
	}
	public void newSymptom(String symptomName, int symptomLevel, String symptomDate){
		Symptom newSymptom = new Symptom(symptomName, symptomLevel, symptomDate);
		symptomList.add(newSymptom);
	}
}