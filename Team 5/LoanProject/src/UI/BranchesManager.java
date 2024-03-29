/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Process.Branches;
import com.sun.org.apache.xalan.internal.xsltc.dom.KeyIndex;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.RenderingHints;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author babman92
 */
public class BranchesManager extends javax.swing.JFrame {

    /**
     * Creates new form BranchesManager
     */
    int flag = 1;
    JPopupMenu popMenu;
    JMenuItem menuItem;

    public BranchesManager() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Vector data = Branches.getList("Select * From [Branches]");
        ShowData(data);

    }

    private void setPopupMenu(final int RowIndex) {
        popMenu = new JPopupMenu();
        menuItem = new JMenuItem("Block");
        popMenu.add(menuItem);
        menuItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String ID = tblBranches.getModel().getValueAt(RowIndex, 0).toString();
                Branches branches = new Branches();
                branches.setBranchesID(ID);
                branches.setBlock(1);
                boolean ok = branches.updateBlock();
                if (ok) {
                    Vector data = Branches.getList("Select * From [Branches]");
                    ShowData(data);
                } else {
                    JOptionPane.showConfirmDialog(null, "Fail");
                }
            }
        });
        tblBranches.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent me) {
                if (me.isPopupTrigger()) {
                    popMenu.show(me.getComponent(), me.getX(), me.getY());
                }
            }

            public void mouseReleased(MouseEvent Me) {
                if (Me.isPopupTrigger()) {
                    popMenu.show(Me.getComponent(), Me.getX(), Me.getY());
                }
            }
        });

    }

    private void ShowData(Vector data) {
        Vector column = new Vector();
        column.addElement("BranchesID");
        column.addElement("Name");
        column.addElement("Address");
        column.addElement("Email");
        column.addElement("Phone");
        column.addElement("Block");
        TableModel model = new DefaultTableModel(data, column);
        tblBranches.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdSearchCode = new javax.swing.JRadioButton();
        rdSearchName = new javax.swing.JRadioButton();
        txfSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBranches = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfPhone = new javax.swing.JTextField();
        txfAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        txfEmail = new javax.swing.JTextField();
        txfCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Branches Manager");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Control"));

        buttonGroup1.add(rdSearchCode);
        rdSearchCode.setSelected(true);
        rdSearchCode.setText("Search by ID");

        buttonGroup1.add(rdSearchName);
        rdSearchName.setText("Search by Name");

        txfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(rdSearchCode)
                .addGap(18, 18, 18)
                .addComponent(rdSearchName)
                .addGap(18, 18, 18)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdSearchCode)
                    .addComponent(rdSearchName)
                    .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        tblBranches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBranches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBranchesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBranches);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "New - Update"));

        jLabel3.setText("Address:");

        jLabel4.setText("Email:");

        jLabel5.setText("Phone:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setText("Name:");

        jLabel1.setText("Code:");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txfCode, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(txfAddress))
                .addGap(89, 89, 89)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit)
                    .addComponent(btnNew))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSearchKeyPressed
        // TODO add your handling code here:
        String search = txfSearch.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            {
                if (rdSearchCode.isSelected()) {
                    Vector dataSearch = Branches.Search(search, 0);
                    ShowData(dataSearch);
                } else {
                    if (rdSearchName.isSelected()) {
                        Vector dataSearch = Branches.Search(search, 1);
                        ShowData(dataSearch);
                    }
                }
            }
        }
    }//GEN-LAST:event_txfSearchKeyPressed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String Code = txfCode.getText();
        String Name = txfName.getText();
        String Address = txfAddress.getText();
        String Email = txfEmail.getText();
        String Phone = txfPhone.getText();
        Branches branches = new Branches();
        branches.setAddress(Address);
        branches.setEmail(Email);
        branches.setName(Name);
        branches.setPhone(Phone);
        branches.setBranchesID(Code);
        if (flag == 1) {
            boolean ok = branches.insert();
            if (ok) {
                Vector data = Branches.getList("Select * From [Branches]");
                ShowData(data);
            } else {
                JOptionPane.showConfirmDialog(null, "Fail");
            }
        } else {
            if (flag == 0) {
                boolean ok = branches.update();
                if (ok) {
                    Vector data = Branches.getList("Select * From [Branches]");
                    ShowData(data);
                } else {
                    JOptionPane.showConfirmDialog(null, "Fail");
                }
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        flag = 1;
        txfEmail.setText(null);
        txfAddress.setText(null);
        txfCode.setText(null);
        txfPhone.setText(null);
        txfName.setText(null);
    }//GEN-LAST:event_btnNewActionPerformed

    private void tblBranchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBranchesMouseClicked
        // TODO add your handling code here:
        flag = 0;
        int RowIndex = tblBranches.getSelectedRow();
        setPopupMenu(RowIndex);
        String ID = (String) tblBranches.getModel().getValueAt(RowIndex, 0);
        String Name = (String) tblBranches.getModel().getValueAt(RowIndex, 1);
        String Address = (String) tblBranches.getModel().getValueAt(RowIndex, 2);
        String Email = (String) tblBranches.getModel().getValueAt(RowIndex, 3);
        String Phone = (String) tblBranches.getModel().getValueAt(RowIndex, 4);
        txfCode.setText(ID);
        txfAddress.setText(Address);
        txfEmail.setText(Email);
        txfPhone.setText(Phone);
        txfName.setText(Name);

    }//GEN-LAST:event_tblBranchesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BranchesManager().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdSearchCode;
    private javax.swing.JRadioButton rdSearchName;
    private javax.swing.JTable tblBranches;
    private javax.swing.JTextField txfAddress;
    private javax.swing.JTextField txfCode;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfPhone;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
