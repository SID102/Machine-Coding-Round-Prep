package vehicle;

import java.util.*;

public interface Vehicle{
    public void assignSpot(int spotId);
    public void removeSpot();
    public UUID getVehicleId();
    public int getSpotId();
}