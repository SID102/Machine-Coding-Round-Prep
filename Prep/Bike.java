public class Bike implements  Vehicle{
    
    private final String vehicleId; 

    Bike(String vehicleId){
        this.vehicleId=vehicleId;
    }

    @Override 
    public String getVehicleId(){
        return this.vehicleId;
    }

    @Override 
    public String toString(){
        return "Bike{"+
                "vehicleId="+vehicleId+
                ")";
    }

}
