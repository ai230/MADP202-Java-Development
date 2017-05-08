/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelroom;

/**
 *
 * @author yamamotoai
 */
public class UseHotelRoom {
    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom(299);
        HotelRoom room2 = new HotelRoom(1000);
        
        System.out.println("room1: $" + room1.getNightRate());
        System.out.println("room2: $" + room2.getNightRate());
        Suite s1 = new Suite(200);
        
        System.out.println("Suit1: $" + s1.getNightRate());
        
    }
}
