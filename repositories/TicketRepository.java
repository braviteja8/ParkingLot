package ParkingLot1.repositories;

import ParkingLot1.models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    HashMap<Long, Ticket>tickets=new HashMap<>();
    Long prevId=0l;
    public Ticket save(Ticket ticket){
        prevId++;
        ticket.setId(prevId);
        tickets.putIfAbsent(prevId,ticket);
        return ticket;
    }
}
