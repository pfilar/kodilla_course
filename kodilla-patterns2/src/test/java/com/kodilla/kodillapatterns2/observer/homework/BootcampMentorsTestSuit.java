package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BootcampMentorsTestSuit {

    @Test
    public void TaskQueueUpdate() {
        //Given
        TaskQueue arthurWhit = new BootcampFirstEdition();
        TaskQueue maxBlack = new BootcampFirstEdition();
        TaskQueue nicolleteRed = new BootcampSecondEdition();
        BootcampMentors johnSmith = new BootcampMentors("John Smith");
        BootcampMentors ivoneEscobar = new BootcampMentors("Ivone Escobar");

        arthurWhit.registerObserver(johnSmith);
        maxBlack.registerObserver(ivoneEscobar);
        nicolleteRed.registerObserver(johnSmith);

        //When
        arthurWhit.addTask("Module 10", "Task 1");
        arthurWhit.addTask("Module 10", "Task 2");
        arthurWhit.addTask("Module 10", "Task 3");

        maxBlack.addTask("Module 10", "Task 1");
        maxBlack.addTask("Module 10", "Task 2");

        nicolleteRed.addTask("Module 1", "Task 5");
        nicolleteRed.addTask("Module 2", "Task 1");

        //Then
        assertEquals(5, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
    }
}
