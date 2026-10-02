package Parking_Lot_System.ParkingFloor;
import java.util.ArrayList;
import java.util.List;

import Parking_Lot_System.Vehicle.Vehicle;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSpot> parkingSpot;

    public ParkingFloor(int floorNumber){
        this.floorNumber=floorNumber;
        parkingSpot=new ArrayList<>();
    }

    public void addSpot(ParkingSpot spot){
        parkingSpot.add(spot);
    }

    public int getParkingFloorNumber(){
        return floorNumber;
    }

    public ParkingSpot findEmptySpot(Vehicle vehicle){
        for(ParkingSpot ps:parkingSpot){
            if(!ps.isOccupied()&&ps.canFit(vehicle)){
                return ps;
            }
        }
        return null;
    }

}
