package tis.ticketsalesapplication;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
}
