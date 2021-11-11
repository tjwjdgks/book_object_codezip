package com.company.chapter1;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void toSell(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}
