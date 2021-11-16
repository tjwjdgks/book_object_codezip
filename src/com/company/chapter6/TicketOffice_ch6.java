package com.company.chapter6;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice_ch6 {
    private Long amount;
    private List<Ticket_ch6> tickets = new ArrayList<>();

    public TicketOffice_ch6(Long amount, Ticket_ch6... tickets){
        this.amount = amount;
        this.tickets.addAll(List.of(tickets));
    }

    public Ticket_ch6 getTicket(){
        return tickets.remove(0);
    }
    public void plusAmount(long amount){
        this.amount += amount;
    }
    public void minusAmount(long amount) {
        this.amount -= amount;
    }

}
