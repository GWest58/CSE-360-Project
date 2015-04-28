import java.util.ArrayList;

// Patient class stores pharmacy, list of Symptoms, associated doctor, list of messages, and thresholds
// for each symptom (in this case, they are set by default to all 6's). Accessor methods and mutator methods
// are given and two functions are used to calculate whether or not a patient is problematic or severely
// problematic. 
public class Patient extends User {
	private Pharmacy pharmacy;				// associated pharmacy with prescriptions
	private ArrayList<Symptom> symptomList; // list of Symptoms with their associated level, date, etc.
	private Doctor associatedDoctor;		// doctor that is tied to this patient for finding patient in serializable file
	private ArrayList<String> messageList; // messages sent to patient from doctor.
											// structured like this: MM/DD/YYYY <Message>
								   			// Access date of message by doing message.substring(0, 11); 
											// Access message by doing message.substring(12, message.length());
	private int thresholds[]; // should be in a particular order. The symptomList should be in the same order, too
	
	// constructor for patient
	public Patient(String name, String email, String phoneNumber, String streetAddress, String cityStateAddress, String password, Pharmacy phar, Doctor doc){
		super(name, email, phoneNumber, streetAddress, cityStateAddress, password); //call the parent constructor to fill in those fields
		pharmacy = phar;
		associatedDoctor = doc;
		symptomList = new ArrayList<Symptom>();
		messageList = new ArrayList<String>();
		thresholds = new int[10];
	}
		
	// accessor method that retrieves pharmacy of patient
	public Pharmacy getPharmacy(){
		return pharmacy;
	}
	
	// accessor method that retrieves doctor of patient
	public Doctor getDoctor(){
		return associatedDoctor;
	}
	
	// accessor method that retrieves the list of messages
	public ArrayList<String> getMessageList(){
		return messageList;
	}
	
	// add a message to the list of messages
	public void addMessage(String message){
		// message should be in the form: MM/DD/YYYY <message>
		messageList.add(message);
	}
	
	// accessor method that retrieves the list of Symptoms
	public ArrayList<Symptom> getSymptoms(){
		return symptomList;
	}
	
	// adds a new symptom to the list of Symptoms
	public void newSymptom(String symptomName, int symptomLevel, String symptomDate){
		Symptom newSymptom = new Symptom(symptomName, symptomLevel, symptomDate);
		symptomList.add(newSymptom);
	}
	
	// instead of adding individual symptoms, this method just adds a whole symptomList to the patient
	public void newSymptomList(ArrayList<Symptom> newList){
		symptomList = newList;
	}
	
	// checks to see if the list of symptoms a patient has is empty
	public boolean isSymptomListEmpty(){
		return symptomList.size() <= 0;		
	}
	
	// checks to see if the date of the symptom is the same as the passed parameter. If so, return true.
	public boolean checkDate(String date){
		for(int i = 0; i < symptomList.size(); i++){
			if(symptomList.get(i).getDate().equals(date))
				return true;
		}
		return false;
	}
	
	// instead of adding idividual messages, adds a whole new list to the messages list (for saving)
	public void newMessageList(ArrayList<String> newList){
		messageList = newList;
	}
	
	// accessor method that returns a threshold at a given index
	public int getThreshold(int index){
		return thresholds[index];
	}
	
	// passes in an array of thresholds and sets it equal to a patient's threshold instance variable
	public void setThreshold(int newThresholds[]){
		thresholds = newThresholds;
	}
	
	// calculates the standard deviation of a patient's symptoms
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
	
	// checks to see if a patient is problematic. If they have less than 60 symptoms documented, then
	// if any of their symptoms is 2 above the flat threshold, they are problematic. If they have more than
	// 60 symptoms, if their symptom levels are 2 above the standard deviation, then they are problematic.
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
			
			// calc mean of symptomList levels

			int sum = 0;
			for(int i = 0; i < symptomList.size(); i++){
				sum += symptomList.get(i).getLevel();
			}
			double mean = (double)sum/symptomList.size();
			
			// checks to see if any symptom in the list is 2 above the standard deviation of the list
			for(int i = 0; i < symptomList.size(); i++){
				if(symptomList.get(i).getDate().equalsIgnoreCase(date)){
					if (symptomList.get(i).getLevel() >= mean + 2*calcStdDev())
						return true;
				}
			}
		}
		return false;
	}
	
	// checks to see if a patient is problematic. If they have less than 60 symptoms documented, then
	// if any of their symptoms is 3 above the flat threshold, they are severely problematic. If they have more
	// than 60 symptoms, if their symptom levels are 3 above the standard deviation, then they are
	// severely problematic.
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
			
			// calculate the mean of symptomList levels
			int sum = 0;
			for(int i = 0; i < symptomList.size(); i++){
				sum += symptomList.get(i).getLevel();
			}
			double mean = (double)sum/symptomList.size();
			
			// checks to see if one of the symptom levels is 3 above the standard deviation.
			for(int i = 0; i < symptomList.size(); i++){
				if(symptomList.get(i).getDate().equalsIgnoreCase(date)){
					if (symptomList.get(i).getLevel() >= mean + 3*calcStdDev())
						return true;
				}
			}
		}
		return false;
	}
	
}