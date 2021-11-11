package com.company.chapter1;

// 관람객이 가지고 올 수 있는 소지품 초대장, 현금, 티켓
//
public class Bag {
    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public Bag(long amount){
        this(null,amount);
    }
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long Hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }
        else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public boolean hasInvitation(){
        return invitation != null;
    }
    public boolean hasTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }
    public void minusAmount(Long amount){
        this.amount -= amount;
    }
}
