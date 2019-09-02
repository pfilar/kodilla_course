package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BootcampMentorsTestSuit {
    @Test
    public void TaskQueueUpdate() {
        //Given
        TaskQueue studentArthurWhit = new BootcampFirstEdition();
        TaskQueue studentMaxBlack = new BootcampFirstEdition();
        TaskQueue studentNicolleteRed = new BootcampSecondEdition();
        BootcampMentors johnSmith = new BootcampMentors("John Smith");
        BootcampMentors ivoneEscobar = new BootcampMentors("Ivone Escobar");

        studentArthurWhit.registerObserver(johnSmith);
        studentMaxBlack.registerObserver(ivoneEscobar);
        studentNicolleteRed.registerObserver(johnSmith);

        //When
        studentArthurWhit.addTask("Module 10", "Task 1");
        studentArthurWhit.addTask("Module 10", "Task 2");
        studentArthurWhit.addTask("Module 10", "Task 3");

        studentMaxBlack.addTask("Module 10", "Task 1");
        studentMaxBlack.addTask("Module 10", "Task 2");

        studentNicolleteRed.addTask("Module 1", "Task 5");
        studentNicolleteRed.addTask("Module 2", "Task 1");

        //Then
        assertEquals(5, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
    }

    @Test
    public void removeObserverTest() {
        //Given
        TaskQueue studentArthurWhit = new BootcampFirstEdition();
        BootcampMentors johnSmith = new BootcampMentors("John Smith");
        BootcampMentors ivoneEscobar = new BootcampMentors("Ivone Escobar");

        studentArthurWhit.registerObserver(johnSmith);
        studentArthurWhit.registerObserver(ivoneEscobar);

        //When
        studentArthurWhit.removeObserver(johnSmith);

        //Then
        assertEquals(1, studentArthurWhit.getMentors().size());
    }
}
