/*Symptoms class: to be used  by patient class, controlled by Patient UI/Symptoms Tab
 * Author: Alexandra Nazareno
 * First created: 4/17/15
 * Last Revised: 4/17/15
 * 
 */

import java.util.ArrayList;
import java.lang.Math;
import java.util.*;
import java.io.Serializable;

// the Symptoms class implements serializable because when a patient submits their symptoms, it must
// save the symptoms in the serializable file as well
public class Symptom implements Serializable {
	String name;
	int level;
	String date;
	
	//constructor
	Symptom(String n, int l, String d){
		name = n;
		level =  l;
		date = d;

	}
	
	//accessor methods
	public String getName(){
		return name;
	}
	
	public int getLevel(){
		return level;
	}
	
	public String getDate(){
		return date;
	}
	
	//mutator methods
	public void setName(String newName){
		name = newName;
	}
	
	public void setLevel(int newLevel){
		level = newLevel;
	}
	
	public void setDate(String newDate){
		date = newDate;
	}
}
