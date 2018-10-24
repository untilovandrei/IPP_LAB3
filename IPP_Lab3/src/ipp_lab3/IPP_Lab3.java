/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab3;

import ipp_lab3.prototype.Device;
import ipp_lab3.prototype.DeviceContainer;
import ipp_lab3.prototype.Laptop;
import ipp_lab3.prototype.PC;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andrei
 */
public class IPP_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DeviceContainer.initContainer();
        
        Device device = (Device) DeviceContainer.getClone(1);
        System.out.println("I'm a "+device.getType());
        
        device = (Device) DeviceContainer.getClone(2);
        System.out.println("I'm a "+device.getType());
        
        
        
      
        
        
    }
    
}
