package Parking_Lot_System.Vehicle;

public abstract class Vehicle {

    protected String licenseNumber;

    protected VehicleType vehicleType;

    public Vehicle(String LicenseNumber, VehicleType vehicleType){
        this.licenseNumber=licenseNumber;
        this.vehicleType=vehicleType;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

}
