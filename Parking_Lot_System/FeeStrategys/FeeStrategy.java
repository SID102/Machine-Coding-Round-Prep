package Parking_Lot_System.FeeStrategys;
import Parking_Lot_System.Ticket.Ticket;

public interface FeeStrategy {
    double caculateFee(Ticket ticket);
}
