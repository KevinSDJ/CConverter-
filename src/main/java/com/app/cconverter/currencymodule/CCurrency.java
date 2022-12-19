package com.app.cconverter.currencymodule;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

import com.app.cconverter.Data.CurrencyCountries;
import com.app.cconverter.utils.AlertDialg;

public class CCurrency extends JPanel {
    private JComboBox<String> currencyoptions;
    private JTextField inputValueToConvert;
    private JButton convertBtn;
    public CCurrency(){
        configUI();
        initComponents();
        buttonHoverActionConfig();
    }

    public void  configUI(){
        setSize(400,110);
        setLocation(70, 150);
        setVisible(false);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(Box.createVerticalGlue());
        setAlignmentX(CENTER_ALIGNMENT);
        
    }
    private void initComponents(){
        currencyoptions= new JComboBox<String>(CurrencyCountries.currencies());
        // combox options config
        currencyoptions.setFont(new java.awt.Font("Roboto Light", 1, 14));
        //--
        inputValueToConvert= new JTextField();
        // text field config
        inputValueToConvert.setFont(new java.awt.Font("Roboto Bold", 1, 18));

        //--
        convertBtn= new JButton("convert");
        // text field config
        convertBtn.setAlignmentX(CENTER_ALIGNMENT);
        convertBtn.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        convertBtn.setBackground(new Color(43, 98, 166));
        convertBtn.setForeground(Color.WHITE);
        convertBtn.setFocusPainted(false);
        //--
        add(currencyoptions);
        add(inputValueToConvert);
        add(Box.createRigidArea(new DimensionUIResource(10, 10)));
        add(convertBtn);
    }
    private void buttonHoverActionConfig(){
        convertBtn.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent event){
                convertBtn.setBackground(new Color(66, 138, 227));
            }
            public void mouseExited(java.awt.event.MouseEvent event){
                convertBtn.setBackground(new Color(43, 98, 166));
            }
            public void mouseClicked(java.awt.event.MouseEvent event){

                AlertDialg.alertMessage(
                    convertBtn,
                    inputValueToConvert.getText(),
                    "alert",
                    1);
            }
        });
    }

}
