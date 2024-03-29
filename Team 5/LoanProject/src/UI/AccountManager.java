/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Process.Account;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
public class AccountManager extends javax.swing.JFrame {

    Vector list;
    Vector column;
    Account accDefault;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates new form AccountManager
     */
    public AccountManager() {
        initComponents();
        list = new Vector();
        column = new Vector();
        accDefault = new Account();
        column.addElement("AccountNo");
        column.addElement("Password");
        column.addElement("Name");
        column.addElement("BirthDay");
        column.addElement("Organization");
        column.addElement("Address");
        column.addElement("Email");
        column.addElement("Phone");
        column.addElement("Salary");
        column.addElement("RegisterDate");

        reloadData();
    }

    private void reloadData() {
        list = Account.getList();
        txtSearch.setText("");
        TableModel model = new DefaultTableModel(list, column);
        tblAccountList.setModel(model);
        tblAccountList.removeColumn(tblAccountList.getColumn("Password"));
        resetTextForm();
        txtAccountNo.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccountList = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername2 = new javax.swing.JLabel();
        txtBirthDay = new javax.swing.JTextField();
        lblUsername3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOrganization = new javax.swing.JTextArea();
        lblUsername4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblUsername5 = new javax.swing.JLabel();
        lblUsername6 = new javax.swing.JLabel();
        lblUsername7 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblUsername8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnOpen = new javax.swing.JMenuItem();
        mnNew = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        mnRefresh = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Manager");
        setPreferredSize(new java.awt.Dimension(1122, 681));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(671, 59));

        txtSearch.setPreferredSize(new java.awt.Dimension(6, 23));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search1.jpg"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/address_16.png"))); // NOI18N
        btnDetails.setText("View Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnDetails))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        tblAccountList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AccountNo", "Name", "BirthDay", "Organization", "Address", "Email", "Phone", "Salary", "RegisterDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAccountList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAccountList);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername.setText("AccountNo");

        txtAccountNo.setEditable(false);

        lblUsername1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername1.setText("Name");

        lblUsername2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername2.setText("BirthDay");

        lblUsername3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername3.setText("Organization");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(166, 56));

        txtOrganization.setColumns(20);
        txtOrganization.setRows(5);
        jScrollPane2.setViewportView(txtOrganization);

        lblUsername4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername4.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane3.setViewportView(txtAddress);

        lblUsername5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername5.setText("Email");

        lblUsername6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername6.setText("Phone");

        lblUsername7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername7.setText("Salary");

        lblUsername8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername8.setText("Password");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-16x16.png"))); // NOI18N
        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbMessage.setForeground(new java.awt.Color(255, 0, 51));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addComponent(txtBirthDay)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblUsername8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAccountNo)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addComponent(lbMessage))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUsername7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(lblUsername6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave))
                            .addComponent(txtSalary, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhone))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername8))
                .addGap(6, 6, 6)
                .addComponent(lblUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername6)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername7)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbMessage)
                .addContainerGap())
        );

        lblUsername4.getAccessibleContext().setAccessibleName("");

        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        mnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Open.png"))); // NOI18N
        mnOpen.setText("Open");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnOpen);

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button-new-icon.png"))); // NOI18N
        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnNew);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-icon.jpg"))); // NOI18N
        mnSave.setText("Save");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnSave);

        mnRefresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh-icon.jpg"))); // NOI18N
        mnRefresh.setText("Refresh");
        mnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRefreshActionPerformed(evt);
            }
        });
        jMenu1.add(mnRefresh);
        jMenu1.add(jSeparator1);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.jpg"))); // NOI18N
        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help.png"))); // NOI18N
        jMenuItem1.setText("How to use");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/information.png"))); // NOI18N
        jMenuItem2.setText("About");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        // TODO add your handling code here:
        AccountDetails form = new AccountDetails();
        form.setVisible(true);
        form.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        form.setLocationRelativeTo(null);

                
    }//GEN-LAST:event_mnOpenActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnExitActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        AccountDetails form = new AccountDetails();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         form.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtAccountNo.setEditable(true);
        resetTextForm();
    }//GEN-LAST:event_btnNewActionPerformed
    // reset text for form information
    private void resetTextForm() {
        txtAccountNo.setText("");
        txtPassword.setText("");
        txtName.setText("");
        txtBirthDay.setText("");
        txtOrganization.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtSalary.setText("");
    }
   // method process button save and menu save
    private void save() {
        // TODO add your handling code here:
        if (isValidate()) {
            if (txtAccountNo.isEditable()) {
                // insert new Account        
               setAccountDefault();
               accDefault.setRegisterDate(getCurentDate());
               boolean isOK = accDefault.register();
               if(isOK)
               {
                   lbMessage.setText("Successful!");
                   reloadData();
               }
               else
               {
                   lbMessage.setText("Insert fail!!");
               }
            } else {
               setAccountDefault();
               boolean isOK = accDefault.update();
               if(isOK)
               {
                   lbMessage.setText("Successful!");
                   reloadData();
               }
               else
               {
                   lbMessage.setText("Update fail!!");
               }
            }
        }
    }
    
    private void tblAccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountListMouseClicked
        // TODO add your handling code here:
        int index = tblAccountList.getSelectedRow();
        if (index > -1) {
            try {
                Vector acc = (Vector) list.get(index);
                txtAccountNo.setText(acc.get(0).toString());
                txtPassword.setText(acc.get(1).toString());
                txtName.setText(acc.get(2).toString());
                txtBirthDay.setText(acc.get(3).toString());
                txtOrganization.setText(acc.get(4).toString());
                txtAddress.setText(acc.get(5).toString());
                txtEmail.setText(acc.get(6).toString());
                txtPhone.setText(acc.get(7).toString());
                txtSalary.setText(acc.get(8).toString());
               
                accDefault.setAccountNo(acc.get(0).toString());
                accDefault.setPassword(acc.get(1).toString());
                accDefault.setName(acc.get(2).toString());
                accDefault.setBirthday(new java.sql.Date(dateFormat.parse(acc.get(3).toString()).getTime()));
                accDefault.setOrganization(acc.get(4).toString());
                accDefault.setAddress(acc.get(5).toString());
                accDefault.setEmail(acc.get(6).toString());
                accDefault.setPhone(acc.get(7).toString());
                accDefault.setSalary(Integer.parseInt(acc.get(8).toString()));
                accDefault.setRegisterDate(new java.sql.Date(dateFormat.parse(acc.get(9).toString()).getTime()));
            } catch (ParseException ex) {
                Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblAccountListMouseClicked
   // set value from form Information to object accDefault 
    private void setAccountDefault() {
        try {

            accDefault.setAccountNo(txtAccountNo.getText());
            accDefault.setPassword(new String(txtPassword.getPassword()));
            accDefault.setAddress(txtAddress.getText());
            accDefault.setName(txtName.getText());
            accDefault.setBirthday(new java.sql.Date(dateFormat.parse(txtBirthDay.getText().trim()).getTime()));
            accDefault.setEmail(txtEmail.getText());
            accDefault.setOrganization(txtOrganization.getText());
            accDefault.setPhone(txtPhone.getText());
            accDefault.setSalary(Integer.parseInt(txtSalary.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        save();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        list= Account.search(txtSearch.getText());  
        TableModel model = new DefaultTableModel(list, column);
        tblAccountList.setModel(model);
        tblAccountList.removeColumn(tblAccountList.getColumn("Password")); 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        // TODO add your handling code here:
        txtAccountNo.setEditable(true);
        resetTextForm();
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        // TODO add your handling code here
        save();
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRefreshActionPerformed
        // TODO add your handling code here:
        reloadData();
    }//GEN-LAST:event_mnRefreshActionPerformed

    private boolean isValidate() {
        if (txtAccountNo.getText().equals("") || txtPassword.getPassword().length == 0
                || txtName.getText().equals("")
                || txtAddress.getText().equals("") || txtBirthDay.getText().equals("")
                || txtEmail.getText().equals("") || txtOrganization.getText().equals("")
                || txtPhone.getText().equals("") || txtSalary.getText().equals("")) {
            lbMessage.setText("Can not register because has textbox is null");
            return false;
        }
        // check Format of BirthDay
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (txtBirthDay.getText().trim().length() != dateFormat.toPattern().length()) {
            lbMessage.setText("BirthDay is not valid");
            return false;
        }
        dateFormat.setLenient(false);

        try {
            //parse the inDate parameter
            dateFormat.parse(txtBirthDay.getText().trim());
        } catch (ParseException pe) {
            lbMessage.setText("BirthDay is not valid");
            return false;
        }

        // validate email
        String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (!isMatches(txtEmail.getText().trim(), regex)) {
            lbMessage.setText("Email is not valid");
            return false;
        }
        // validate salary
        regex = "\\d+";
        if (!isMatches(txtSalary.getText().trim(), regex)) {
            lbMessage.setText("Salary is not positive number ");
            return false;
        }
        //validate Phone Number
        if (!isMatches(txtPhone.getText().trim(), regex) || txtPhone.getText().trim().length() < 10 || txtPhone.getText().trim().length() > 12) {
            lbMessage.setText("Phone is not valid");
            return false;
        }
        return true;

    }

    public boolean isMatches(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public java.sql.Date getCurentDate() {
        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
        return sqlDate;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel lblUsername5;
    private javax.swing.JLabel lblUsername6;
    private javax.swing.JLabel lblUsername7;
    private javax.swing.JLabel lblUsername8;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnOpen;
    private javax.swing.JMenuItem mnRefresh;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JTable tblAccountList;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtBirthDay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtOrganization;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
