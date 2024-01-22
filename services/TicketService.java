package ParkingLot1.services;

import ParkingLot1.models.*;
import ParkingLot1.repositories.TicketRepository;
import ParkingLot1.strategies.ParkingPlaceAllotmentStrategy;
import ParkingLot1.dtos.IssueTicketRequest;
import ParkingLot1.exceptions.GateNotFoundException;
import ParkingLot1.exceptions.ParkingLotNotFoundException;
import ParkingLot1.repositories.GateRepository;
import ParkingLot1.repositories.ParkingLotRepository;
import ParkingLot1.repositories.VehicleRepository;
import ParkingLot1.strategies.ParkingSlotAllotmentStrategyFactory;

import java.util.Date;
import java.util.UUID;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,VehicleRepository vehicleRepository,ParkingLotRepository parkingLotRepository,TicketRepository ticketRepository) {

        this.gateRepository = gateRepository;
        this.vehicleRepository=vehicleRepository;
        this.parkingLotRepository=parkingLotRepository;
        this.ticketRepository=ticketRepository;
    }

    public Ticket issueTicket(IssueTicketRequest request) throws GateNotFoundException, ParkingLotNotFoundException {
        ///1.
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        //2.get the gate details
       Gate gate=gateRepository.findGateByGateId(request.getGateId());
       ticket.setEntryGate(gate);
       //3.vehicle details
        Vehicle vehicle=vehicleRepository.getVehicleByNumber(request.getVehicleNumber());
        if (vehicle==null) {
            vehicle=new Vehicle(request.getVehicleNumber(),request.getOwnerName(),request.getVehicleType());
           vehicleRepository.save(vehicle);
        }
        ticket.setVehicle(vehicle);
        //3.get Parkinglot
        ParkingLot parkinglot=parkingLotRepository.getParkingLot(request.getParkingLotId());
        ParkingPlaceAllotmentStrategy allotmentStrategy= parkinglot.getAllotmentStrategy();
        ParkingPlaceAllotmentStrategy parkingAllotmentRule=
                ParkingSlotAllotmentStrategyFactory.getParkingAllotmentStrategyForType(allotmentStrategy);
        ParkingSlot parkingSlot =parkingAllotmentRule.getParkingSlot(request.getVehicleType(),request.getParkingLotId());

         ticket.setParkingSlot(parkingSlot);

        //4.Ticket Number;
        ticket.setNumber(request.getOwnerName()+UUID.randomUUID());

        return ticketRepository.save(ticket);

    }
}
