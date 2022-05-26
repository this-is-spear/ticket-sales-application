package tis.ticketsalesapplication;

/**
 * Created by this-is-separ on 2022/05/26.
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;


    }
}
