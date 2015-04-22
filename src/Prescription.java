import java.io.Serializable;

public class Prescription implements Serializable{
  
	private String name;
	private int frequency;
	private int dose;
	
	public Prescription(String nm, int freq, int dos){
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
	
	public int getDose(){
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
