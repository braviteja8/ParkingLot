package ParkingLot1.strategies;

import ParkingLot1.models.ParkingSlot;
import ParkingLot1.models.VehicleType;

public interface ParkingPlaceAllotmentStrategy {
    ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId);
}
