/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shippingcharges;
import javax.swing.JOptionPane;

/**
 *
 * @author MKAY
 */
public class ShippingCharges {

    public static void main(String[] args) {
        double packageWeight;
        double distance;
        int segment;
        double rate = 0;
        double shippingCharges;
        String output;
        String input;
        
        input = JOptionPane.showInputDialog("Enter package weight (in pounds): ");
        packageWeight = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the distance the package is\nto be shipped (in miles):");
        distance = Double.parseDouble(input);

        segment = (int)((449 + distance) / 500);
        
        if(packageWeight <= 2)
        {
            rate = 1.10;
        }
        if(packageWeight > 2 && packageWeight <= 6 )
        {
            rate = 2.20;
        }
        if(packageWeight > 6 && packageWeight <= 10 )
        {
            rate = 3.70;
        }
        if(packageWeight > 10)
        {
            rate = 3.80;
        }
        
        shippingCharges = segment * rate;
        
        output = String.format("Shipping charges are: %.2f", shippingCharges);
        
        JOptionPane.showMessageDialog(null, output);
        
    }
}
