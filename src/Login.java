/*
 * this is essentially the driver class of the software; it is the first interface the user
 * sees and drives the interactions with the rest of the interfaces
 */
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Grant
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
                        
    private void initComponents() {
    	//all GUI components
        login_main = new javax.swing.JPanel();
        loginHeader = new javax.swing.JLabel();
        loginSubHeader = new javax.swing.JLabel();
        doctorLoginButton = new javax.swing.JButton();
        patientLoginButton = new javax.swing.JButton();
        login_doctor = new javax.swing.JPanel();
        doctorLoginHeader = new javax.swing.JLabel();
        doctorLoginEmailLabel = new javax.swing.JLabel();
        doctorLoginPassLabel = new javax.swing.JLabel();
        doctorLoginEmailField = new javax.swing.JTextField();
        doctorLoginPassField = new javax.swing.JPasswordField();
        doctorLoginCancelButton = new javax.swing.JButton();
        doctorLoginSubmitButton = new javax.swing.JButton();
        doctorLoginErrorLabel = new javax.swing.JLabel();
        login_patient = new javax.swing.JPanel();
        patientLoginHeader = new javax.swing.JLabel();
        patientLoginEmailLabel = new javax.swing.JLabel();
        patientLoginPassLabel = new javax.swing.JLabel();
        patientLoginDoctorLabel = new javax.swing.JLabel();
        patientLoginEmailField = new javax.swing.JTextField();
        patientLoginDoctorField = new javax.swing.JTextField();
        patientLoginPassField = new javax.swing.JPasswordField();
        patientLoginCancelButton = new javax.swing.JButton();
        patientLoginSubmitButton = new javax.swing.JButton();
        patientLoginErrorLabel = new javax.swing.JLabel();
        
        //sets up the visual display of the login interface (lines 52-301)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 100, 100, 100));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new java.awt.CardLayout());

        login_main.setBackground(new java.awt.Color(204, 204, 255));
        login_main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 20));

        loginHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        loginHeader.setText("Efferent Patient Care");

        loginSubHeader.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loginSubHeader.setText("Login");

        doctorLoginButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorLoginButton.setText("Doctor");
        doctorLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginButtonActionPerformed(evt);
            }
        });

        patientLoginButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientLoginButton.setText("Patient");
        patientLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_mainLayout = new javax.swing.GroupLayout(login_main);
        login_main.setLayout(login_mainLayout);
        login_mainLayout.setHorizontalGroup(
            login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_mainLayout.createSequentialGroup()
                .addGroup(login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_mainLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(loginHeader))
                    .addGroup(login_mainLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(loginSubHeader))
                    .addGroup(login_mainLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(doctorLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(patientLoginButton)))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        login_mainLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {doctorLoginButton, patientLoginButton});

        login_mainLayout.setVerticalGroup(
            login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_mainLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(loginHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginSubHeader)
                .addGap(76, 76, 76)
                .addGroup(login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientLoginButton))
                .addContainerGap(439, Short.MAX_VALUE))
        );

        login_mainLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {doctorLoginButton, patientLoginButton});

        getContentPane().add(login_main, "card2");

        login_doctor.setBackground(new java.awt.Color(204, 204, 255));
        login_doctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 20));

        doctorLoginHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        doctorLoginHeader.setText("Doctor Login");

        doctorLoginEmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doctorLoginEmailLabel.setText("Email");

        doctorLoginPassLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doctorLoginPassLabel.setText("Password");

        doctorLoginCancelButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doctorLoginCancelButton.setText("Cancel");
        doctorLoginCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginCancelButtonActionPerformed(evt);
            }
        });

        doctorLoginSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doctorLoginSubmitButton.setText("Submit");
        doctorLoginSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginSubmitButtonActionPerformed(evt);
            }
        });

        doctorLoginErrorLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        doctorLoginErrorLabel.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout login_doctorLayout = new javax.swing.GroupLayout(login_doctor);
        login_doctor.setLayout(login_doctorLayout);
        login_doctorLayout.setHorizontalGroup(
            login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_doctorLayout.createSequentialGroup()
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_doctorLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(doctorLoginHeader))
                    .addGroup(login_doctorLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(login_doctorLayout.createSequentialGroup()
                                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorLoginEmailLabel)
                                    .addComponent(doctorLoginPassLabel))
                                .addGap(44, 44, 44)
                                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorLoginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorLoginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(login_doctorLayout.createSequentialGroup()
                                .addComponent(doctorLoginCancelButton)
                                .addGap(104, 104, 104)
                                .addComponent(doctorLoginSubmitButton))))
                    .addGroup(login_doctorLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(doctorLoginErrorLabel)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        login_doctorLayout.setVerticalGroup(
            login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_doctorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(doctorLoginHeader)
                .addGap(36, 36, 36)
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginEmailLabel)
                    .addComponent(doctorLoginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginPassLabel)
                    .addComponent(doctorLoginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(doctorLoginErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorLoginCancelButton)
                    .addComponent(doctorLoginSubmitButton))
                .addContainerGap(444, Short.MAX_VALUE))
        );

        getContentPane().add(login_doctor, "card3");

        login_patient.setBackground(new java.awt.Color(204, 204, 255));
        login_patient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 20));

        patientLoginHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        patientLoginHeader.setText("Patient Login");

        patientLoginEmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientLoginEmailLabel.setText("Email");

        patientLoginPassLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientLoginPassLabel.setText("Password");

        patientLoginDoctorLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientLoginDoctorLabel.setText("Doctor");

        patientLoginCancelButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientLoginCancelButton.setText("Cancel");
        patientLoginCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLoginCancelButtonActionPerformed(evt);
            }
        });

        patientLoginSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientLoginSubmitButton.setText("Submit");
        patientLoginSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLoginSubmitButtonActionPerformed(evt);
            }
        });

        patientLoginErrorLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        patientLoginErrorLabel.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout login_patientLayout = new javax.swing.GroupLayout(login_patient);
        login_patient.setLayout(login_patientLayout);
        login_patientLayout.setHorizontalGroup(
            login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_patientLayout.createSequentialGroup()
                .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_patientLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(patientLoginHeader))
                    .addGroup(login_patientLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(login_patientLayout.createSequentialGroup()
                                .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientLoginEmailLabel)
                                    .addComponent(patientLoginDoctorLabel)
                                    .addComponent(patientLoginPassLabel))
                                .addGap(81, 81, 81)
                                .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientLoginEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(patientLoginDoctorField)
                                    .addComponent(patientLoginPassField)))
                            .addGroup(login_patientLayout.createSequentialGroup()
                                .addComponent(patientLoginCancelButton)
                                .addGap(111, 111, 111)
                                .addComponent(patientLoginSubmitButton))))
                    .addGroup(login_patientLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(patientLoginErrorLabel)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        login_patientLayout.setVerticalGroup(
            login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_patientLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(patientLoginHeader)
                .addGap(26, 26, 26)
                .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLoginEmailLabel)
                    .addComponent(patientLoginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLoginDoctorLabel)
                    .addComponent(patientLoginDoctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLoginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientLoginPassLabel))
                .addGap(14, 14, 14)
                .addComponent(patientLoginErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLoginCancelButton)
                    .addComponent(patientLoginSubmitButton))
                .addContainerGap(448, Short.MAX_VALUE))
        );

        getContentPane().add(login_patient, "card4");

        pack();
    }                      

    //if the user is a doctor, chages to the doctor login screen
    private void doctorLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        login_main.setVisible(false);
        login_doctor.setVisible(true);
    }                                                 

    //cancels the login and returns to the main login interface
    private void doctorLoginCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	doctorLoginEmailField.setText("");
    	doctorLoginPassField.setText("");
    	doctorLoginErrorLabel.setText("");
        login_main.setVisible(true);
        login_doctor.setVisible(false);
    }                                                       
    
    //if the user is a patient, changes to the patient login screen
    private void patientLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        login_main.setVisible(false);
        login_patient.setVisible(true);
    }                                                  

    //cancels the login and return to the main login interface
    private void patientLoginCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	
        login_main.setVisible(true);
        login_patient.setVisible(false);
    }                                                        

    //allows patient to enter the system
    private void patientLoginSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         

        boolean knowsEmail = false;
        boolean knowsDoctor = false;
        boolean login = false;
    	patientLoginErrorLabel.setText("");
        // Patient Email and Doctor fields cannot be empty
        if(!patientLoginEmailField.getText().equals("") && !patientLoginDoctorField.getText().equals("")){
        	
        	// loads in the doctor list from the source doctor file
        	docList = Serialize.deserialize("src/doctor.bin");
        	if(docList != null){
        		// searches for the doctor the patient identified to therefore search for the patient
        		for(int i = 0; i < docList.size(); i++){
        			if(docList.get(i).getname().equalsIgnoreCase(patientLoginDoctorField.getText())){
        				knowsDoctor = true;
        				patientLoginDoctorField.setEditable(false);
        				for(int j = 0; j < docList.get(i).getPatientList().size(); j++){
        					// if doctor's patient matches email and password, then open patient gui
        					System.out.println(docList.get(i).getPatientList().get(j).getEmail());
        					if(docList.get(i).getPatientList().get(j).getEmail().equalsIgnoreCase(
        							patientLoginEmailField.getText()) && docList.get(i).getPatientList().
        							get(j).getPassword().equals(patientLoginPassField.getText())){
		        						Patient pat = docList.get(i).getPatientList().get(j);
		    							PatientUI patUI = new PatientUI(pat);
		    							patUI.setVisible(true);
		    							this.setVisible(false);
		    							this.dispose();
		    							login = true;
        					}
        					else if(docList.get(i).getPatientList().get(j).getEmail().equalsIgnoreCase(
        							patientLoginEmailField.getText())){
        						knowsEmail = true;
        						patientLoginEmailField.setEditable(false);
        						break;
        					}
        				
        				}
        			}
        		}
        		
        		if(!login){
	        		if(!knowsEmail && !knowsDoctor && patientCount < 5)
	        			javax.swing.JOptionPane.showMessageDialog(login_patient, "Email, doctor, and password entered incorrectly. Please try again.");
	        		else if(!knowsEmail && knowsDoctor && patientCount < 5)
	        			javax.swing.JOptionPane.showMessageDialog(login_patient, "Email and password entered incorrectly. Please try again.");
	        		else if(knowsEmail && patientCount < 5)
	        			javax.swing.JOptionPane.showMessageDialog(login_patient, "Email correct. Password entered incorrectly.");
	        		else if(patientCount >= 5)
	        			javax.swing.JOptionPane.showMessageDialog(login_patient, "Please call your doctor to recover email or password.");
	        	}
        		
				patientLoginPassField.setText(""); //clears the pass field
				patientCount++;
        		
        	}

        }
    }                                                        
    //allows doctor to enter the system
    private void doctorLoginSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {     
    	boolean knowsEmail = false;
    	boolean secret = true;
    	doctorLoginErrorLabel.setText("");	//clears the error label
    	if(!doctorLoginEmailField.getText().equals(""))	//if there is an email entered in the email field
        {
    		//loads in the list of doctors from the doctor file
    		docList = Serialize.deserialize("src/doctor.bin");
    		if(docList != null)	//makes sure doctor file is not empty
    		{
    			//searches every doctor in the list and compares info with user entered
    			//info to find a match
    			for(int i = 0; i < docList.size(); i++)	
    			{
    				
    				if(docList.get(i).getEmail().equalsIgnoreCase(doctorLoginEmailField.getText()) 
    						&& docList.get(i).getPassword().equals(doctorLoginPassField.getText()))
    						{
    						//if doctor is found, loads up the doctor interface
    							Doctor doc = docList.get(i);
    							DoctorUI docUI = new DoctorUI(doc);
    							docUI.setVisible(true);
    							this.setVisible(false);
    							this.dispose();
    							secret = false;
    						}
    				else if(count < 5 && docList.get(i).getEmail().equalsIgnoreCase(doctorLoginEmailField.getText())){
    					knowsEmail = true;
    					doctorLoginEmailField.setEditable(false);
    					break;
    				}
    				else if(count >= 5 && docList.get(i).getEmail().equalsIgnoreCase(doctorLoginEmailField.getText())){
    						if(docList.get(i).getPassword().equals(doctorLoginPassField.getText()) ||
    							docList.get(i).getAnswer().equalsIgnoreCase(doctorLoginPassField.getText())){
    						Doctor doc = docList.get(i);
							DoctorUI docUI = new DoctorUI(doc);
							docUI.setVisible(true);
							this.setVisible(false);
							this.dispose();
							secret = false;
    					}
    						else{
    							javax.swing.JOptionPane.showMessageDialog(login_doctor, "Too many failed attempts. As an alternative,"
    	    							+ " enter the answer to the following secret question in the password field:\n" + docList.get(i).getSecret());
    						secret = false;
    						System.out.println(docList.get(i).getAnswer());
    						}
    				}
    				
    			}
    			//doctor is not found, display error to use
    			if(!knowsEmail && secret)
    				javax.swing.JOptionPane.showMessageDialog(login_doctor, "Email and password entered incorrectly. Please try again.");
    			else if(knowsEmail && count < 5)
    				javax.swing.JOptionPane.showMessageDialog(login_doctor, "Correct email but incorrect password. Please enter another password.");
    			
				doctorLoginPassField.setText(""); //clears the pass field
				count++;
    		}
        }
    }
    //main method
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }

    // Variables declaration                
    private javax.swing.JButton doctorLoginButton;
    private javax.swing.JButton doctorLoginCancelButton;
    private javax.swing.JTextField doctorLoginEmailField;
    private javax.swing.JLabel doctorLoginEmailLabel;
    private javax.swing.JLabel doctorLoginErrorLabel;
    private javax.swing.JLabel doctorLoginHeader;
    private javax.swing.JPasswordField doctorLoginPassField;
    private javax.swing.JLabel doctorLoginPassLabel;
    private javax.swing.JButton doctorLoginSubmitButton;
    private javax.swing.JLabel loginHeader;
    private javax.swing.JLabel loginSubHeader;
    private javax.swing.JPanel login_doctor;
    private javax.swing.JPanel login_main;
    private javax.swing.JPanel login_patient;
    private javax.swing.JButton patientLoginButton;
    private javax.swing.JButton patientLoginCancelButton;
    private javax.swing.JTextField patientLoginDoctorField;
    private javax.swing.JLabel patientLoginDoctorLabel;
    private javax.swing.JTextField patientLoginEmailField;
    private javax.swing.JLabel patientLoginEmailLabel;
    private javax.swing.JLabel patientLoginErrorLabel;
    private javax.swing.JLabel patientLoginHeader;
    private javax.swing.JPasswordField patientLoginPassField;
    private javax.swing.JLabel patientLoginPassLabel;
    private javax.swing.JButton patientLoginSubmitButton;
    private ArrayList<Doctor> docList;
 	int count = 0; // for doctor login to prompt secret question
 	int patientCount = 0; // for patient login to prompt them to call doctor's phone number
    // End of variables declaration                   
}
