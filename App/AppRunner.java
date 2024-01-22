package ParkingLot1.App;

import ParkingLot1.controllers.TicketController;
import ParkingLot1.repositories.GateRepository;
import ParkingLot1.repositories.ParkingLotRepository;
import ParkingLot1.repositories.TicketRepository;
import ParkingLot1.repositories.VehicleRepository;
import ParkingLot1.services.TicketService;

public class AppRunner {
   /*
   1.create gates,floors,parkingslots,parkinglot;
   option 1:you create controller for floor,gates etc;
   option 2:you can directly call repositories and create them;
    */
    GateRepository gateRepository=new GateRepository();
    ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
    TicketRepository ticketRepository=new TicketRepository();
    VehicleRepository vehicleRepository=new VehicleRepository();

    TicketService ticketService=new TicketService(gateRepository,vehicleRepository,parkingLotRepository,ticketRepository);
    TicketController ticketController=new TicketController(ticketService);


}
