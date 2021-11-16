package com.company.chapter6;

public class Theater_ch6 {
    private TicketSeller_ch6 ticketSeller;

    public Theater_ch6(TicketSeller_ch6 ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience_ch6 audience){
        ticketSeller.sellTo(audience);
    }
}
