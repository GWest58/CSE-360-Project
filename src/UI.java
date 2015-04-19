
public class UI {

	public static void main(String[] args) {
		// Login functionality
		
		// Login loginFrame = new Login();
		// login.setVisible(true);
		// login.getAuthentication()
		// OVERALL, WRITE METHODS IN PATIENT/DOCTOR/LOGIN UI that handles logic flow
	
	
		//if(login.getAuthenticated && login.isDoctor())
		
		// for testing-- IT WORKS!
		Doctor doc = new Doctor("Bob", "Bob@yahoo.com", "9516 W Bob St", "Avondale, AZ, 85392", "623-000-9999", 
	    		"Bob's Hope Hospital", "testingGit", "What is your mother's maiden name?", "Bobington");
		Pharmacy testing = new Pharmacy("Walgreens", "Avondale, AZ, 85392", "6235652645");
		Patient test = new Patient("Nizar Kury", "nkury@asu.edu", "6235652645", "1901 N. 104th AVE.", 
				"Avondale, AZ, 85392", "password", testing, doc);
		
		PatientUI patientFrame = new PatientUI(test);
		patientFrame.setVisible(true);
		/*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientUI().setVisible(true);
            }
        });*/
		
		// probably pass in the doctor read in from the login screen
		DoctorUI doctorFrame = new DoctorUI();
		doctorFrame.setVisible(true);
	}

}
