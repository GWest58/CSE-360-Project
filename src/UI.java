
public class UI {

	public static void main(String[] args) {
		// Login functionality
		
		// Login loginFrame = new Login();
		// login.setVisible(true);
		// login.getAuthentication()
		// OVERALL, WRITE METHODS IN PATIENT/DOCTOR/LOGIN UI that handles logic flow
	
	
		//if(login.getAuthenticated && login.isDoctor())
		PatientUI patientFrame = new PatientUI();
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
