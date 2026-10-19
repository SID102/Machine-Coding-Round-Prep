public class Car implements Vehicle{
    
    private final String vehicleId;

    Car(String vehicleId){
        this.vehicleId=vehicleId; 
    }

    @Override 
    public String getVehicleId(){
        return this.vehicleId;
    }

    @Override 
    public String toString(){
        return "Car{"+
                "vehicleId="+vehicleId+
                "}";
    }
}
