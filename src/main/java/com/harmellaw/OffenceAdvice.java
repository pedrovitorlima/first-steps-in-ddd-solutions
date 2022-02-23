package com.harmellaw;

public class OffenceAdvice {

    private final Suspect suspect;
    private final String advice;

    public OffenceAdvice(Suspect suspect, String advice) {
        this.suspect = suspect;
        this.advice = advice;
    }

    public Suspect getSuspect() {
        return this.suspect;
    }

    public String getAdvice() {
        return this.advice;
    }
}
