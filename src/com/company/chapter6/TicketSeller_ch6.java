package com.company.chapter6;

public class TicketSeller_ch6 {
    private TicketOffice_ch6 ticketOffice;

    public TicketSeller_ch6(TicketOffice_ch6 ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice_ch6 getTicketOffice() {
        return ticketOffice;
    }
}
