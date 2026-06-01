package Parking_Lot_System;

import Parking_Lot_System.Ticket.Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.time.LocalDateTime;

import Parking_Lot_System.ParkingFloor.ParkingFloor;
import Parking_Lot_System.FeeStrategys.FeeStrategy;
import Parking_Lot_System.Vehicle.Vehicle;
import Parking_Lot_System.ParkingFloor.ParkingSpot;

class ParkingLot{

    private List<ParkingFloor> floors;
    private Map<String,Ticket> activeTickets;
    private FeeStrategy feeStrategy;

    public ParkingLot(FeeStrategy feeStrategy){
        this.floors=new ArrayList<>();
        this.activeTickets=new HashMap<>();
        this.feeStrategy=feeStrategy;
    }

    public void addFloor(ParkingFloor floor){
        floors.add(floor);
    }

    public Ticket parkVehicle(Vehicle vehicle){
        for(ParkingFloor floor:floors){
            ParkingSpot spot=floor.findEmptySpot(vehicle);
            if(spot!=null){
                spot.parkVehicle(vehicle);
                String ticketId=UUID.randomUUID().toString();
                Ticket ticket=new Ticket(ticketId, vehicle, spot,LocalDateTime.now());
                activeTickets.put(ticketId, ticket);
                return ticket;
            }
        }
        return null;
    }

    public double exitVehicle(String ticketId){
        Ticket ticket=activeTickets.get(ticketId);
        if(ticket == null){
            throw new RuntimeException("Invalid Ticket");
        }
        double fee = feeStrategy.caculateFee(ticket);
        ticket.getParkingSpot().removeVehicle();
        activeTickets.remove(ticketId);
        return fee;
    }

}