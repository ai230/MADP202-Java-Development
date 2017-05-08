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
public class Suite extends HotelRoom{

    public Suite(int roomNumber) {
        super(roomNumber);
        nightlyRate += 40;
    }
    
}
