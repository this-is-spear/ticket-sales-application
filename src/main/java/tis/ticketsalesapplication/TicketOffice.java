package tis.ticketsalesapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by this-is-separ on 2022/05/26.
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets = tickets;
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
