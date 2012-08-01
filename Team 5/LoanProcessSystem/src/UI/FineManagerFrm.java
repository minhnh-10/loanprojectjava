/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Service.Impl.BranchesManagerImpl;
import Service.Impl.FineDetailManagerImpl;
import Service.Impl.FineTypeManagerImpl;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author babman92
 */
public class FineManagerFrm extends javax.swing.JFrame {

    /**
     * Creates new form FineManagerFrm
     */
    FineDetailManagerImpl fineDetailMngImpl;

    public FineManagerFrm() {
        initComponents();
        this.setTitle("Fine Managerment");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        fineDetailMngImpl = new FineDetailManagerImpl();
        fineDetailMngImpl.CalFine();
        Vector source = fineDetailMngImpl.GetListFromTable("Select * From [FineDetails]");
        SetDataSoureComboboxFineType();
        setDataSourceTable(source);
    }

    public void SetDataSoureComboboxFineType() {
        FineTypeManagerImpl fineTypeImpl = new FineTypeManagerImpl();
        Vector source = fineTypeImpl.GetDataFromColumn("Description");
        ComboBoxModel cboModel = new DefaultComboBoxModel(source);
        cboSearchFineType.setModel(cboModel);
    }

    private void setDataSourceTable(Vector Data) {

//        Vector source = FineDetails.getList("Select * From [FineDetails]");
        Vector column = new Vector();
        column.addElement("FineID");
        column.addElement("AccountNo");
        column.addElement("TypeID");
        column.addElement("Money");
        column.addElement("Description");
        column.addElement("Datetime");
        TableModel tblModel = new DefaultTableModel(Data, column);
        tblFine.setModel(tblModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFine = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txfSearch = new javax.swing.JTextField();
        cboSearchFineType = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Data"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tblFine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblFine);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Control"));

        txfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfSearchKeyPressed(evt);
            }
        });

        cboSearchFineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSearchFineTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Search by Fine Type:");

        jLabel3.setText("Search By CustomerID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboSearchFineType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSearchFineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Search();
        }
    }//GEN-LAST:event_txfSearchKeyPressed

    private void cboSearchFineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSearchFineTypeActionPerformed
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_cboSearchFineTypeActionPerformed

    private void Search() {
        int indexSelected = cboSearchFineType.getSelectedIndex();
        int TypeId = -1;
        switch (indexSelected) {
            case 0:
                TypeId = 2;
                break;
            case 1:
                TypeId = 3;
                break;
            case 2:
                TypeId = 4;
                break;
            default:
                break;
        }
        Vector searchData = fineDetailMngImpl.Search(txfSearch.getText(), TypeId);
        setDataSourceTable(searchData);
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
            java.util.logging.Logger.getLogger(FineManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FineManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FineManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FineManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FineManagerFrm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboSearchFineType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFine;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
