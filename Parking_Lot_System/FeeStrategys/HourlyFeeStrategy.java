package Parking_Lot_System.FeeStrategys;
import java.time.Duration;
import java.time.LocalDateTime;

import Parking_Lot_System.Ticket.Ticket;

public class HourlyFeeStrategy implements FeeStrategy {
    
    @Override
    public double caculateFee(Ticket ticket){
        long hours=Duration.between(ticket.getEntryTime(),LocalDateTime.now()).toHours();
        return Math.max(hours,1)*20;
    }
    
}
