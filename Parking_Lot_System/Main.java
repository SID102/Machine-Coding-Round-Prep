package Parking_Lot_System;

import Parking_Lot_System.FeeStrategys.HourlyFeeStrategy;
import Parking_Lot_System.ParkingFloor.ParkingFloor;
import Parking_Lot_System.ParkingFloor.ParkingSpot;
import Parking_Lot_System.ParkingFloor.SpotType;
import Parking_Lot_System.Vehicle.Vehicle;
import Parking_Lot_System.Vehicle.Car;
import Parking_Lot_System.Ticket.Ticket;

public class Main {
    public static void main(String[] args){
        ParkingLot parkingLot=new ParkingLot(new HourlyFeeStrategy());
        ParkingFloor floor1=new ParkingFloor(1);
        floor1.addSpot(new ParkingSpot(1,SpotType.BIKE));
        floor1.addSpot(new ParkingSpot(2,SpotType.COMPACT));
        floor1.addSpot(new ParkingSpot(3,SpotType.LARGE));
        parkingLot.addFloor(floor1);
        
        Vehicle car=new Car("DL01AB1234");

        Ticket ticket=parkingLot.parkVehicle(car);

        System.out.println("Parked Car with Ticket ID: "+ticket.getTicketId());

        double fee=parkingLot.exitVehicle(ticket.getTicketId());
        System.out.println("Parking Fee: "+fee);

    }
}
