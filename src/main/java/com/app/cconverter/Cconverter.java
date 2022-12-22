package com.app.cconverter;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import com.app.cconverter.currencymodule.CCurrency;
import com.app.cconverter.temperatureModule.Ctemperature;

import org.netbeans.lib.awtextra.AbsoluteLayout;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author kevinsdj
 */
public class Cconverter extends javax.swing.JFrame {
    private final JPanel panelOptions=new CCurrency();
    private final JPanel panelTemperature= new Ctemperature();
   
    private final ImageIcon image = new ImageIcon(System.getProperty("user.dir")+"/src/main/java/source/money-transfer (1).png");
    
    public Cconverter() {
        initComponents();
        extraConfigs();
        selectedConverterListenerConf();

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 181, 189));
        jPanel1.setLayout(new AbsoluteLayout());
        jComboBox1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "currency","temperature" }));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); 
        jLabel1.setText("Choose your converter");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new AbsoluteConstraints(250, 0, 520, 470));
        jPanel1.add(jLabel2, new AbsoluteConstraints(60, 100, 130, 130));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setText("CConverter +");
        jLabel3.setAlignmentX(0.5F);
        jPanel1.add(jLabel3, new AbsoluteConstraints(70, 230, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
   

    public static void main(String args[]) {
        
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new Cconverter().setVisible(true);
        });
    }

    public final void extraConfigs(){
        setTitle("Currency Converter +");
        setResizable(false);
        this.jLabel2.setIcon(image);
    }
    public final void selectedConverterListenerConf(){
        this.jComboBox1.addActionListener((ActionEvent e) -> {
            if(jComboBox1.getSelectedItem()!="None"){
                if(jComboBox1.getSelectedItem()=="currency"){
                    this.jPanel3.remove(this.panelTemperature);
                    this.jPanel3.add(this.panelOptions);
                }else if(jComboBox1.getSelectedItem()=="temperature"){
                    this.jPanel3.remove(this.panelOptions);
                    this.jPanel3.add(this.panelTemperature);
                }
                this.jPanel3.repaint();
            }else{
                this.jPanel3.remove(2);
                this.jPanel3.repaint();
            }
        });
    }
   
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
   

}
