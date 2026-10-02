package Prep;

import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

public class ParkingLot {

    private List<ParkingSpot> parkingSpots;

    PriorityQueue<Integer> emptySpot=new PriorityQueue<>();

    public ParkingLot(){
        //cureently considering 10 parking spots
        for(int i=0;i<10;i++){
            ParkingSpot parkingSpot=new ParkingSpot(i);
            this.parkingSpots.add(parkingSpot);
            emptySpot.offer(i);
        }
    }

    public int getEmptySpot(){
        if(emptySpot.isEmpty()){
            return -1;
        }
        return emptySpot.poll();
    }

    public void assignSpot(int spotId,UUID vehicleId){
        ParkingSpot parkingSpot=this.parkingSpots.get(spotId);
        parkingSpot.assignSpot(vehicleId);
    }

    public void emptySpot(int spotId){
        ParkingSpot parkingSpot=this.parkingSpots.get(spotId);
        parkingSpot.emptySpot();
        emptySpot.offer(spotId);
    }

}
