package ParkingLot1.strategies;

import ParkingLot1.models.ParkingSlot;
import ParkingLot1.models.VehicleType;

public class SimpleParkingAllotStrategy implements ParkingPlaceAllotmentStrategy{
    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId) {
       //get all the floors of this parkinglot which are free(plstatus=FREE);
        //go through the free floors and return any spot
        //for this vehicle type;

        return null;
    }
}
