package com.app.cconverter.currencymodule;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

import com.app.cconverter.Data.CurrencyCountriesSimbols;
import com.app.cconverter.utils.AlertDialg;

public class CCurrency extends JPanel {
    private JComboBox<String> currencyoptions;
    private JTextField inputValueToConvert;
    private JButton convertBtn;
    public CCurrency(){
        configUI();
        initComponents();
        buttonActionsConfig();
    }

    public void  configUI(){
        setSize(400,110);
        setLocation(70, 150);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(Box.createVerticalGlue());
        setAlignmentX(CENTER_ALIGNMENT);
        
    }
    private void initComponents(){
        // combox options config
        currencyoptions= new JComboBox<String>(CCurrencyMethods.getOptions());
        currencyoptions.setFont(new java.awt.Font("Roboto Light", 1, 14));
        //--
        // text field config
        inputValueToConvert= new JTextField();
        inputValueToConvert.setFont(new java.awt.Font("Roboto Bold", 1, 18));
        //--
        // Button config
        convertBtn= new JButton("convert");
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
    private void buttonActionsConfig(){
        convertBtn.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent event){
                convertBtn.setBackground(new Color(66, 138, 227));
            }
            public void mouseExited(java.awt.event.MouseEvent event){
                convertBtn.setBackground(new Color(43, 98, 166));
            }
            public void mouseClicked(java.awt.event.MouseEvent event){
                Double value=null;
                try{
                    value=Double.valueOf(inputValueToConvert.getText());
                    String valueconvertion=converterAction(currencyoptions.getSelectedItem().toString(), value);
                    
                    AlertDialg.alertMessage(
                    convertBtn,
                    valueconvertion,
                    "info",
                    1);
                }catch(NumberFormatException ex){
                    System.out.println(ex.getMessage());
                    AlertDialg.alertMessage(
                    convertBtn,
                    "input empty or value is not a number",
                    "error",
                    0);
                }finally{
                    inputValueToConvert.setText(null);
                }

            }
        });
    }

    private String converterAction(String type,Double value){
        return switch(type){
            case "local_to_dollar" -> CurrencyCountriesSimbols.DOLLAR.getValue()+CCurrencyMethods.FromLocal_To_Dollar(value);
            case "local_to_Euro" -> CurrencyCountriesSimbols.EURO.getValue()+CCurrencyMethods.FromLocal_To_Euro(value);
            case "local_to_PoundSterling" ->CurrencyCountriesSimbols.POUNDSTERLING.getValue()+CCurrencyMethods.FromLocal_To_PoundSterling(value);
            case "local_to_YenJp" -> CurrencyCountriesSimbols.YEN_JP.getValue()+CCurrencyMethods.FromLocal_To_YenJp(value);
            case "local_to_Won southcorea" -> CurrencyCountriesSimbols.WON_SURCOREAN.getValue()+CCurrencyMethods.FromLocal_To_WonSrCorea(value);
            default ->"";
        };
    }
}
