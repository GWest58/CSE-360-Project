import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.ListModel;

/**
 *
 * @author grant_000
 */
public class DoctorUI extends javax.swing.JFrame {

	/**
     * Creates new form DoctorUI
     */
    public DoctorUI(Doctor doc) {
        initComponents(doc);
    }

    @SuppressWarnings("unchecked")                       
    private void initComponents(Doctor doc) {
    	
    	// all gui components
        DoctorUIMain = new javax.swing.JTabbedPane();
        viewPatientListTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nonSeverePatientList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        mildlySeverePatientList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        severePatientList = new javax.swing.JList();
        editPatientButton = new javax.swing.JButton();
        nonSeverePatientLabel = new javax.swing.JLabel();
        mildlySeverePatientLabel = new javax.swing.JLabel();
        severePatientLabel = new javax.swing.JLabel();
        editProfileTab = new javax.swing.JPanel();
        doctorNameLabel = new javax.swing.JLabel();
        doctorEmailLabel = new javax.swing.JLabel();
        doctorAddressLabel = new javax.swing.JLabel();
        doctorPhoneLabel = new javax.swing.JLabel();
        doctorHospitalLabel = new javax.swing.JLabel();
        doctorSecretLabel = new javax.swing.JLabel();
        doctorAnswerLabel = new javax.swing.JLabel();
        doctorPassLabel = new javax.swing.JLabel();
        doctorConfirmLabel = new javax.swing.JLabel();
        doctorNameField = new javax.swing.JTextField();
        doctorEmailField = new javax.swing.JTextField();
        doctorStreetField = new javax.swing.JTextField();
        doctorPhoneField = new javax.swing.JTextField();
        doctorHospitalField = new javax.swing.JTextField();
        doctorEditProfileHeader = new javax.swing.JLabel();
        doctorSecretField = new javax.swing.JTextField();
        doctorAnswerField = new javax.swing.JTextField();
        doctorSubmitButton = new javax.swing.JButton();
        doctorPassField = new javax.swing.JPasswordField();
        doctorConfirmField = new javax.swing.JPasswordField();
        doctorCurrentName = new javax.swing.JLabel();
        doctorCurrentEmail = new javax.swing.JLabel();
        doctorCurrentStreetAddress = new javax.swing.JLabel();
        doctorCurrentPhone = new javax.swing.JLabel();
        doctorCurrentHospital = new javax.swing.JLabel();
        doctorCurrentSecret = new javax.swing.JLabel();
        doctorCurrentAnswer = new javax.swing.JLabel();
        doctorCurrentCityStateAddress = new javax.swing.JLabel();
        doctorCityStateField = new javax.swing.JTextField();
        doctorCurrentCityState = new javax.swing.JLabel();
        EditPatientPage = new javax.swing.JPanel();
        editPatientPageHeader = new javax.swing.JLabel();
        patientNameLabel = new javax.swing.JLabel();
        patientEmailLabel = new javax.swing.JLabel();
        patientStreetAddressLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientCityStateAddressLabel = new javax.swing.JLabel();
        patientPhoneLabel = new javax.swing.JLabel();
        patientPassLabel = new javax.swing.JLabel();
        patientConfirmLabel = new javax.swing.JLabel();
        patientNameField = new javax.swing.JTextField();
        patientEmailField = new javax.swing.JTextField();
        patientStreetField = new javax.swing.JTextField();
        patientCityStateField = new javax.swing.JTextField();
        patientPhoneField = new javax.swing.JTextField();
        patientPassField = new javax.swing.JPasswordField();
        patientConfirmField = new javax.swing.JPasswordField();
        patientRemoveButton = new javax.swing.JButton();
        patientAddButton = new javax.swing.JButton();
        editPatientCancelButton = new javax.swing.JButton();
        
        //adds the patients to the corresponding J lists
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        //check if submitting symptoms within specified time frame
        Date date = new Date();
        today = dateFormat.format(date);
        
        //adds all patients in the doctor list into their corresponding jlists
        for(int i = 0; i < doc.getPatientList().size(); i++)
        {
        	Patient temp = doc.getPatientList().get(i);
        	
        	if(temp.isProblematic(today))
        	{
        		if(temp.isSeverelyProblematic(today))
        		{
        			severeListModel.addElement(temp.getname());
        		}
        		
        		else
        		{
        			mildlySevereListModel.addElement(temp.getname());
        		}
        	}
        	else
        		nonSevereListModel.addElement(temp.getname());
        }
        
        
        //	Code for GUI visual displays (lines 122-593)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        DoctorUIMain.setBackground(new java.awt.Color(0, 51, 255));

        viewPatientListTab.setBackground(new java.awt.Color(204, 204, 255));

        nonSeverePatientList.setBackground(new java.awt.Color(51, 204, 0));
        nonSeverePatientList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nonSeverePatientList.setModel(nonSevereListModel);
        nonSeverePatientList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                nonSeverePatientListValueChanged(evt, doc);
            }
        });
        jScrollPane1.setViewportView(nonSeverePatientList);

        severePatientList.setBackground(new java.awt.Color(255, 0, 0));
        severePatientList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        severePatientList.setModel(severeListModel);
          
        severePatientList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                severePatientListValueChanged(evt, doc);
            }
        });
        jScrollPane2.setViewportView(severePatientList);

        mildlySeverePatientList.setBackground(new java.awt.Color(255, 255, 0));
        mildlySeverePatientList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mildlySeverePatientList.setModel(mildlySevereListModel);
        mildlySeverePatientList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                mildlySeverePatientListValueChanged(evt, doc);
            }
        });
        jScrollPane3.setViewportView(mildlySeverePatientList);

        editPatientButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editPatientButton.setText("Edit Patient List");
        editPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientButtonActionPerformed(evt);
            }
        });

        nonSeverePatientLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nonSeverePatientLabel.setForeground(new java.awt.Color(0, 204, 0));
        nonSeverePatientLabel.setText("Non-Severe Patients");

        mildlySeverePatientLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mildlySeverePatientLabel.setForeground(new java.awt.Color(255, 255, 0));
        mildlySeverePatientLabel.setText("Mildly-Severe Patients");

        severePatientLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        severePatientLabel.setForeground(new java.awt.Color(255, 0, 0));
        severePatientLabel.setText("Severe Patients");

        javax.swing.GroupLayout viewPatientListTabLayout = new javax.swing.GroupLayout(viewPatientListTab);
        viewPatientListTab.setLayout(viewPatientListTabLayout);
        viewPatientListTabLayout.setHorizontalGroup(
            viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPatientListTabLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(nonSeverePatientLabel)
                .addGap(226, 226, 226)
                .addComponent(mildlySeverePatientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(severePatientLabel)
                .addGap(106, 106, 106))
            .addGroup(viewPatientListTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(viewPatientListTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPatientListTabLayout.createSequentialGroup()
                        .addComponent(editPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewPatientListTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        viewPatientListTabLayout.setVerticalGroup(
            viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPatientListTabLayout.createSequentialGroup()
                .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPatientListTabLayout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addComponent(severePatientLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPatientListTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nonSeverePatientLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mildlySeverePatientLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(editPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        viewPatientListTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        DoctorUIMain.addTab("View Patient List", viewPatientListTab);

        editProfileTab.setBackground(new java.awt.Color(204, 204, 255));

        doctorNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorNameLabel.setText("Name");

        doctorEmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorEmailLabel.setText("Email");

        doctorAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorAddressLabel.setText("Address");

        doctorPhoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorPhoneLabel.setText("Phone");

        doctorHospitalLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorHospitalLabel.setText("Hospital");

        doctorSecretLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorSecretLabel.setText("Secret Question");

        doctorAnswerLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorAnswerLabel.setText("Secret Question Answer");

        doctorPassLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorPassLabel.setText("Password");

        doctorConfirmLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorConfirmLabel.setText("Confirm Password");

        doctorEditProfileHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        doctorEditProfileHeader.setText("Edit Doctor Information");

        doctorSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doctorSubmitButton.setText("Submit");
        doctorSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorSubmitButtonActionPerformed(evt, doc);
            }
        });

        doctorCurrentName.setText(doc.getname());

        doctorCurrentEmail.setText(doc.getEmail());

        doctorCurrentStreetAddress.setText(doc.getStreetAddress());
        
        doctorCurrentPhone.setText("(" + doc.getPhoneNumber().substring(0, 3) + 
        		") " + doc.getPhoneNumber().substring(3, 6) + "-" + doc.getPhoneNumber().
        		substring(6, doc.getPhoneNumber().length()));
  
        doctorCurrentHospital.setText(doc.getHospital());

        doctorCurrentSecret.setText(doc.getSecret());

        doctorCurrentAnswer.setText(doc.getAnswer());

        doctorCurrentCityStateAddress.setText(doc.getCityStateAddress());
        
        javax.swing.GroupLayout editProfileTabLayout = new javax.swing.GroupLayout(editProfileTab);
        editProfileTab.setLayout(editProfileTabLayout);
        editProfileTabLayout.setHorizontalGroup(
            editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProfileTabLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editProfileTabLayout.createSequentialGroup()
                        .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorAnswerLabel)
                                .addGap(18, 18, 18)
                                .addComponent(doctorCurrentAnswer))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorHospitalLabel)
                                .addGap(18, 18, 18)
                                .addComponent(doctorCurrentHospital))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorSecretLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doctorCurrentSecret))
                            .addComponent(doctorPassLabel)
                            .addComponent(doctorConfirmLabel)
                            .addComponent(doctorCurrentCityState)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorPhoneLabel)
                                .addGap(18, 18, 18)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorCurrentCityStateAddress)
                                    .addComponent(doctorCurrentPhone))))
                        .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorAnswerField)
                                    .addComponent(doctorConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(doctorHospitalField)
                                        .addComponent(doctorPhoneField)
                                        .addComponent(doctorSecretField)))
                                .addGap(232, 232, 232))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doctorEmailField)
                                    .addComponent(doctorStreetField)
                                    .addComponent(doctorNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(doctorCityStateField))
                                .addContainerGap(232, Short.MAX_VALUE))))
                    .addGroup(editProfileTabLayout.createSequentialGroup()
                        .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorCurrentStreetAddress))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorNameLabel)
                                    .addComponent(doctorEmailLabel))
                                .addGap(23, 23, 23)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorCurrentName)
                                    .addComponent(doctorCurrentEmail))))
                        .addContainerGap())))
            .addGroup(editProfileTabLayout.createSequentialGroup()
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editProfileTabLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(doctorEditProfileHeader))
                    .addGroup(editProfileTabLayout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(doctorSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        editProfileTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {doctorAnswerField, doctorEmailField, doctorHospitalField, doctorNameField, doctorPhoneField, doctorSecretField, doctorStreetField});

        editProfileTabLayout.setVerticalGroup(
            editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProfileTabLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(doctorEditProfileHeader)
                .addGap(51, 51, 51)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorNameLabel)
                    .addComponent(doctorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorEmailLabel)
                    .addComponent(doctorEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorAddressLabel)
                    .addComponent(doctorStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentStreetAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorCurrentCityStateAddress)
                    .addComponent(doctorCityStateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentCityState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorPhoneLabel)
                    .addComponent(doctorPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorHospitalLabel)
                    .addComponent(doctorHospitalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentHospital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorSecretLabel)
                    .addComponent(doctorSecretField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentSecret))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorAnswerLabel)
                    .addComponent(doctorAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentAnswer))
                .addGap(6, 6, 6)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorPassLabel)
                    .addComponent(doctorPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorConfirmLabel)
                    .addComponent(doctorConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(doctorSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        editProfileTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {doctorAnswerField, doctorEmailField, doctorHospitalField, doctorNameField, doctorPhoneField, doctorSecretField, doctorStreetField});

        DoctorUIMain.addTab("Edit Profile", editProfileTab);

        getContentPane().add(DoctorUIMain, "card2");

        EditPatientPage.setBackground(new java.awt.Color(204, 204, 255));

        editPatientPageHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        editPatientPageHeader.setText("Edit Patient List");

        patientNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientNameLabel.setText("Name");

        patientEmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientEmailLabel.setText("Email");

        patientStreetAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientStreetAddressLabel.setText("Street Address");

        patientCityStateAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientCityStateAddressLabel.setText("City/State");

        patientPhoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientPhoneLabel.setText("Phone Number");

        patientPassLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientPassLabel.setText("Password");

        patientConfirmLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientConfirmLabel.setText("Confirm Password");

        patientRemoveButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientRemoveButton.setText("Remove Patient");
        patientRemoveButton.setToolTipText("Only Requires Name and Email fields to be filled");
        patientRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientRemoveButtonActionPerformed(evt, doc);
            }
        });

        patientAddButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patientAddButton.setText("Add Patient");
        patientAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientAddButtonActionPerformed(evt, doc);
            }
        });

        editPatientCancelButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editPatientCancelButton.setText("Cancel");
        editPatientCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditPatientPageLayout = new javax.swing.GroupLayout(EditPatientPage);
        EditPatientPage.setLayout(EditPatientPageLayout);
        EditPatientPageLayout.setHorizontalGroup(
            EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPatientPageLayout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(editPatientPageHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditPatientPageLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientConfirmLabel)
                    .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(EditPatientPageLayout.createSequentialGroup()
                            .addComponent(patientRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addComponent(patientAddButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditPatientPageLayout.createSequentialGroup()
                            .addComponent(patientCityStateAddressLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientCityStateField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EditPatientPageLayout.createSequentialGroup()
                            .addComponent(patientStreetAddressLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EditPatientPageLayout.createSequentialGroup()
                            .addComponent(patientEmailLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EditPatientPageLayout.createSequentialGroup()
                            .addComponent(patientNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EditPatientPageLayout.createSequentialGroup()
                            .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientPhoneLabel)
                                .addComponent(patientPassLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                            .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(patientPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(344, 344, 344))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditPatientPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editPatientCancelButton)
                .addGap(466, 466, 466))
        );

        EditPatientPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editPatientCancelButton, patientAddButton, patientRemoveButton});

        EditPatientPageLayout.setVerticalGroup(
            EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPatientPageLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(editPatientPageHeader)
                .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditPatientPageLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel4))
                    .addGroup(EditPatientPageLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientNameLabel)
                            .addComponent(patientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientEmailLabel)
                            .addComponent(patientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientStreetAddressLabel)
                            .addComponent(patientStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientCityStateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EditPatientPageLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(patientCityStateAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientPhoneLabel)
                            .addComponent(patientPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientPassLabel)
                            .addComponent(patientPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientConfirmLabel)
                            .addComponent(patientConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(125, 125, 125)
                .addGroup(EditPatientPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientAddButton))
                .addGap(33, 33, 33)
                .addComponent(editPatientCancelButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        EditPatientPageLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editPatientCancelButton, patientAddButton, patientRemoveButton});

        getContentPane().add(EditPatientPage, "card3");

        pack();
        
        //tutorial that is displayed to the user if there 
        if(nonSevereListModel.isEmpty() && mildlySevereListModel.isEmpty() && severeListModel.isEmpty()){
        	javax.swing.JOptionPane.showMessageDialog(DoctorUIMain, "Welcome to the Efferent Patient Care System!\n\n"
        			+ "We see you don't have any patients loaded up into your Patient List.\nIn order to start seeing patients"
        			+ " appear on your screen, you will need to register them first.\n Clicking on \"Edit Patient List\" and"
        			+ " filling out the appropriate fields and clicking \"Add Patient\" would be the best way to start.\n\n"
        			+ "Thank you for using the Efferent Patient Care System.\nWe hope to provide you the extra convenience.");
        }
    }                      
    
    // action listener that allows for a doctor to change their personal information
    private void doctorSubmitButtonActionPerformed(java.awt.event.ActionEvent evt, Doctor doc) {                                                   
        boolean changed = false;	//tracks if changes to any doctor field occurs
    	
    	docList = Serialize.deserialize("src/doctor.bin");//extracts doclist from serializable file
        for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(doc.getEmail()) 
        			&& docList.get(i).getPassword().equals(doc.getPassword()))
        	{
        		docList.remove(i);
        		break;
        	}
        }
        
        
        if(!doctorEmailField.getText().equals("") && !doctorEmailField.getText().equals("Enter new patient email here")){
    		if(Validator.isEmail(doctorEmailField.getText())){
	    		 String newEmail = doctorEmailField.getText();
	    	     doctorCurrentEmail.setText(newEmail);
	    	     doctorEmailField.setText("");
	    	     //temp.getPatientList().get(patientIndex).setEmail(newEmail);
	    	     doc.setEmail(newEmail);
	    	     changed = true;
    		}
    		else{
    			javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "Please enter a valid email.");
    			doctorEmailField.setText("");    			
    		}
    	}    	
    	
    	if(!doctorPhoneField.getText().equals("") && !doctorPhoneField.getText().equals("Enter new patient phone number here")){
    		if(Validator.isPhone(doctorPhoneField.getText())){
    		String newPhone= doctorPhoneField.getText();	
    		doctorCurrentPhone.setText("(" + newPhone.substring(0, 3) + ") " + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length()));
   	     	doctorPhoneField.setText("");
   	     	doc.setPhoneNumber(newPhone);
   	     	changed = true;
    		}
    		
    		else
    		{
    			doctorPhoneField.setText("");
    			javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "Please enter a valid phone number in the form of XXXXXXXXXX with no spaces");
    		}
    			
   	     }
    	
    	if(!doctorNameField.getText().equals("") && !doctorNameField.getText().equals("Enter new patient name here")){
    		String newName = doctorNameField.getText();
    		doctorCurrentName.setText(newName);
    		doctorNameField.setText("");
    		doc.setName(newName);
    		changed = true;
    	}
    	
    	if(!doctorStreetField.getText().equals("") && !doctorStreetField.getText().equals("Enter new patient street address here")){
    		String newStreet = doctorStreetField.getText();
    		doctorCurrentStreetAddress.setText(newStreet);
    		doctorStreetField.setText("");
    		doc.setStreetAddress(newStreet);
    		changed = true;
    	}
    	
    	
    	if(!doctorCityStateField.getText().equals("") && !doctorCityStateField.getText().equals("Enter new patient city, state, and zip here")){
    		String newCityState = doctorCityStateField.getText();
    		doctorCurrentCityStateAddress.setText(newCityState);
    		doctorCityStateField.setText("");
    		doc.setCityStateAddress(newCityState);
    		changed = true;
    	}
    	
    	if(!doctorHospitalField.getText().equals("") && !doctorHospitalField.getText().equals("Enter new pharmacy name here")){
    		String newHospital = doctorHospitalField.getText();
    		doctorCurrentHospital.setText(newHospital);
    		doctorHospitalField.setText("");
    		doc.setHospital(newHospital);
    		changed = true;
    	}
    	
    	
    	if(!doctorSecretField.getText().equals("") && !doctorSecretField.getText().equals("Enter new pharmacy address here")){
    		String newSecret = doctorSecretField.getText();
    		doctorCurrentSecret.setText(newSecret);
    		doctorSecretField.setText("");
    		doc.setSecret(newSecret);
    		changed = true;
    	}
    	
    	
    	if(!doctorAnswerField.getText().equals("") && !doctorAnswerField.getText().equals("Enter new pharmacy phone number here")){
        		String newAnswer= doctorAnswerField.getText();	
        		doctorCurrentAnswer.setText(newAnswer);
       	     	doctorAnswerField.setText("");
       	     	doc.setAnswer(newAnswer);
       	     	changed = true;
    	}
    	
    	if(!(doctorPassField.getText().equals("")))
    	{
    		
	    		if(doctorPassField.getText().equals(doctorConfirmField.getText()))	//makes sure the password and confirm fields match
	    		{
	    			String newPass = doctorPassField.getText();
	    			doc.setPassword(newPass);
	    		     doctorPassField.setText("");
		             doctorConfirmField.setText("");
	                changed = true;
	    		}
	    		else
	    			javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "The passwords do not match");
    		
	       if(doctorPassField.getText().equals("") && !doctorConfirmField.getText().equals("")){
	    	   doctorConfirmField.setText("");
	    	   javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "To edit password, please complete both password fields");
	       }   		
    			
    	}
    	
    	if(changed)	//if any information was altered, user is notified the changes have been processed
    	{
    		javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "Profile information changed.");
    		changed = false;    				
    	}
    	
    	docList.add(doc);
    	Serialize.serialize(docList, "src/doctor.bin");	//re adds the doc to the doc list with
    													//new information	
    }                                                  

    //action listener that changes UI from main doctor interface into the edit patient page
    private void editPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        DoctorUIMain.setVisible(false);
        EditPatientPage.setVisible(true);
    }                                                 

    //opens up the doctorui2 interface for the patient slected from the non-severe patient list
    private void nonSeverePatientListValueChanged(javax.swing.event.ListSelectionEvent evt, Doctor doc) {                                                  
        String selectedPatientName = (String)nonSeverePatientList.getSelectedValue();
        Patient selectedPatient = null;
        for(int i = 0; i < doc.getPatientList().size(); i++){
        	if(doc.getPatientList().get(i).getname().equals(selectedPatientName)){
        		selectedPatient = doc.getPatientList().get(i);
        		break;
        	}
        }
        
    	DoctorUI2 test = new DoctorUI2(selectedPatient);
        test.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }                                                 

  //opens up the doctorui2 interface for the patient slected from the mildly severe patient list
    private void mildlySeverePatientListValueChanged(javax.swing.event.ListSelectionEvent evt, Doctor doc) {                                               
    	 String selectedPatientName = (String)mildlySeverePatientList.getSelectedValue();
         Patient selectedPatient = null;
         for(int i = 0; i < doc.getPatientList().size(); i++){
         	if(doc.getPatientList().get(i).getname().equals(selectedPatientName)){
         		selectedPatient = doc.getPatientList().get(i);
         		break;
         	}
         }
         
     	DoctorUI2 test = new DoctorUI2(selectedPatient);
         test.setVisible(true);
         this.setVisible(false);
         this.dispose();
    }                                              

  //opens up the doctorui2 interface for the patient slected from the severe patient list
    private void severePatientListValueChanged(javax.swing.event.ListSelectionEvent evt, Doctor doc) {                                                     
    	 String selectedPatientName = (String) severePatientList.getSelectedValue();
         Patient selectedPatient = null;
         for(int i = 0; i < doc.getPatientList().size(); i++){
         	if(doc.getPatientList().get(i).getname().equals(selectedPatientName)){
         		selectedPatient = doc.getPatientList().get(i);
         		break;
         	}
         }
         
     	DoctorUI2 test = new DoctorUI2(selectedPatient);
         test.setVisible(true);
         this.setVisible(false);
         this.dispose();
    }                                                    

    //action listener that allows for a patient to be removed from a doctor's patient list
    private void patientRemoveButtonActionPerformed(java.awt.event.ActionEvent evt, Doctor doc) {  
    if(!patientNameField.getText().equals("") && !patientEmailField.getText().equals(""))
   	   {
    	docList = Serialize.deserialize("src/doctor.bin");
    	boolean removed = false;//tracks if a patient was successfully removed from the list
        for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(doc.getEmail()) 
        			&& docList.get(i).getPassword().equals(doc.getPassword()))
        	{
        		docList.remove(i);
        		break;
        	}
        }
        
        //looks for and removes the desired patient from the doctor's patientlist
       for(int j = 0; j < doc.getPatientList().size(); j++)
       {
    	   if(doc.getPatientList().get(j).getname().equalsIgnoreCase(patientNameField.getText())
    			   && doc.getPatientList().get(j).getEmail().equalsIgnoreCase(patientEmailField.getText()))
    			   {
    				   doc.getPatientList().remove(j);
    				   removed = true;
    			   }

    	   }
       if(removed)	//if the patient is removed, the jlists on the main doctor interface are updated to reflect the changes
       {
    	patientNameField.setText("");
       	patientEmailField.setText("");
       	patientPhoneField.setText("");
   		patientStreetField.setText("");
   		patientCityStateField.setText("");
   		patientPassField.setText("");
   		patientConfirmField.setText("");
   		
   		nonSevereListModel.clear();
   		mildlySevereListModel.clear();
   		severeListModel.clear();
   		
   		//re-sets the doctor's jlists to reflect the patient that was removed
   	  for(int i = 0; i < doc.getPatientList().size(); i++)
      {
      	Patient temp = doc.getPatientList().get(i);
      	
      	if(temp.isProblematic(today))
      	{
      		if(temp.isSeverelyProblematic(today))
      		{
      			severeListModel.addElement(temp.getname());
      		}
      		
      		else
      		{
      			mildlySevereListModel.addElement(temp.getname());
      		}
      	}
      	else
      		nonSevereListModel.addElement(temp.getname());
      }
       EditPatientPage.setVisible(false);
       DoctorUIMain.setVisible(true);	//returns back to the main doctor interface
       javax.swing.JOptionPane.showMessageDialog(DoctorUIMain, "Patient successfully removed!");
   	   }
    else
    {
    	//notifies user if patient is not on the list
    	javax.swing.JOptionPane.showMessageDialog(DoctorUIMain, "Patient does not exist.");
    }
       docList.add(doc);							/*re adds the doc to the doc list with
														new information	*/
       Serialize.serialize(docList, "src/doctor.bin");
   	   }
       else
       {
    	   //makes sure there are a name and email entered in order to remove a patient
    	   javax.swing.JOptionPane.showMessageDialog(EditPatientPage, "Please enter a name and email of a patient to remove");
       }
    	   
    	   
   }    
    
                                                    
    //action listener that allows for a doctor to register a patient to the system
    private void patientAddButtonActionPerformed(java.awt.event.ActionEvent evt, Doctor doc) {   
    	//checks to make sure all of the text fields are not empty
    	 if(!patientNameField.getText().equals("") && !patientEmailField.getText().equals("") && !patientPhoneField.getText().equals("")
    			&& !patientStreetField.getText().equals("") && !patientCityStateField.getText().equals("") && !patientPassField.getText().equals("")
    			&& !patientConfirmField.getText().equals(""))
    	 { 
    	//makes sure that all patient information is valid
    	 if(!Validator.isEmail(patientEmailField.getText()))
    	 {
    		 patientEmailField.setText("");
    		 javax.swing.JOptionPane.showMessageDialog(EditPatientPage, "Please enter a valid email");
    		 
    	 }
    	 
    	 else if(!Validator.isPhone(patientPhoneField.getText()))
    	 {
    		 patientPhoneField.setText("");
    		 javax.swing.JOptionPane.showMessageDialog(EditPatientPage, "Please enter a valid phone number in the form of XXXXXXXXXX (i.e. 6235552455)");
    		 
    	 }
    	 else if(!patientPassField.getText().equals(patientConfirmField.getText()))
     	 {
    		patientPassField.setText("");
   			patientConfirmField.setText("");
     		javax.swing.JOptionPane.showMessageDialog(EditPatientPage, "The password fields do not match");
  			
     	 }	 
    	 else
    	 {
    	docList = Serialize.deserialize("src/doctor.bin");
         for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
         {
         	if(docList.get(i).getEmail().equalsIgnoreCase(doc.getEmail()) 
         			&& docList.get(i).getPassword().equals(doc.getPassword()))
         	{
         		docList.remove(i);
         		break;
         	}
         }
         
         //adds new patient to the end of the doctor's patient list
         doc.getPatientList().add(new Patient(patientNameField.getText(), patientEmailField.getText(), patientPhoneField.getText(),
        		 					patientStreetField.getText(), patientCityStateField.getText(), patientPassField.getText(),
        		 					defaultPharm, doc));
         //sets the threshold for the patients symptoms
         doc.getPatientList().get(doc.getPatientList().size() - 1).setThreshold(thresholdArray);
         
         //adds patient to the nonsevere list by default
        nonSevereListModel.addElement(doc.getPatientList().get(doc.getPatientList().size() - 1).getname());
        docList.add(doc);
     	
     	Serialize.serialize(docList, "src/doctor.bin");	//re adds the doc to the doc list with
     													//new information
     	patientNameField.setText("");
    	patientEmailField.setText("");
    	patientPhoneField.setText("");
		patientStreetField.setText("");
		patientCityStateField.setText("");
		patientPassField.setText("");
		patientConfirmField.setText("");
     	EditPatientPage.setVisible(false);
     	DoctorUIMain.setVisible(true);
     	javax.swing.JOptionPane.showMessageDialog(DoctorUIMain, "Patient successfully added!");
     	
     	
    	 	}
    	 }
     	else
     	{
     		javax.swing.JOptionPane.showMessageDialog(EditPatientPage, "Please make sure that each field is completed before submitting.");
     	}
    }                                                

    private void editPatientCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	patientNameField.setText("");
    	patientEmailField.setText("");
    	patientPhoneField.setText("");
		patientStreetField.setText("");
		patientCityStateField.setText("");
		patientPassField.setText("");
		patientConfirmField.setText("");
        EditPatientPage.setVisible(false);
        DoctorUIMain.setVisible(true);
        
    }                                        

   
  //variable declaration                     
    private javax.swing.JTabbedPane DoctorUIMain;
    private javax.swing.JPanel EditPatientPage;
    private javax.swing.JLabel doctorAddressLabel;
    private javax.swing.JTextField doctorAnswerField;
    private javax.swing.JLabel doctorAnswerLabel;
    private javax.swing.JTextField doctorCityStateField;
    private javax.swing.JPasswordField doctorConfirmField;
    private javax.swing.JLabel doctorConfirmLabel;
    private javax.swing.JLabel doctorCurrentAnswer;
    private javax.swing.JLabel doctorCurrentCityState;
    private javax.swing.JLabel doctorCurrentCityStateAddress;
    private javax.swing.JLabel doctorCurrentEmail;
    private javax.swing.JLabel doctorCurrentHospital;
    private javax.swing.JLabel doctorCurrentName;
    private javax.swing.JLabel doctorCurrentPhone;
    private javax.swing.JLabel doctorCurrentSecret;
    private javax.swing.JLabel doctorCurrentStreetAddress;
    private javax.swing.JLabel doctorEditProfileHeader;
    private javax.swing.JTextField doctorEmailField;
    private javax.swing.JLabel doctorEmailLabel;
    private javax.swing.JTextField doctorHospitalField;
    private javax.swing.JLabel doctorHospitalLabel;
    private javax.swing.JTextField doctorNameField;
    private javax.swing.JLabel doctorNameLabel;
    private javax.swing.JPasswordField doctorPassField;
    private javax.swing.JLabel doctorPassLabel;
    private javax.swing.JTextField doctorPhoneField;
    private javax.swing.JLabel doctorPhoneLabel;
    private javax.swing.JTextField doctorSecretField;
    private javax.swing.JLabel doctorSecretLabel;
    private javax.swing.JTextField doctorStreetField;
    private javax.swing.JButton doctorSubmitButton;
    private javax.swing.JButton editPatientButton;
    private javax.swing.JLabel editPatientPageHeader;
    private javax.swing.JPanel editProfileTab;
    private javax.swing.JButton editPatientCancelButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mildlySeverePatientLabel;
    private javax.swing.JList mildlySeverePatientList;
    private javax.swing.JLabel nonSeverePatientLabel;
    private javax.swing.JList nonSeverePatientList;
    private javax.swing.JButton patientAddButton;
    private javax.swing.JLabel patientCityStateAddressLabel;
    private javax.swing.JTextField patientCityStateField;
    private javax.swing.JPasswordField patientConfirmField;
    private javax.swing.JLabel patientConfirmLabel;
    private javax.swing.JTextField patientEmailField;
    private javax.swing.JLabel patientEmailLabel;
    private javax.swing.JTextField patientNameField;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JPasswordField patientPassField;
    private javax.swing.JLabel patientPassLabel;
    private javax.swing.JTextField patientPhoneField;
    private javax.swing.JLabel patientPhoneLabel;
    private javax.swing.JButton patientRemoveButton;
    private javax.swing.JLabel patientStreetAddressLabel;
    private javax.swing.JTextField patientStreetField;
    private javax.swing.JLabel severePatientLabel;
    private javax.swing.JList severePatientList;
    private javax.swing.JPanel viewPatientListTab;     
    //list models for the j list
    private DefaultListModel nonSevereListModel = new DefaultListModel();
    private DefaultListModel mildlySevereListModel = new DefaultListModel();
    private DefaultListModel severeListModel = new DefaultListModel();
    //arraylist of doctor's from serializable file
    private ArrayList<Doctor> docList; 
    //default pharmacy
    private Pharmacy defaultPharm = new Pharmacy("Grant's Drug Store", "0123 W. Healing Ln. Tempe, AZ, 85281", "6235214555");
    //string used to store today's date
    private String today;
    //default threshold array
    private int thresholdArray[] = {6,6,6,6,6,6,6,6,6,6};
}

