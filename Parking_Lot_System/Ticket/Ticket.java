package Parking_Lot_System.Ticket;

import java.time.LocalDateTime;

import Parking_Lot_System.ParkingFloor.ParkingSpot;
import Parking_Lot_System.Vehicle.Vehicle;

public class Ticket {
    
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;

    public Ticket(String ticketId,Vehicle vehicle,ParkingSpot parkingSpot,LocalDateTime entryTime){
        this.ticketId=ticketId;
        this.entryTime=entryTime;
        this.vehicle=vehicle;
        this.parkingSpot=parkingSpot;
    }

    public LocalDateTime getEntryTime(){
        return entryTime;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public String getTicketId(){
        return ticketId;
    }

    public ParkingSpot getParkingSpot(){
        return parkingSpot;
    }
}
