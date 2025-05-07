package org.eternity.event.solution;

import java.time.LocalDate;

public interface RecurringPlan {
    boolean includes(LocalDate day);
    RecurringPlan reschedule(LocalDate day);
}
