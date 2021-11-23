package com.company.chapter11;

import java.time.Duration;
import java.time.LocalDateTime;


public class Call_ch11 {
    private LocalDateTime from;
    private LocalDateTime to;

    public Call_ch11(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public Duration getDuration(){
        return Duration.between(from,to);
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
