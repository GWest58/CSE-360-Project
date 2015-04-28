import java.io.Serializable;

// class responsible for holding the information of a prescription with its accessor and mutator methods
public class Prescription implements Serializable{
  
	private String name;
	private int frequency;
	private double dose;
	
	public Prescription(String nm, int freq, double dos){
		name = nm;
		frequency = freq;
		dose = dos;
	}//constructor
	
	public String getName(){
		return name;
	}
	
	public int getFrequency(){
		return frequency;
	}
	
	public double getDose(){
		return dose;
	}
	
	public void changeName(String nm){
		name = nm;
	}
	
	public void changeFrequency(int newFreq){
		frequency = newFreq;
	}
	
	public void changeDose(int newDose){
		dose = newDose;
	}
}
