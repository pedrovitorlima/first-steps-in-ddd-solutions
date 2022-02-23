package com.harmellaw;

import java.util.ArrayList;
import java.util.List;

public class PreChargeDecision {

    private List<OffenceAdvice> offenceAdvices;

    public PreChargeDecision() {
        this.offenceAdvices = new ArrayList<OffenceAdvice>();
    }

    public void adviceAgainstSuspect(String s, Suspect suspect) {
        this.offenceAdvices.add(new OffenceAdvice(suspect, s));
    }

    public List<OffenceAdvice> getOffenceAdvices() {
        return this.offenceAdvices;
    }
}
