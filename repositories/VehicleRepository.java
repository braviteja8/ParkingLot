package ParkingLot1.repositories;

import ParkingLot1.models.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    HashMap<String,Vehicle>vehicleMap=new HashMap<>();
    Long prevId=0l;
    public Vehicle getVehicleByNumber(String vehicleNumber) {
        if(vehicleMap.containsKey(vehicleNumber)){
            return vehicleMap.get(vehicleNumber);
        }
        return null;
    }

    public Vehicle save(Vehicle vehicle) {
        prevId++;
        vehicle.setId(prevId);
        vehicleMap.putIfAbsent(vehicle.getVehicleNumber(),vehicle);
        return vehicleMap.get(vehicle.getVehicleNumber());
    }
}
