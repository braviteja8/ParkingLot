package ParkingLot1.models;

import java.util.List;

public class ParkingFloor extends BaseModel{

    private List<ParkingSlot> parkingSlots;
    private int floorNumber;

    public ParkingFloor(List<ParkingSlot> parkingSlots,int floorNumber) {
        this.parkingSlots = parkingSlots;
        this.floorNumber=floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
