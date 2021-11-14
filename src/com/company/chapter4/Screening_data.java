package com.company.chapter4;

import com.company.chapter2.Money;

import java.time.LocalDateTime;

public class Screening_data {
    private Movie_data movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Movie_data getMovie() {
        return movie;
    }

    public Screening_data(Movie_data movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
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
    // 개선된 코드
    public Money_data calculateFee(int audienceCount){
        switch(movie.getMovieType()){
            case AMOUNT_DISCOUNT:
                if(movie.isDiscountable(whenScreened,sequence))
                    return movie.calculateAmountDiscountedFee().times(audienceCount);
                break;
            case PERCENT_DISCOUNT:
                if(movie.isDiscountable(whenScreened,sequence))
                    return movie.calculatePecentDiscountedFee().times(audienceCount);
            case NONE_DISCOUNT:
                return movie.calculateNoneDiscountedFee().times(audienceCount);
        }
        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
