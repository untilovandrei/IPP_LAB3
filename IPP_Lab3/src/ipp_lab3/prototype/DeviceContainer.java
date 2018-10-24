/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab3.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrei
 */
public class DeviceContainer {
    private static Map<Integer,Device> deviceMap =  new HashMap<>();
    
    public static void initContainer(){
        deviceMap.put(1,new PC());
        deviceMap.put(2, new Laptop());
    }
    
    public static Device getClone(int id) {
        try {
            return (Device) deviceMap.get(id).clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(DeviceContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
