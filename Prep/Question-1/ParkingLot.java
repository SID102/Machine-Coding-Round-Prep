import java.util.*;

public class ParkingLot{

    List<ParkingSpot> parkingSpots;

    PriorityQueue<ParkingSpot> emptySpots;

    Map<String, ParkingSpot> vehicleToSpotMap;

    ParkingLot(int capacity){
        if(capacity<=0){
            System.out.println("capacity can only be greater than 0");
            return;
        }
        parkingSpots=new ArrayList<>();
        emptySpots = new PriorityQueue<>(
                Comparator.comparingInt(ParkingSpot::getSpotId)
        );
        vehicleToSpotMap=new HashMap<>();

        for(int i=0;i<capacity;i++){
            ParkingSpot spot=new ParkingSpot(i);
            parkingSpots.add(spot);
            emptySpots.add(spot);
        }

    }

    public boolean isFull(){
        return emptySpots.isEmpty();
    }

    public int getParkingSpotId(String vehicleId){
        if(vehicleToSpotMap.containsKey(vehicleId)){
            return vehicleToSpotMap.get(vehicleId).getSpotId();
        }
        System.out.println("vehicle not parked");
        return -1;
    }

    public void parkVehicle(Vehicle vehicle){
        if(this.isFull()){
            System.out.println("Parking lot is full");
            return;
        }
        if(vehicleToSpotMap.containsKey(vehicle.getVehicleId())){
            System.out.println("Vehicle already parked");
            return;
        }
        ParkingSpot spot=emptySpots.poll();
        spot.parkVehicle(vehicle.getVehicleId());
        vehicleToSpotMap.put(vehicle.getVehicleId(),spot);
    }

    public void removeVehicle(String vehicleId){
        if(!vehicleToSpotMap.containsKey(vehicleId)){
            System.out.println("vehicle not parked");
            return;
        }
        ParkingSpot spot=vehicleToSpotMap.get(vehicleId);
        if(spot==null){
            System.out.println("illegal spot");
            return;
        }
        emptySpots.add(spot);
        spot.emptySpot();
        vehicleToSpotMap.remove(vehicleId);
    }

}