/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Service.Impl.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Minh
 */
public class ManageLoan extends javax.swing.JFrame {

    AccountManagerImpl acc;
    BranchesManagerImpl bra;
    LoanDetailImp LD;
    Vector VecAcc;
    Vector VecBra;
    ResultSet rsLoanType;
    ResultSet rsLoanDetails;
    int flag;

    /**
     * Creates new form ManageLoan
     */
    public ManageLoan() {
        initComponents();
        btnSave.setText("Create");
        setLocation(350, 250);
        loadData();
        flag = 0;
    }

    public ManageLoan(int ID) {
        initComponents();
        btnSave.setText("Update");
        setLocation(350, 250);
        loadData(ID);
        flag = 1;
    }

//    public ManageLoan() {
//        initComponents();
//        loadData();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboLoanType = new javax.swing.JComboBox();
        cboBranch = new javax.swing.JComboBox();
        cboAccount = new javax.swing.JComboBox();
        JDCBeginTime = new com.toedter.calendar.JDateChooser();
        JDCEndTime = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblCusName = new javax.swing.JLabel();
        txtLoanMoney = new javax.swing.JTextField();
        txtCurrentMoney = new javax.swing.JTextField();
        lblAleart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                loadParrent(evt);
            }
        });

        jLabel1.setText("Current Money:");
        jLabel1.setPreferredSize(new java.awt.Dimension(20, 14));

        jLabel2.setText("Loan Money:");

        jLabel3.setText("Account No:");
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 14));

        jLabel4.setText("Begin Time:");
        jLabel4.setPreferredSize(new java.awt.Dimension(20, 14));

        jLabel5.setText("Loan Type:");
        jLabel5.setPreferredSize(new java.awt.Dimension(20, 14));

        jLabel6.setText("Branch:");
        jLabel6.setPreferredSize(new java.awt.Dimension(20, 14));

        jLabel7.setText("End Time:");
        jLabel7.setPreferredSize(new java.awt.Dimension(20, 14));

        cboLoanType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "        -- Loan Type --" }));

        cboBranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "       -- Branch name --" }));

        cboAccount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "        --Account No--" }));
        cboAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAccountActionPerformed(evt);
            }
        });

        JDCBeginTime.setDateFormatString("dd-MM-yyyy");

        JDCEndTime.setDateFormatString("dd-MM-yyyy");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblCusName.setText("(Customer Name:not set)");
        lblCusName.setPreferredSize(new java.awt.Dimension(20, 14));

        lblAleart.setPreferredSize(new java.awt.Dimension(20, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboAccount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLoanType, 0, 171, Short.MAX_VALUE)
                    .addComponent(txtLoanMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboBranch, 0, 246, Short.MAX_VALUE)
                            .addComponent(JDCBeginTime, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(JDCEndTime, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAleart, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDCBeginTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDCEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAleart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int indexAcc = cboAccount.getSelectedIndex();
        int indexType = cboLoanType.getSelectedIndex();
        int indexBra = cboBranch.getSelectedIndex();
        int numBra = VecBra.size();
        for (int i = 0; i < numBra; i++) {
            Vector v = (Vector) VecBra.get(i);
        }
        if (validateFeild()) {
            Vector vAcc = (Vector) VecAcc.get(indexAcc - 1);
            Vector vBra = (Vector) VecBra.get(indexBra - 1);
            float LoanMoney = Float.valueOf(txtLoanMoney.getText());
            float CurrentMoney = Float.valueOf(txtCurrentMoney.getText());
            Date BeginTime = new Date(JDCBeginTime.getDate().getTime());
            Date EndTime = new Date(JDCEndTime.getDate().getTime());
            try {
                rsLoanType.absolute(indexType);
                int branchID = Integer.parseInt(vBra.get(0).toString());
                int LoanTypeID = rsLoanType.getInt("TypeID");
                if (flag == 0) {
                    LD.InsertLoanDetail(vAcc.get(0).toString(), LoanMoney, CurrentMoney, LoanTypeID, BeginTime, EndTime, branchID);
                    InstallmentMonthlyManagerImpl IMMI = new InstallmentMonthlyManagerImpl();
                    IMMI.InsertInstallmentMonthly(cboAccount.getSelectedItem().toString(), rsLoanType.getFloat("InterestRate"));
                } else {
                    LD.changeLoanDetail(rsLoanDetails.getInt("LoanID"), vAcc.get(0).toString(), LoanMoney, CurrentMoney, LoanTypeID, BeginTime, EndTime, branchID);
                }
                JOptionPane.showMessageDialog(null, "Successful!");
                dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Can not insert(error Database)");
            }
        } else {
            lblAleart.setText("please check data in all feild");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cboAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAccountActionPerformed
        // TODO add your handling code here:
        int index = cboAccount.getSelectedIndex();
        if (index != 0) {
            Vector v = (Vector) VecAcc.get(index - 1);
            lblCusName.setText("(Customer Name: " + v.get(2).toString() + ")");
        } else {
            lblCusName.setText("(Customer Name:not set)");
        }
    }//GEN-LAST:event_cboAccountActionPerformed

    private void loadParrent(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_loadParrent
        new LoanDetailsFrm().setVisible(true);
    }//GEN-LAST:event_loadParrent
    private boolean validateFeild() {
        String money;
        money = txtCurrentMoney.getText();
        char[] m;
        m = money.toCharArray();
        for (int i = 0; i < m.length; i++) {
            if (!Character.isDigit(m[i])) {
                return false;
            }
        }
        if (m.length == 0) {
            return false;
        }

        money = txtLoanMoney.getText();
        m = money.toCharArray();
        for (int i = 0; i < m.length; i++) {
            if (!Character.isDigit(m[i])) {
                return false;
            }
        }
        if (m.length == 0) {
            return false;
        }
        int i;

        i = cboAccount.getSelectedIndex();
        if (i == 0) {
            return false;
        }
        i = cboBranch.getSelectedIndex();
        if (i == 0) {
            return false;
        }
        i = cboLoanType.getSelectedIndex();
        if (i == 0) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ManageLoan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDCBeginTime;
    private com.toedter.calendar.JDateChooser JDCEndTime;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cboAccount;
    private javax.swing.JComboBox cboBranch;
    private javax.swing.JComboBox cboLoanType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAleart;
    private javax.swing.JLabel lblCusName;
    private javax.swing.JTextField txtCurrentMoney;
    private javax.swing.JTextField txtLoanMoney;
    // End of variables declaration//GEN-END:variables

    public void loadData() {
        try {
            LD = new LoanDetailImp();
            LoanTypeImp LT = new LoanTypeImp();
            rsLoanType = LT.getAllLoanType();
            while (rsLoanType.next()) {
                cboLoanType.addItem(rsLoanType.getString("TypeName"));
            }
            acc = new AccountManagerImpl();
            VecAcc = acc.getAll();
            int numAcc = VecAcc.size();
            for (int i = 0; i < numAcc; i++) {
                Vector v = (Vector) VecAcc.get(i);
                cboAccount.addItem(v.get(0));
            }

            bra = new BranchesManagerImpl();
            VecBra = bra.GetListFromTable("Select * From [Branches]");
            int numBra = VecBra.size();
            for (int i = 0; i < numBra; i++) {
                Vector v = (Vector) VecBra.get(i);
                cboBranch.addItem(v.get(1));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void loadData(int ID) {
        try {
            LD = new LoanDetailImp();

            LoanTypeImp LT = new LoanTypeImp();
            rsLoanType = LT.getAllLoanType();
            while (rsLoanType.next()) {
                cboLoanType.addItem(rsLoanType.getString("TypeName"));
            }
            acc = new AccountManagerImpl();
            VecAcc = acc.getAll();
            int numAcc = VecAcc.size();
            for (int i = 0; i < numAcc; i++) {
                Vector v = (Vector) VecAcc.get(i);
                cboAccount.addItem(v.get(0));
            }

            bra = new BranchesManagerImpl();
            VecBra = bra.GetListFromTable("Select * From [Branches]");
            int numBra = VecBra.size();
            for (int i = 0; i < numBra; i++) {
                Vector v = (Vector) VecBra.get(i);
                cboBranch.addItem(v.get(1));
            }

            rsLoanDetails = LD.getLoanDetailByID(ID);
            rsLoanDetails.next();
            cboAccount.setSelectedItem(rsLoanDetails.getObject("AccountNo"));
            cboBranch.setSelectedItem(rsLoanDetails.getObject("Expr2"));
            cboLoanType.setSelectedItem(rsLoanDetails.getObject("TypeName"));
            txtCurrentMoney.setText(rsLoanDetails.getObject("CurentMoney").toString());
            txtLoanMoney.setText(rsLoanDetails.getObject("LoanMoney").toString());
            JDCBeginTime.setDate(rsLoanDetails.getDate("BeginTime"));
            JDCEndTime.setDate(rsLoanDetails.getDate("EndTime"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
