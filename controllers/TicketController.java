package ParkingLot1.controllers;

import ParkingLot1.dtos.IssueTicketRequest;
import ParkingLot1.dtos.IssueTicketResponse;
import ParkingLot1.dtos.ResponseStatus;
import ParkingLot1.exceptions.GateNotFoundException;
import ParkingLot1.exceptions.ParkingLotNotFoundException;
import ParkingLot1.models.Ticket;
import ParkingLot1.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    private static final String INVALID_GATE="Gate is not valid";
    private static final String TICKET_ISSUED_MESSAGE="Ticket issued";
    private static final String INVALID_PARKING_LOT="parkinglot is not found";
    public IssueTicketResponse IssueTicket(IssueTicketRequest request){
        Ticket ticket= null;
        try {
            ticket = ticketService.issueTicket(request);
        } catch (GateNotFoundException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE,INVALID_GATE);
        } catch (ParkingLotNotFoundException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE,INVALID_PARKING_LOT);

        }
        return new IssueTicketResponse(ticket, ResponseStatus.SUCCESS,TICKET_ISSUED_MESSAGE);


    }

}
