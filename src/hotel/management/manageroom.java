/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

/**
 *
 * @author ebene
 */
public class manageroom {
    private int roomNum;
    private double price;
    private String roomType;
    //
    //Creating Class Constructor
    public manageroom(){
        //this will call the other methods
    }
    public void addRoom(int roomNumber, double amt, String rType){
        roomNum = roomNumber;
        price = amt;
        roomType = rType;
    }
    
}
