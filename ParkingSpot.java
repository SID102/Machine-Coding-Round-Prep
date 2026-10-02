import java.util.UUID;

public class ParkingSpot{

    private Integer spotId;

    private UUID vehicleId;

    ParkingSpot(Integer spotId){
        this.spotId=spotId;
        this.vehicleId=null;
    }

    public boolean isEmpty(){
        return this.vehicleId==null;
    }

    public void assignSpot(UUID vehicleId){
        this.vehicleId=vehicleId;
    }

    public void emptySpot(){
        this.vehicleId=null;
    }

}

