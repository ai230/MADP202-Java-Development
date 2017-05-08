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
public class HotelRoom {
    int roomNumber;
    double nightlyRate;//per night
    
//    public HotelRoom() {
//        this.roomNumber = roomNumber;
//                
//        if(roomNumber <= 299){
//           this.nightlyRate = 69.95; 
//           System.out.print("<=299");
//        }else{
//            System.out.print("300");
//            this.nightlyRate = 89.95;
//        }
//    }
    
    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
                
        if(this.roomNumber <= 299){
           this.nightlyRate = 69.95; 
        }else{
            this.nightlyRate = 89.95;
        }
    }
    
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public  double getNightRate() {
        return nightlyRate;
    }
    
}
