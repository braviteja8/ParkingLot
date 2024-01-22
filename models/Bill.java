package ParkingLot1.models;

import ParkingLot1.strategies.BillingStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private Ticket ticket;
    private Float billAmount;
    private BillingStatus billingStatus;
    private List<Payment> payments;
    private GateType gateType;
    private Operator operator;
    private BillingStrategy billingStrategy;

}
