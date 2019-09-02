package com.kodilla.kodillapatterns2.observer.homework;

public class BootcampMentors implements ObserverTask{
    private final String mentorName;
    private int updateCount;

    public BootcampMentors(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateQueue(TaskQueue taskQueue) {
        System.out.println(mentorName + ": new task " + taskQueue.getNameOfTask() + "\n" +
                "tasks quantity: " + taskQueue.getTasksMap().size() + " tasks");
        updateCount++;
    }

    public String getMentorsName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
