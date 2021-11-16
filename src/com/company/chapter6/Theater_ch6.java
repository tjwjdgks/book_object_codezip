package com.company.chapter6;

public class Theater_ch6 {
    private TicketSeller_ch6 ticketSeller;

    public Theater_ch6(TicketSeller_ch6 ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience_ch6 audience){
        if(audience.getBag().hasInvitation()){
            Ticket_ch6 ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }
        else{
            Ticket_ch6 ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
