package ParkingLot1.models;

import ParkingLot1.models.ParkingStatus;
import ParkingLot1.models.VehicleType;

public class ParkingSlot extends BaseModel{
    private int number;
    private VehicleType vehicleType;
    private ParkingStatus parkingStatus;
    private ParkingFloor parkingFloor;

    public ParkingSlot(int number,VehicleType vehicleType,ParkingStatus parkingStatus,ParkingFloor parkingFloor) {
        this.number = number;
        this.vehicleType=vehicleType;
        this.parkingStatus=parkingStatus;
        this.parkingFloor=parkingFloor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
