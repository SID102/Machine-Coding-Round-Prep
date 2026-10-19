public class Main {
    
    public static void main(String[] args){
        ParkingLot parkingLot=new ParkingLot(3);
        Vehicle car1=new Car("car1");
        Vehicle car2=new Car("car2");
        Vehicle bike1=new Bike("bike1");
        Vehicle bike2=new Bike("bike2");

        System.out.println("Parking car1:");
        parkingLot.parkVehicle(car1);
        System.out.println("Parking car2");
        parkingLot.parkVehicle(car2);
        System.out.println("Parking bike 1");
        parkingLot.parkVehicle(bike1);
        // this should fail
        System.out.println("Parking bike 2");
        parkingLot.parkVehicle(bike2);
        //removing the vehicle 
        System.out.println("removing car1");
        parkingLot.removeVehicle(car1.getVehicleId());
        //this should park now 
        System.out.println("Parking bike 2");
        parkingLot.parkVehicle(bike2);

        System.out.println(parkingLot.getParkingSpotId(bike2.getVehicleId()));


    }

}
