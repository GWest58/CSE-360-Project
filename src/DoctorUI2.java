/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSClark
 */
public class DoctorUI2 extends javax.swing.JFrame {

    /**
     * Creates new form DoctorUI
     */
    public DoctorUI2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        doctorUI2TabbedPane = new javax.swing.JTabbedPane();
        filePrescriptionsTab = new javax.swing.JPanel();
        pharmInfoTxtArea = new javax.swing.JScrollPane();
        pharmacyInfoTxtArea = new javax.swing.JTextArea();
        prescriptionSubmitBtn = new javax.swing.JButton();
        prescriptionNameTxtF = new javax.swing.JTextField();
        prescriptionDoseTxtF = new javax.swing.JTextField();
        prescriptionFreqTxtF = new javax.swing.JTextField();
        contactPatientTab = new javax.swing.JPanel();
        sendMsgBtn = new javax.swing.JButton();
        messageTxtArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        editPatientInfoTab = new javax.swing.JPanel();
        editPatientNameField = new javax.swing.JTextField();
        editPatientPhoneField = new javax.swing.JTextField();
        editPatientAddressField = new javax.swing.JTextField();
        editPatientEmailField = new javax.swing.JTextField();
        editPasswordField = new javax.swing.JTextField();
        editPatientSubmitBtn = new javax.swing.JButton();
        patientNameLbl = new javax.swing.JLabel();
        patientEmailLbl = new javax.swing.JLabel();
        patientPhoneLbl = new javax.swing.JLabel();
        patientAddressLbl = new javax.swing.JLabel();
        editPasswordLbl = new javax.swing.JLabel();
        viewSubmissionsTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dateList = new javax.swing.JList();
        symptomLbl = new javax.swing.JLabel();
        ratingLbl = new javax.swing.JLabel();
        symptonListPane = new javax.swing.JScrollPane();
        symptonList = new javax.swing.JList();
        ratingListPane = new javax.swing.JScrollPane();
        ratingList = new javax.swing.JList();
        dateLbl = new javax.swing.JLabel();
        dateComboBox = new javax.swing.JComboBox();
        phoneNumLbl = new javax.swing.JLabel();
        phoneNumPlaceHoldLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pharmacyInfoTxtArea.setColumns(20);
        pharmacyInfoTxtArea.setRows(5);
        pharmacyInfoTxtArea.setText("Pharmacy Information");
        pharmInfoTxtArea.setViewportView(pharmacyInfoTxtArea);

        prescriptionSubmitBtn.setText("Submit");

        prescriptionNameTxtF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prescriptionNameTxtF.setText("Prescription Name");

        prescriptionDoseTxtF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prescriptionDoseTxtF.setText("Dose");

        prescriptionFreqTxtF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prescriptionFreqTxtF.setText("Frequency of Dosage");

        javax.swing.GroupLayout filePrescriptionsTabLayout = new javax.swing.GroupLayout(filePrescriptionsTab);
        filePrescriptionsTab.setLayout(filePrescriptionsTabLayout);
        filePrescriptionsTabLayout.setHorizontalGroup(
            filePrescriptionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filePrescriptionsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filePrescriptionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filePrescriptionsTabLayout.createSequentialGroup()
                        .addGroup(filePrescriptionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(prescriptionFreqTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prescriptionNameTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prescriptionDoseTxtF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(pharmInfoTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(filePrescriptionsTabLayout.createSequentialGroup()
                        .addComponent(prescriptionSubmitBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        filePrescriptionsTabLayout.setVerticalGroup(
            filePrescriptionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filePrescriptionsTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(filePrescriptionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pharmInfoTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(filePrescriptionsTabLayout.createSequentialGroup()
                        .addComponent(prescriptionNameTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(prescriptionDoseTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(prescriptionFreqTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(prescriptionSubmitBtn)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        doctorUI2TabbedPane.addTab("File Prescriptions", filePrescriptionsTab);

        sendMsgBtn.setText("Send");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        messageTxtArea.setViewportView(jTextArea1);

        javax.swing.GroupLayout contactPatientTabLayout = new javax.swing.GroupLayout(contactPatientTab);
        contactPatientTab.setLayout(contactPatientTabLayout);
        contactPatientTabLayout.setHorizontalGroup(
            contactPatientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPatientTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(sendMsgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        contactPatientTabLayout.setVerticalGroup(
            contactPatientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPatientTabLayout.createSequentialGroup()
                .addGroup(contactPatientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactPatientTabLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(sendMsgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contactPatientTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messageTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        doctorUI2TabbedPane.addTab("Contact Patient", contactPatientTab);

        editPatientNameField.setText("Patient name");
        editPatientNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientNameFieldActionPerformed(evt);
            }
        });

        editPatientPhoneField.setText("Phone number");
        editPatientPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientPhoneFieldActionPerformed(evt);
            }
        });

        editPatientAddressField.setText("Address");

        editPatientEmailField.setText("Email");

        editPasswordField.setText("Password");

        editPatientSubmitBtn.setText("Submit");

        patientNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patientNameLbl.setText("Name:");

        patientEmailLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patientEmailLbl.setText("Email:");

        patientPhoneLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patientPhoneLbl.setText("Phone:");

        patientAddressLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patientAddressLbl.setText("Address:");

        editPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editPasswordLbl.setText("Password:");

        javax.swing.GroupLayout editPatientInfoTabLayout = new javax.swing.GroupLayout(editPatientInfoTab);
        editPatientInfoTab.setLayout(editPatientInfoTabLayout);
        editPatientInfoTabLayout.setHorizontalGroup(
            editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientEmailLbl)
                            .addComponent(patientPhoneLbl)
                            .addComponent(patientNameLbl)
                            .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                                .addComponent(editPasswordLbl)
                                .addGap(27, 27, 27)
                                .addComponent(editPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(editPatientSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))
                    .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                        .addComponent(patientAddressLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(editPatientAddressField)
                            .addComponent(editPatientEmailField)
                            .addComponent(editPatientNameField)
                            .addComponent(editPatientPhoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(385, 385, 385))))
        );
        editPatientInfoTabLayout.setVerticalGroup(
            editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPatientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameLbl))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientEmailLbl)
                    .addComponent(editPatientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientPhoneLbl)
                    .addComponent(editPatientPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientAddressLbl)
                    .addComponent(editPatientAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPasswordLbl)
                    .addComponent(editPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPatientSubmitBtn))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        doctorUI2TabbedPane.addTab("Edit Patient Profile", editPatientInfoTab);

        dateList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(dateList);

        symptomLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        symptomLbl.setText("Symptom");

        ratingLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ratingLbl.setText("Rating");

        symptonList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        symptonListPane.setViewportView(symptonList);

        ratingList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ratingListPane.setViewportView(ratingList);

        dateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLbl.setText("Date");

        dateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        phoneNumLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneNumLbl.setText("Patient Phone Number:");

        phoneNumPlaceHoldLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneNumPlaceHoldLbl.setText("5202804699");

        javax.swing.GroupLayout viewSubmissionsTabLayout = new javax.swing.GroupLayout(viewSubmissionsTab);
        viewSubmissionsTab.setLayout(viewSubmissionsTabLayout);
        viewSubmissionsTabLayout.setHorizontalGroup(
            viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                        .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                                .addComponent(symptomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ratingLbl))
                            .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                                .addComponent(symptonListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ratingListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(dateLbl))))
                    .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                        .addComponent(phoneNumLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumPlaceHoldLbl)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        viewSubmissionsTabLayout.setVerticalGroup(
            viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(dateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                                .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(viewSubmissionsTabLayout.createSequentialGroup()
                        .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(symptomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratingLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(symptonListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratingListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(viewSubmissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumLbl)
                    .addComponent(phoneNumPlaceHoldLbl))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        doctorUI2TabbedPane.addTab("View Submissions", viewSubmissionsTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorUI2TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorUI2TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void editPatientPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void editPatientNameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel contactPatientTab;
    private javax.swing.JComboBox dateComboBox;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JList dateList;
    private javax.swing.JTabbedPane doctorUI2TabbedPane;
    private javax.swing.JTextField editPasswordField;
    private javax.swing.JLabel editPasswordLbl;
    private javax.swing.JTextField editPatientAddressField;
    private javax.swing.JTextField editPatientEmailField;
    private javax.swing.JPanel editPatientInfoTab;
    private javax.swing.JTextField editPatientNameField;
    private javax.swing.JTextField editPatientPhoneField;
    private javax.swing.JButton editPatientSubmitBtn;
    private javax.swing.JPanel filePrescriptionsTab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane messageTxtArea;
    private javax.swing.JLabel patientAddressLbl;
    private javax.swing.JLabel patientEmailLbl;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JLabel patientPhoneLbl;
    private javax.swing.JScrollPane pharmInfoTxtArea;
    private javax.swing.JTextArea pharmacyInfoTxtArea;
    private javax.swing.JLabel phoneNumLbl;
    private javax.swing.JLabel phoneNumPlaceHoldLbl;
    private javax.swing.JTextField prescriptionDoseTxtF;
    private javax.swing.JTextField prescriptionFreqTxtF;
    private javax.swing.JTextField prescriptionNameTxtF;
    private javax.swing.JButton prescriptionSubmitBtn;
    private javax.swing.JLabel ratingLbl;
    private javax.swing.JList ratingList;
    private javax.swing.JScrollPane ratingListPane;
    private javax.swing.JButton sendMsgBtn;
    private javax.swing.JLabel symptomLbl;
    private javax.swing.JList symptonList;
    private javax.swing.JScrollPane symptonListPane;
    private javax.swing.JPanel viewSubmissionsTab;
    // End of variables declaration                   
}
