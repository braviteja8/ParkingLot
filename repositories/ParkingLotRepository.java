package ParkingLot1.repositories;

import ParkingLot1.exceptions.ParkingLotNotFoundException;
import ParkingLot1.models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    HashMap<Long, ParkingLot>parkingLotHashMap=new HashMap<>();

    public ParkingLot getParkingLot(Long parkingLotId) throws ParkingLotNotFoundException {
      if(parkingLotHashMap.containsKey(parkingLotId)){
          return parkingLotHashMap.get(parkingLotId);
      }
        throw new ParkingLotNotFoundException();
    }
}
