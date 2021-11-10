package com.company.chapter1;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets){
        this.amount = amount;
        this.tickets.addAll(List.of(tickets));
    }
    public Ticket getTicket(){
        return tickets.remove(0);
    }
    public void plusAmount(long amount){
        this.amount += amount;
    }
    public void minusAmount(long amount){
        this.amount -= amount;
    }

}
