package com.company.chapter6;

// 관람객이 가지고 올 수 있는 소지품 초대장, 현금, 티켓
//
public class Bag_ch6 {
    private Long amount;
    private Ticket_ch6 ticket;
    private Invitation_ch6 invitation;

    public Bag_ch6(long amount){
        this(null,amount);
    }
    public Bag_ch6(Invitation_ch6 invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation(){
        return invitation != null;
    }
    public boolean hasTicket(){
        return ticket != null;
    }

    public Long hold(Ticket_ch6 ticket) {
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

    public void setTicket(Ticket_ch6 ticket) {
        this.ticket = ticket;
    }

    private void plusAmount(Long amount){
        this.amount += amount;
    }
    private void minusAmount(Long amount){
        this.amount -= amount;
    }
}
