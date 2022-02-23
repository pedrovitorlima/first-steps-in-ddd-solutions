package com.harmellaw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class APreChargeDecision {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        Suspect suspect1 = new Suspect(CriminalOffence.DANGEROUS_DRIVING);

        PreChargeDecision preChargeDecision = new PreChargeDecision();
        String advice = "I recommend you to do something";
        preChargeDecision.adviceAgainstSuspect(advice, suspect1);

        Optional<OffenceAdvice> offenceCreated = preChargeDecision.getOffenceAdvices()
                .stream()
                .filter(adv -> adv.getSuspect().equals(suspect1))
                .findFirst();

        assertTrue(offenceCreated.isPresent());
        assertEquals(advice, offenceCreated.get().getAdvice());
    }

}
