import java.util.ArrayList;


public class Patient extends User {
	private Pharmacy pharmacy;
	private ArrayList<Symptom> symptomList;
	private Doctor associatedDoctor;
	private ArrayList<String> messageList; // messages sent to patient from doctor.
											// structured like this: MM/DD/YYYY <Message>
								   			// Access date of message by doing message.substring(0, 11); 
											// Access message by doing message.substring(12, message.length());
	private int thresholds[]; // should be in a particular order. The symptomList should be in the same order, too
	
	public Patient(String name, String email, String phoneNumber, String streetAddress, String cityStateAddress, String password, Pharmacy phar, Doctor doc){
		super(name, email, phoneNumber, streetAddress, cityStateAddress, password); //call the parent constructor to fill in those fields
		pharmacy = phar;
		associatedDoctor = doc;
		symptomList = new ArrayList<Symptom>();
		messageList = new ArrayList<String>();
		thresholds = new int[10];
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
	
	public ArrayList<Symptom> getSymptoms(){
		return symptomList;
	}
	
	public void newSymptom(String symptomName, int symptomLevel, String symptomDate){
		Symptom newSymptom = new Symptom(symptomName, symptomLevel, symptomDate);
		symptomList.add(newSymptom);
	}
	
	public int getThreshold(int index){
		return thresholds[index];
	}
	
	public void setThreshold(int newThresholds[]){
		thresholds = newThresholds;
	}
	
	
	private double calcStdDev(){//NEW
		double sum=0;
		double mean;
		double sigma = 0.0;
		double var, stddev;
		
		for(int i = 0; i < symptomList.size(); i++){
			sum += symptomList.get(i).getLevel();
		}
		
			
		mean = sum / symptomList.size();
		
		for(int i = 0; i < symptomList.size(); i++){
			sigma += Math.pow((Math.abs(mean-symptomList.get(i).getLevel())), 2);
		}
		
		
		var = sigma / (double)symptomList.size();
		
		stddev = Math.sqrt(var);
		return stddev;
	}
	
	boolean isProblematic(String date){
		int thresholdIndex = -1; // starts off as -1 because we are going to add 1 anyways
		if (symptomList.size() < 60){
			for(int i = 0; i < symptomList.size(); i++){
				if(symptomList.get(i).getDate().equalsIgnoreCase(date)){
					thresholdIndex++;
					if (symptomList.get(i).getLevel() >= thresholds[thresholdIndex]  + 2)
						return true;
				}
			}
		}
		else{ //calc standard deviation
			for(int i = 0; i < symptomList.size(); i++){
				if(symptomList.get(i).getDate().equalsIgnoreCase(date)){
					if (symptomList.get(i).getLevel() >= 2*calcStdDev())
						return true;
				}
			}
		}
		return false;
	}
	
	boolean isSeverelyProblematic(String date){//NEW
		int thresholdIndex = -1; // starts off as -1 because we are going to add 1 anyways
		if (symptomList.size() < 60){
			for(int i = 0; i < symptomList.size(); i++){
				if(symptomList.get(i).getDate().equalsIgnoreCase(date)){
					thresholdIndex++;
					if (symptomList.get(i).getLevel() >= thresholds[thresholdIndex]  + 3)
						return true;
				}
			}
		}
		else{ //calc standard deviation
			for(int i = 0; i < symptomList.size(); i++){
				if(symptomList.get(i).getDate().equalsIgnoreCase(date)){
					if (symptomList.get(i).getLevel() >= 3*calcStdDev())
						return true;
				}
			}
		}
		return false;
	}
	
}