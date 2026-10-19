public class ParkingSpot {
    
    private final Integer spotId;

    private String vehicleId;

    ParkingSpot(int spotId){
        this.spotId=spotId;
        this.vehicleId=null;
    }

    ParkingSpot(int spotId,String vehicleId){
        this.spotId=spotId;
        this.vehicleId=vehicleId;
    }

    int getSpotId(){
        return this.spotId;
    }

    String getVehicleId(){
        return this.vehicleId;
    }

    public boolean isEmpty(){
        return this.vehicleId==null;
    }

    public void parkVehicle(String vehicleId){
        if(!this.isEmpty()){
            System.out.println("spot already occupied");
            return;
        }
        this.vehicleId=vehicleId;
        return;
    }

    public void emptySpot(){
        if(this.isEmpty()){
            System.out.println("spot is already vacant");
            return;
        }
        this.vehicleId=null;
        return;
    }

}
