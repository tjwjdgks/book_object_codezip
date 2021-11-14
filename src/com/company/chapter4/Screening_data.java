package com.company.chapter4;

import java.time.LocalDateTime;

public class Screening_data {
    private Movie_data movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Movie_data getMovie() {
        return movie;
    }

    public void setMovie(Movie_data movie) {
        this.movie = movie;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public void setWhenScreened(LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
    }
}
