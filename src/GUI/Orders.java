/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static DB.Db.search;
import static Logger.Log.warning;
import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author abhi
 */
public class Orders extends javax.swing.JInternalFrame {

    /**
     * Creates new form Orders
     */
    String user;

    public Orders(String user) {
        initComponents();

        this.user = user;

        BasicInternalFrameTitlePane titlePane = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) this.getUI()).getNorthPane();
        this.remove(titlePane);
        this.setLocation(-8, -32);

        tableDesign();

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String date = sdf.format(d);
        tableLoad(date);
        orderSummeryLoad(date);

        jDateChooser1.setDate(d);

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
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1146, 706));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 58));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Order Details");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jTable2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "EXTRA FOOD", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setOpaque(false);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 403, 532, 234));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("0");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 644, 71, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("records found  ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 644, -1, -1));

        jTable3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEAL ID", "DATE", "WARD", "ND (NO DIET)", "1D (DIET 1)", "2D (DIET 2)", "3D (DIET 3)", "4D (DIET 4)", "3LD", "S1", "S2", "S2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setOpaque(false);
        jTable3.setShowVerticalLines(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 1106, 280));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("0");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 337, 71, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("records found  ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 337, -1, -1));

        jTable4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "MEAL", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setOpaque(false);
        jTable4.setShowVerticalLines(false);
        jScrollPane4.setViewportView(jTable4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 403, 531, 234));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 58));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Extra Food Items");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 58));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("All Wards Summary");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 357, -1, 30));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 170, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 58));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Date");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("0");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 71, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setText("records found  ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, -1, -1));

        jButton3.setBackground(new java.awt.Color(199, 199, 199));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 58));
        jButton3.setText("Print");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        tableLoad(sdf.format(jDateChooser1.getDate()));
        orderSummeryLoad(sdf.format(jDateChooser1.getDate()));

        TableModel model = jTable2.getModel();
        DefaultTableModel dtm = (DefaultTableModel) model;
        dtm.setRowCount(0);

        jLabel18.setText("0");

        TableModel model1 = jTable4.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) model;
        dtm1.setRowCount(0);
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        if (evt.getClickCount() >= 2) {
            extraFoodLoad(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int r1 = JOptionPane.showConfirmDialog(this, "Are you sure do you want to print Report", "Conform", JOptionPane.INFORMATION_MESSAGE);

        if (r1 == 0) {

            try {
//                String path = "src\\Reports\\wardsOrderSummery.jasper";
                String path = "src\\Reports\\orderSummery.jasper";

//                InputStream reportFile = null;
//                reportFile = getClass().getResourceAsStream(path);

                SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
                String date = sdf.format(jDateChooser1.getDate());

                HashMap<String, Object> map = new HashMap<>();
                map.put("Parameter1", "Daily Order Summery Report");
                map.put("Parameter2", date);
                map.put("Parameter3", user);
                map.put("Parameter4", "NHS COLOMBO");
//                map.put("Parameter5", jTable4.getValueAt(5, 2).toString());
//                map.put("Parameter6", jTable4.getValueAt(0, 2).toString());
//                map.put("Parameter7", jTable4.getValueAt(1, 2).toString());
//                map.put("Parameter8", jTable4.getValueAt(2, 2).toString());
//                map.put("Parameter9", jTable4.getValueAt(3, 2).toString());
//                map.put("Parameter10", jTable4.getValueAt(4, 2).toString());
//                map.put("Parameter11", jTable4.getValueAt(6, 2).toString());
//                map.put("Parameter12", jTable4.getValueAt(7, 2).toString());
//                map.put("Parameter13", jTable4.getValueAt(8, 2).toString());
//                map.put("Parameter14", "");

                TableModel model = jTable4.getModel();

                JRTableModelDataSource tabelDataSource = new JRTableModelDataSource(model);

                JasperPrint print = JasperFillManager.fillReport(path, map, tabelDataSource);

                JasperViewer.viewReport(print, false);

            } catch (JRException ex) {
                ex.printStackTrace();
                warning(ex);
            }

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    void tableDesign() {
        JTableHeader th = jTable2.getTableHeader();
        JTableHeader th1 = jTable3.getTableHeader();
        JTableHeader th2 = jTable4.getTableHeader();
        Font font = new Font("Century Gothic", Font.PLAIN, 14);
        th.setFont(font);
        th.setOpaque(false);
        th1.setFont(font);
        th1.setOpaque(false);
        th2.setFont(font);
        th2.setOpaque(false);
        Color cb = new Color(51, 51, 58);
        Color cf = new Color(241, 242, 246);
        th.setForeground(cf);
        th.setBackground(cb);
        th1.setForeground(cf);
        th1.setBackground(cb);
        th2.setForeground(cf);
        th2.setBackground(cb);

    }

    void tableLoad(String date) {

        TableModel model = jTable3.getModel();
        DefaultTableModel dtm = (DefaultTableModel) model;
        dtm.setRowCount(0);

        try {
            ResultSet rs = search("SELECT * FROM meal INNER JOIN ward WHERE meal.ward_master_id = ward.ward_id && meal.date = '" + date + "'");
            int i = 1;
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("meal_id"));
                v.add(rs.getString("meal.date"));
                v.add(rs.getString("ward"));

                ResultSet rs1 = search("SELECT * FROM meal_item WHERE meal_item.meal_master_id = '" + rs.getString("meal_id") + "';");

                while (rs1.next()) {
                    v.add(rs1.getString("qty"));
                }

                dtm.addRow(v);

                jLabel19.setText(String.valueOf(i));
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            warning(e);
        }

    }

    void extraFoodLoad(String mealId) {

        TableModel model = jTable2.getModel();
        DefaultTableModel dtm = (DefaultTableModel) model;
        dtm.setRowCount(0);

        try {
            ResultSet rs = search("SELECT * FROM meal_extra_item INNER JOIN food WHERE meal_extra_item.food_master_id = food.food_id && meal_extra_item.meal_master_id = '" + mealId + "'");
            int i = 1;
            while (rs.next()) {
                Vector v = new Vector();

                v.add(String.valueOf(i));
                v.add(rs.getString("food"));
                v.add(rs.getString("qty"));

                dtm.addRow(v);

                jLabel18.setText(String.valueOf(i));
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            warning(e);
        }

    }

    void orderSummeryLoad(String date) {

        TableModel model = jTable4.getModel();
        DefaultTableModel dtm = (DefaultTableModel) model;
        dtm.setRowCount(0);

        try {
            ResultSet rs = search("SELECT meal_item.diet_type, SUM(qty)  AS qty FROM meal_item INNER JOIN meal WHERE meal_item.meal_master_id = meal.meal_id && meal.date = '" + date + "' GROUP BY meal_item.diet_type ");
            int i = 1;
            while (rs.next()) {
                Vector v = new Vector();

                v.add(String.valueOf(i));
                v.add(rs.getString("diet_type"));
                v.add(rs.getString("qty"));

                dtm.addRow(v);
                i++;
            }

            ResultSet rs1 = search("SELECT food, SUM(meal_extra_item.qty) AS qty FROM meal_extra_item INNER JOIN meal INNER JOIN food WHERE meal_extra_item.meal_master_id = meal.meal_id && food.food_id = meal_extra_item.food_master_id && meal.date = '" + date + "' GROUP BY meal_extra_item.food_master_id");
            while (rs1.next()) {
                Vector v = new Vector();

                v.add(String.valueOf(i));
                v.add(rs1.getString("food"));
                v.add(rs1.getString("qty"));

                dtm.addRow(v);
                i++;
            }

            jLabel20.setText(String.valueOf(--i));

        } catch (Exception e) {
            e.printStackTrace();
            warning(e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}