package com.app.cconverter.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class AlertDialg {
 
    

    public static void alertMessage(Component element,Object content,String windowMsg,int alertype){
        JOptionPane.showMessageDialog(element, content,windowMsg,alertype);
    }
}
