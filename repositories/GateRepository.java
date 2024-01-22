package ParkingLot1.repositories;

import ParkingLot1.exceptions.GateNotFoundException;
import ParkingLot1.models.Gate;

import java.util.HashMap;

public class GateRepository {
    HashMap<Long, Gate>gates=new HashMap<>();
    public Gate findGateByGateId(Long gateId) throws GateNotFoundException {
        if(gates.containsKey(gateId)){
            return gates.get(gateId);
        }
        //someone is trying to come
        //from a gate that is not existing;
        throw new GateNotFoundException();
    }
}
