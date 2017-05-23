/*
 * Copyright (C) 2017 soju
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package kontakt2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell;
import java.io.*;
import javax.swing.JFileChooser;
import org.apache.poi.POIDocument;
import org.apache.poi.POIDocument;
import org.apache.poi.*;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;


/**
 *
 * @author soju
 */
public class klientAnzeigen extends javax.swing.JFrame {

    /**
     * Creates new form klientAnzeigen
     */
    public klientAnzeigen() {
        
        initComponents();
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
        namefield = new javax.swing.JTextField();
        telfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gebfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        adressfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kvnamefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kvnummerfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        auswahl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        amtsgerichtfield = new javax.swing.JTextField();
        aktenzeichenfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Tel:");

        namefield.setEditable(false);
        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });

        telfield.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Geb:");

        gebfield.setEditable(false);
        gebfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gebfieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Adresse:");

        adressfield.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Krankenkasse:");

        kvnamefield.setEditable(false);
        kvnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kvnamefieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("KV-Nummer:");

        kvnummerfield.setEditable(false);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontakt2/show_icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        auswahl.setText("<Name / Geburtsdatum >");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("E-Mail:");

        emailfield.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Amtsgericht:");

        amtsgerichtfield.setEditable(false);

        aktenzeichenfield.setEditable(false);
        aktenzeichenfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktenzeichenfieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Aktenzeichen:");

        jMenu1.setText("Datensatz");

        jMenuItem1.setText("Bearbeiten");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Löschen");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Klient");

        jMenuItem7.setText("Berichte Anzeigen");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem6.setText("Bericht erstellen");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem5.setText("Aktennotiz erstellen");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Exportieren");

        jMenuItem3.setText("Drucken");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("E-Mail senden");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem9.setText("Word Datei");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem8.setText("Excel Datei");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(auswahl)
                        .addGap(103, 103, 103)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kvnamefield)
                            .addComponent(namefield, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(telfield)
                            .addComponent(gebfield)
                            .addComponent(adressfield)
                            .addComponent(kvnummerfield)
                            .addComponent(emailfield)
                            .addComponent(amtsgerichtfield)
                            .addComponent(aktenzeichenfield))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auswahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gebfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kvnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kvnummerfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(amtsgerichtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aktenzeichenfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String auswahlBuffer = auswahl.getText().toLowerCase();
        FileReader fr;
        try {
            String zeile = null;
        
            fr = new FileReader("kontakte.csv");
            BufferedReader br = new BufferedReader(fr);
            while ((zeile = br.readLine()) != null) {
                if(zeile.replaceAll(";", " ").toLowerCase().indexOf(auswahlBuffer) != -1) {
                    String ausgabe[] = zeile.split(";");
                    namefield.setText(ausgabe[0] + " " + ausgabe[1]);
                    telfield.setText(ausgabe[5]);
                    adressfield.setText(ausgabe[3] + " " + ausgabe[2] + " " + ausgabe[4]);
                    emailfield.setText(ausgabe[6]);
                    gebfield.setText(ausgabe[9]);
                    kvnamefield.setText(ausgabe[7]);
                    kvnummerfield.setText(ausgabe[8]);
                    amtsgerichtfield.setText(ausgabe[10]);
                    aktenzeichenfield.setText(ausgabe[11]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed

    private void kvnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kvnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kvnamefieldActionPerformed

    private void gebfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gebfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gebfieldActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String Drucksatz = namefield.getText() + "\n" + adressfield.getText() + System.lineSeparator() + " Geboren: " + gebfield.getText() + "\n " + "E-Mail: " + emailfield.getText() + "\n" + " Tel: " + telfield.getText();
        print(Drucksatz);
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed
     private void print(String text) {
         String test = "";
        PrintJob auftrag = getToolkit().getPrintJob(this, "BTRmax Klient.", null);
        if(auftrag != null) {
            Graphics graphik = auftrag.getGraphics();
            if (graphik != null) {
                graphik.setFont(new Font("TimesRoman", Font.LAYOUT_LEFT_TO_RIGHT, 14)); 
                graphik.drawString(text, 40, 70);   
                graphik.dispose();
            }
            auftrag.end();
        }
    }
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        if(namefield.getText().equals("")) {
            
        }
        else {
            createTodo creater = new createTodo();
            creater.klientfield.setText(namefield.getText());
            creater.datefield.setText(dateFormat.format(date));
            creater.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void aktenzeichenfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktenzeichenfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktenzeichenfieldActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
              if(namefield.getText().equals("")) {
            
        }
        else {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = new Date();
            createreport createre = new createreport();
            createre.klientfield.setText(namefield.getText());
            createre.aktenzeichenfield.setText(aktenzeichenfield.getText());
            createre.datefield.setText(dateFormat.format(date));
            createre.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if(namefield.getText().equals("")) {
            
        }
        else {
            showaktennotiz showak = new showaktennotiz();
            showak.klientfield.setText(namefield.getText());
            showak.jButton1.doClick();
            showak.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if(namefield.getText().equals("")) {
            
        }
        else {
            try {
                
                

       
                
                
                getDirectory getter = new getDirectory();
               
                String exportdateiname = getter.Directory() + "/" + namefield.getText().toLowerCase().replaceAll(" ", "") + "_datenblatt_exportiert.xls";
                System.out.println(exportdateiname);
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Datenblatt: " + namefield.getText());
                HSSFRow rowhead = sheet.createRow((short)0);
                rowhead.createCell(0).setCellValue("Name:");
                rowhead.createCell(1).setCellValue("Adresse:");
                rowhead.createCell(2).setCellValue("Geb:");
                rowhead.createCell(3).setCellValue("Tel:");
                rowhead.createCell(4).setCellValue("E-Mail:");
                rowhead.createCell(5).setCellValue("Amtsgericht:");
                rowhead.createCell(6).setCellValue("Aktenzeichen:");
                rowhead.createCell(7).setCellValue("Krankenversicherung:");
                rowhead.createCell(8).setCellValue("KV-Nummer:");
                HSSFRow row = sheet.createRow((short)1);
                row.createCell(0).setCellValue(namefield.getText());
                row.createCell(1).setCellValue(adressfield.getText());
                row.createCell(2).setCellValue(gebfield.getText());
                row.createCell(3).setCellValue(telfield.getText());
                row.createCell(4).setCellValue(emailfield.getText());
                row.createCell(5).setCellValue(amtsgerichtfield.getText());
                row.createCell(6).setCellValue(aktenzeichenfield.getText());
                row.createCell(7).setCellValue(kvnamefield.getText());
                row.createCell(8).setCellValue(kvnummerfield.getText());
                FileOutputStream fileOut = new FileOutputStream(exportdateiname);
                workbook.write(fileOut);
                fileOut.close();
                
                
            }
            catch (Exception ex) {
                
            }
            
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        WordprocessingMLPackage wordMLPackage;
        try {
            getDirectory getter = new getDirectory();
               
            String exportdateiname = getter.Directory() + "/" + namefield.getText().toLowerCase().replaceAll(" ", "") + "_datenblatt_exportiert.docx";
            wordMLPackage = WordprocessingMLPackage.createPackage();
            MainDocumentPart mdp = wordMLPackage.getMainDocumentPart();
            mdp.addStyledParagraphOfText("Title", "Datenblatt:" + namefield.getText() + "" );
            mdp.addParagraphOfText("Name: " + namefield.getText() );
            mdp.addParagraphOfText("Adresse: " + adressfield.getText());
            mdp.addParagraphOfText("Geb: " + gebfield.getText());
            mdp.addParagraphOfText("Tel: " + telfield.getText() );
            mdp.addParagraphOfText("E-Mail: " + emailfield.getText());
            mdp.addParagraphOfText("Zuständiges Amtsgericht: " + amtsgerichtfield.getText());
            mdp.addParagraphOfText("Aktenzeichen: " + aktenzeichenfield.getText() );
            mdp.addParagraphOfText("Krankenversicherung: " + kvnamefield.getText());
            mdp.addParagraphOfText("Krankenversicherungs-Nummer: " + kvnummerfield.getText());
            wordMLPackage.save(new java.io.File(exportdateiname) );
            
        
        } catch (InvalidFormatException ex) {
            Logger.getLogger(klientAnzeigen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Docx4JException ex) {
            Logger.getLogger(klientAnzeigen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(klientAnzeigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(klientAnzeigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(klientAnzeigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(klientAnzeigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new klientAnzeigen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField adressfield;
    public javax.swing.JTextField aktenzeichenfield;
    public javax.swing.JTextField amtsgerichtfield;
    public javax.swing.JTextField auswahl;
    private javax.swing.JTextField emailfield;
    public javax.swing.JTextField gebfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JTextField kvnamefield;
    public javax.swing.JTextField kvnummerfield;
    public javax.swing.JTextField namefield;
    public javax.swing.JTextField telfield;
    // End of variables declaration//GEN-END:variables
}
