
public class UI {

	public static void main(String[] args) {
		// Login functionality
		
		// Login loginFrame = new Login();
		// login.setVisible(true);
		// login.getAuthentication()
		// OVERALL, WRITE METHODS IN PATIENT/DOCTOR/LOGIN UI that handles logic flow
		//PatientUI patientFrame = new PatientUI();
		
		//if(login.getAuthenticated && login.isDoctor())
		PatientUI patientFrame = new PatientUI();
		patientFrame.setVisible(true);
		/*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientUI().setVisible(true);
            }
        });*/
		
		  java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new DoctorUI().setVisible(true);
	            }
	        });
	}

}