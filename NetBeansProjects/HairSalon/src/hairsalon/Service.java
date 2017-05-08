/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairsalon;

/**
 *
 * @author yamamotoai
 */
public class Service {
    private String service;
    private double price;
    private int time; //minutes
    
    public Service(String service, double price, int time) {
        this.service = service;
        this.price = price;
        this.time = time;  
    }
    
    public void setservice(String service) {
        this.service = service;
    }
    
    
    public String getService() {     
        return service;
    }
    
    public int getPrice() {     
        return (int)price;
    }
    
    public int getTime() {     
        return time;
    }
    
    @Override
    public String toString() {
        String description = "";
        description += service + "   " + price + "   " + time;
        return description;
    }
    
}
