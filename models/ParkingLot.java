package ParkingLot1.models;

import ParkingLot1.strategies.BillingStrategy;
import ParkingLot1.strategies.ParkingPlaceAllotmentStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{

    private List<ParkingFloor> floors;
    private List<Gate>gates;
    private ParkingLotStatus parkingLotStatus;
    private ParkingPlaceAllotmentStrategy allotmentStrategy;
    private BillingStrategy billingStrategy;

    public ParkingLot(List<ParkingFloor>floors,List<Gate>gates,ParkingLotStatus parkingLotStatus) {
        this.floors=floors;
        this.gates=gates;
        this.parkingLotStatus = parkingLotStatus;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public ParkingPlaceAllotmentStrategy getAllotmentStrategy() {
        return allotmentStrategy;
    }

    public void setAllotmentStrategy(ParkingPlaceAllotmentStrategy allotmentStrategy) {
        this.allotmentStrategy = allotmentStrategy;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
