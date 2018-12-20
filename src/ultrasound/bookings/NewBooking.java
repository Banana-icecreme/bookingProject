/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultrasound.bookings;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

/**
 *
 * @author ellix
 */
public class NewBooking extends javax.swing.JFrame {

    /**
     * Creates new form NewBooking
     */
    private static String initials = "--";
    private List<String> list = new ArrayList<String>();
    private String fileName = "ultrasound booking 08072018.txt";
    private boolean once = true; 

    public NewBooking(String initials) {
        initComponents();
        this.initials = initials;
        dateComboBox();
        //setDropdown();
        //timeDropDown();
    }

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
        first = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        notes = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        times = new javax.swing.JComboBox<>();
        technician = new javax.swing.JLabel();
        date = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("New Booking");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Additional Notes");

        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        menu.setText("Main Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dob)
                                    .addComponent(notes)
                                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(last)
                                    .addComponent(phone))
                                .addContainerGap(235, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date, 0, 187, Short.MAX_VALUE)
                                    .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(times, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(technician, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(menu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(technician, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        FileWriter write = null;
        try {
            write = new FileWriter(fileName, true);
            //PrintWriter write = new PrintWriter(file);
        } catch (Exception e) {
            File file = new File(fileName);
            try {
                write = new FileWriter(file);
            } catch (Exception x) {
            }
        } finally {
            //Patient a = new Patient("john", "smith", "123456789", "01011999", null, type.getSelectedItem().toString(), initials);
            Patient a = new Patient(fileName, process(first), process(last), process(phone), process(dob), process(notes), type.getSelectedItem().toString(), initials);
            try {
                //System.out.println("TYPELIST " + typelist.get(times.getSelectedIndex()));
                if (!(process(first) == null && process(last) == null && process(phone) == null && process(dob) == null && process(notes) == null)) {
                    a.write(write, list.get(times.getSelectedIndex()));
                }
                first.setText("");
                last.setText("");
                phone.setText("");
                dob.setText("");
                notes.setText("");
                timeDropDown();
            } catch (Exception x) {
            }

        }
    }//GEN-LAST:event_saveActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        this.dispose();
        new Main(initials).setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    private void setDropdown() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Urgent");
        model.addElement("Abd");
        model.addElement("18+ OBS");
        model.addElement("Thyroid");
        model.addElement("IPS");
        model.addElement("Male Pelvic or Young Female");
        model.addElement("Breast");
        model.addElement("Sctorum");
        model.addElement("Pelvic TV");
        model.addElement("Shoulder");
        model.addElement("Lump");
        model.addElement("Early OBS");
        model.addElement("Knee");
        type.setModel(model);
    }

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        timeDropDown();
    }//GEN-LAST:event_typeActionPerformed

    private void timeDropDown() {
        list.clear();
        try {
            File file = new File(fileName);
            Scanner input = new Scanner(file);
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String in = "";
            while (input.hasNext()) {
                in = input.nextLine();

                if (in.contains("status o ")) {
                    System.out.println(type.getSelectedItem().toString());
                    //System.out.println(in);
                    if (in.contains(type.getSelectedItem().toString().toLowerCase())) {
                        list.add(in);
                        model.addElement(in.substring(0, in.indexOf(" status")));
                    }

                }
            }
            times.setModel(model);
            input.close();
        } catch (Exception e) {
        }
    }

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        String line = list.get(times.getSelectedIndex());
        technician.setText("Technician: " + line.substring(line.indexOf("tech") + 5));
    }//GEN-LAST:event_timesActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
        fileName = "ultrasound booking " + date.getSelectedItem().toString().substring(0, 2) + date.getSelectedItem().toString().substring(3, 5) + date.getSelectedItem().toString().substring(6) + ".txt";
        //System.out.println("filename " + fileName);
        timeDropDown();
        if (once){
            setDropdown();
            once = false; 
        }

    }//GEN-LAST:event_dateActionPerformed

    private void dateComboBox() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            File file;

            DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");
            DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
            LocalDateTime now = LocalDateTime.now();
            int nyear = Integer.parseInt(year.format(now));
            int nmonth = Integer.parseInt(month.format(now));
            int nday = Integer.parseInt(day.format(now));

            for (int i = 0; i < 30; i++) {
                file = new File("ultrasound booking " + String.format("%02d", nday) + String.format("%02d", nmonth) + String.format("%02d", nyear) + ".txt");
                if (file.exists()) {
                    model.addElement(String.format("%02d", nday) + "/" + String.format("%02d", nmonth) + "/" + String.format("%02d", nyear));
                }
                nday++;
                if (nday == 32) {
                    switch (nmonth) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            nmonth++;
                            nday = 1;
                    }
                } else if (nday == 31) {
                    switch (nmonth) {
                        case 3:
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            nmonth++;
                            nday = 1;
                    }
                }
                if (nmonth == 2) {
                    if (nyear % 4 == 0 && nday == 30) {
                        nmonth++;
                        nday = 1;
                    } else if (nyear % 4 != 0 && nday == 29) {
                        nmonth++;
                        nday = 1;
                    }
                }
            }
            date.setModel(model);
            fileName = "ultrasound booking " + date.getSelectedItem().toString().substring(0, 2) + date.getSelectedItem().toString().substring(3, 5) + date.getSelectedItem().toString().substring(6) + ".txt";
            //System.out.println("filename " + fileName);
        } catch (Exception e) {

        }
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
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBooking(initials).setVisible(true);
            }
        });
    }

    public String process(JTextField in) {
        if (in.getText().isEmpty()) {
            return "---";
        } else {
            return in.getText();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> date;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField last;
    private javax.swing.JButton menu;
    private javax.swing.JTextField notes;
    private javax.swing.JTextField phone;
    private javax.swing.JButton save;
    private javax.swing.JLabel technician;
    private javax.swing.JComboBox<String> times;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
