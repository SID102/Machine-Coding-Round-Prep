package vehicle;

import java.util.UUID;

public class Car implements Vehicle{
    
    private final UUID vehicleId;

    private Integer spotId;

    private final String vehcileType;

    public Car(){
        this.vehcileType=VehicleType.CAR.name();
        this.vehicleId=UUID.randomUUID();
    }

    @Override 
    public void assignSpot(int spotId){
        this.spotId=spotId;
    }

    @Override 
    public void removeSpot(){
        this.spotId=null;
    }

    @Override 
    public int getSpotId(){
        return this.spotId;
    }

    @Override
    public UUID getVehicleId(){
        return this.vehicleId;
    }
}