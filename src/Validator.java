
public class Validator {
	
	//checks to make sure the email being checked is a vaild email based on the standards in the method
	 public static boolean isEmail(String check){
	    	int count = 0;
	    	for(int i = 0; i < check.length(); i++){
	    		if(check.substring(i, i+1).compareTo("@") == 0) //contains an @ character
	    			count++;
	    	}
	    	
	    	if(count == 1){
	    		if(check.length() <= 10)
	    			return false;
	    		else{
	    			//makes sure ending matches one of these internet protocols
		    		if(check.substring(check.length()-4, check.length()).compareTo(".com") == 0 ||
		    				check.substring(check.length()-4, check.length()).compareTo(".net") == 0 ||
		    				check.substring(check.length()-4, check.length()).compareTo(".org") == 0||
		    				check.substring(check.length()-4, check.length()).compareTo(".edu") == 0 ||
		    				check.substring(check.length()-4, check.length()).compareTo(".gov") == 0 ||
		    				check.substring(check.length()-4, check.length()).compareTo(".mil") == 0 ||
		    				check.substring(check.length()-4, check.length()).compareTo(".int") == 0)
		    					return true;
		    		else
		    			return false;
	    		}
	    	}
	    	else
	    		return false;
	    }
	    
	 //makes sure the phone number being checked is a valid phone number (contains 10 integers)
	    public static boolean isPhone(String check){
	    	if(check.length() != 10)
	    		return false;
	    	else{
	    		for(int i = 0; i < check.length(); i++){
	    			if(!check.substring(i, i+1).equals("0") &&
	    					!check.substring(i, i+1).equals("1") &&
	    					!check.substring(i, i+1).equals("2") &&
	    					!check.substring(i, i+1).equals("3") &&
	    					!check.substring(i, i+1).equals("4") &&
	    					!check.substring(i, i+1).equals("5") &&
	    					!check.substring(i, i+1).equals("6") &&
	    					!check.substring(i, i+1).equals("7") &&
	    					!check.substring(i, i+1).equals("8") &&
	    					!check.substring(i, i+1).equals("9"))
	    				return false;    					
	    		}
	    		return true;
	    	}
	    }
}
