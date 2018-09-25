/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqb5258;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalie
 */
public class Part1Frame extends javax.swing.JFrame {

    
    /**
     * Creates new form Part1FrameRetry
     */
    public Part1Frame() {
        initComponents();
    }

    public void paint(Graphics g)
    {
        //Initial rendering of g
    	super.paint(g);
        //Initialize all values and parse the text in jTextFields to doubles from strings
    	double v1 = Double.parseDouble(jTextField1.getText());
    	double v2 = Double.parseDouble(jTextField2.getText());
    	double v3 = Double.parseDouble(jTextField3.getText());
    	double v4 = Double.parseDouble(jTextField4.getText());
    	double v5 = Double.parseDouble(jTextField5.getText());

        //New Graphics object pg; let it equal the graphics within jPanel2 (left container)
    	Graphics pg = jPanel2.getGraphics();

        //New Graphics object pg; used for more manipulation
    	Graphics pg1 = jPanel2.getGraphics();
        //Set color of pg1 manipulations to black
    	pg1.setColor(Color.black);
    	
        //Draw the x-axis
    	pg1.drawLine((int)(jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .9), (int)(jPanel2.getWidth() * .9), (int)(jPanel2.getHeight() * .9));
    	//Draw small line protruding from horizontal axis
        pg1.drawLine((int)(jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .1), (int)(jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .9));
    	
        //Draw the y-axis
    	pg1.drawLine((int)(jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .9), (int)(jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .925));
    	//Draw small line protruding from vertical axis
        pg1.drawLine((int)(jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .9), (int)(jPanel2.getWidth() * .075), (int)(jPanel2.getHeight() * .9));
    
        //Set yVal (lowest marked value of y) to 10
    	int yVal = 10;
        
        //Counter loop used to draw each tick mark on y axis
        for(int i = 11; i >= 2; i--)
    	{
            //Draw the line
    		pg1.drawLine((int)(jPanel2.getWidth() * .1 - 5), (int)(i * .75 * (jPanel2.getHeight() * .1)), (int)(jPanel2.getWidth() * .1 + 5), (int)(i * 0.75 * (jPanel2.getHeight() * .1)));
            //Draw the numbers next to corresponding ticks 
                pg1.drawString(Integer.toString(yVal), (int)(jPanel2.getWidth() * .1 - 27), (int)(i * .75 * (jPanel2.getHeight() * .1)) + 5);
            //Increase y val
                yVal += 10;
    	}

        //Let vX (value 1, 2, 3...) start at 1
    	int vX = 1;
        //Counter loop to draw ticks on x axis
    	for(int j = 2; j <= 6; j++)
    	{
                //Draw 5 ticks for the 5 value bars
    		pg1.drawLine((int)(j * 1.3 * jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .9), (int)(j * 1.3 * jPanel2.getWidth() * .1), (int)(jPanel2.getHeight() * .9 + 5));
    		//Write vX to the GUI
                pg1.drawString("v"+Integer.toString(vX), (int)(j * 1.3 * jPanel2.getWidth() * .1 - 5), (int)(jPanel2.getHeight() * .9 + 20));
    		//Increase vX until reaching the fifth (v5)
                vX++;
    	}
        
        //New Graphics object, bar
        Graphics bar = jPanel2.getGraphics();
        
        //Outer if statement checks that values are in the valid range
        if((v1 >= 0 && v1 <= 100) && (v2 >= 0 && v2 <= 100) && (v3 >= 0 && v3 <= 100) && (v4 >= 0 && v4 <= 100) && (v5 >= 0 && v5 <= 100))
        {   
            //Checks for value of vX, and assigns appropriate color, then uses fillRect() method to draw bar
            if(v1 >= 0 && v1 < 20)
            {
                bar.setColor(Color.orange);
                bar.fillRect((int)(2 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v1)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v1 >= 20 && v1 < 40)
            {
                bar.setColor(Color.gray);
                bar.fillRect((int)(2 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v1)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v1 >= 40 && v1 < 60)
            {
                bar.setColor(Color.yellow);
                bar.fillRect((int)(2 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v1)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v1 >= 60 && v1 < 80)
            {
                bar.setColor(Color.blue);
                bar.fillRect((int)(2 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v1)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v1 >= 80 && v1 <= 100)
            {
                bar.setColor(Color.red);
                bar.fillRect((int)(2 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v1)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }

            if(v2 >= 0 && v2 < 20)
            {
                bar.setColor(Color.orange);
                bar.fillRect((int)(3 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v2)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v2 >= 20 && v2 < 40)
            {
                bar.setColor(Color.gray);
                bar.fillRect((int)(3 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v2)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v2 >= 40 && v2 < 60)
            {
                bar.setColor(Color.yellow);
                bar.fillRect((int)(3 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v2)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v2 >= 60 && v2 < 80)
            {
                bar.setColor(Color.blue);
                bar.fillRect((int)(3 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v2)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v2 >= 80 && v2 <= 100)
            {
                bar.setColor(Color.red);
                bar.fillRect((int)(3 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v2)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }

            if(v3 >= 0 && v3 < 20)
            {
                bar.setColor(Color.orange);
                bar.fillRect((int)(4 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v3)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v3 >= 20 && v3 < 40)
            {
                bar.setColor(Color.gray);
                bar.fillRect((int)(4 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v3)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v3 >= 40 && v3 < 60)
            {
                bar.setColor(Color.yellow);
                bar.fillRect((int)(4 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v3)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v3 >= 60 && v3 < 80)
            {
                bar.setColor(Color.blue);
                bar.fillRect((int)(4 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v3)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v3 >= 80 && v3 <= 100)
            {
                bar.setColor(Color.red);
                bar.fillRect((int)(4 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v3)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }

            if(v4 >= 0 && v4 < 20)
            {
                bar.setColor(Color.orange);
                bar.fillRect((int)(5 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v4)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v4 >= 20 && v4 < 40)
            {
                bar.setColor(Color.gray);
                bar.fillRect((int)(5 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v4)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v4 >= 40 && v4 < 60)
            {
                bar.setColor(Color.yellow);
                bar.fillRect((int)(5 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v4)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v4 >= 60 && v4 < 80)
            {
                bar.setColor(Color.blue);
                bar.fillRect((int)(5 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v4)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v4 >= 80 && v4 <= 100)
            {
                bar.setColor(Color.red);
                bar.fillRect((int)(5 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v4)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }

            if(v5 >= 0 && v5 < 20)
            {
                bar.setColor(Color.orange);
                bar.fillRect((int)(6 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v5)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v5 >= 20 && v5 < 40)
            {
                bar.setColor(Color.gray);
                bar.fillRect((int)(6 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v5)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v5 >= 40 && v5 < 60)
            {
                bar.setColor(Color.yellow);
                bar.fillRect((int)(6 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v5)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v5 >= 60 && v5 < 80)
            {
                bar.setColor(Color.blue);
                bar.fillRect((int)(6 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v5)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
            else if(v5 >= 80 && v5 <= 100)
            {
                bar.setColor(Color.red);
                bar.fillRect((int)(6 * 1.3 * jPanel2.getWidth() * .1 - 15), (int)(jPanel2.getHeight() * .9), 30, -(int)((v5)/10 * 0.75 * (jPanel2.getHeight() * .1)));
            }
        }
        //If there is one or more value beyond the valid range (< 0 or > 100)...
        else
        {
            //Then produce error popup
            JOptionPane.showMessageDialog(null, "Error:  Value out of range.");
        }
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 300));

        jLabel1.setText("v1:");

        jTextField1.setText("12.5");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("v2:");

        jTextField2.setText("88.2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("v3:");

        jTextField3.setText("33.86");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setText("v4:");

        jTextField4.setText("95.65");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel5.setText("v5:");

        jTextField5.setText("62.13");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Part1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Part1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Part1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Part1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        int i = 1;
        int j = 2;
        int k = 9;
        
        if(i > 2)
            if(j > 4)
               System.out.print("A");
            else if(j < 3)
                System.out.print("B");
        System.out.print("C");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Part1Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
