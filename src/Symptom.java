/*Symptoms class: to be used  by patient class, controlled by Patient UI/Symptoms Tab
 * Author: Alexandra Nazareno
 * First created: 4/17/15
 * Last Revised: 4/17/15
 * 
 */

import java.util.ArrayList;
import java.lang.Math;
import java.util.*;
public class Symptom {
	String name;
	int level;
	String date;
	int threshhold;
	ArrayList<Integer> levelList =  new ArrayList<Integer>(); //NEW
	int stddev;//NEW
	
	//constructor
	Symptom(String n, int l, String d){
		name = n;
		level =  l;
		date = d;
		levelList.add(level); 
	}
	
	double calcStdDev(){//NEW
		double sum=0;
		double mean;
		double sigma = 0.0;
		double var, stddev;
		
		for(int e: levelList){
			sum += e; 
		}
		
		mean = sum / levelList.size();
		
		for(int e: levelList){
			sigma += Math.pow((Math.abs(mean-e)), 2);
		}
		
		var = sigma / (double)levelList.size();
		
		stddev = Math.sqrt(var);
		return stddev;
	}
	
	boolean isProblematic(){
		if (levelList.size() < 60){
			if (level == threshhold + 2)
				return true;
		}
		else{ //calc standard deviation
			if (level == 2*calcStdDev())
				return true;
		}
		return false;
	}
	
	boolean isSeverelyProblematic(){//NEW
		if (levelList.size() < 60){
			if (level >= threshhold + 3){
				return true;
			}
		}
		else{
			if (level >= 3*calcStdDev()){
				return true;
			}
		}
		
		return false;
	}
	
	void setThreshhold(int setting){//doctor determined threshhold
		if (levelList.size() < 60){
			threshhold = setting;
		}
	}
	
	void setSymptomLevel(int l){
		level = l;
		levelList.add(l);
	}
}
