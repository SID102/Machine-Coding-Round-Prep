import vehicle.Vehicle;
import vehicle.Car;
import vehicle.Bike;

public class Main {
    public static void main(String[] args){
        ParkingLot parkingLot = new ParkingLot();

        Vehicle car1=new Car();

        int spotId=parkingLot.getEmptySpot();

        if(spotId==-1){
            System.out.println("Parking Lot is Full");
        }
        System.out.println("First vehicle spot id is:"+spotId);

        parkingLot.assignSpot(spotId,car1.getVehicleId());
        car1.assignSpot(spotId);

        Vehicle bike1=new Bike();

        int spot2=parkingLot.getEmptySpot();

        if(spot2==-1){
            System.out.println("Parking Lot is Full");
        }

        System.out.println("Second vehicle spot id is : "+spot2);

        parkingLot.assignSpot(spot2,bike1.getVehicleId());
        bike1.assignSpot(spot2);

        parkingLot.emptySpot(car1.getSpotId());

        Vehicle bike2=new Bike();

        int spot3=parkingLot.getEmptySpot();

        if(spot3==-1){
            System.out.println("Parking lot is full");
        }

        System.out.println("third vehicle parking spot id is : "+spot3);

        parkingLot.assignSpot(spot3,bike2.getVehicleId());

        bike2.assignSpot(spot3);

    }
}
