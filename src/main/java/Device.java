/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASBN
 */
public class Device {
    public String deviceId;
    public String deviceName;
    public String brand;
    public String category;
    public String price;
    public String date;
    
    
    public Device(String deviceID, String deviceName, String brand, String category, String price, String date){
        this.deviceId = deviceID;
        this.deviceName = deviceName;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.date = date;
    }
}
