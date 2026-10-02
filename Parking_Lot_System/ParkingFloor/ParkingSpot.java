package Parking_Lot_System.ParkingFloor;
import Parking_Lot_System.Vehicle.Vehicle;
import Parking_Lot_System.Vehicle.VehicleType;

public class ParkingSpot {
    private int id;
    private boolean occupied;
    private SpotType spotType;
    private Vehicle vehicle;

    public ParkingSpot(int id,SpotType spotType){
        this.id=id;
        this.spotType=spotType;
    }

    public ParkingSpot(int id,boolean occupied,SpotType spotType,Vehicle vehicle){
        this.id=id;
        this.occupied=occupied;
        this.spotType=spotType;
        this.vehicle=vehicle;
    }

    public boolean canFit(Vehicle vehicle){
        if(spotType == SpotType.LARGE){
            return true;
        }
        if(spotType == SpotType.COMPACT && (vehicle.getVehicleType()==VehicleType.CAR || vehicle.getVehicleType()==VehicleType.BIKE)){
            return true;
        }
        if(spotType == SpotType.BIKE && vehicle.getVehicleType()==VehicleType.BIKE){
            return true;
        }
        return false;
    }

    public boolean parkVehicle(Vehicle vehicle){
        if(occupied || !canFit(vehicle)){
            return false;
        }
        this.vehicle=vehicle;
        this.occupied=true;
        return true;
    }

    public void removeVehicle(){
        vehicle=null;
        this.occupied=false;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public SpotType getSpotType(){
        return spotType;
    }

    public int getParkingSpotId(){
        return id;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

}
