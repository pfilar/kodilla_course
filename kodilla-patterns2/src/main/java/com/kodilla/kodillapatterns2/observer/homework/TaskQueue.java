package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskQueue implements ObsetvableTask {
    private final List<ObserverTask> mentors;
    //private final List<String> tasksMap;
    private final Map<String, String> tasksMap;
    private final String nameOfTask;

    public TaskQueue(String nameOfTask) {
        mentors = new ArrayList<>();
        tasksMap = new HashMap<>();
        this.nameOfTask = nameOfTask;
    }

    public void addTask(String mark, String task) {
        tasksMap.put(mark, task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverTask observerTask) {
        mentors.add(observerTask);
    }

    @Override
    public void notifyObservers() {
        for (ObserverTask observerTask : mentors) {
            observerTask.updateQueue(this);
        }
    }

    @Override
    public void removeObserver(ObserverTask observerTask) {
        mentors.remove(observerTask);
    }

    public Map<String, String> getTasksMap() {
        return tasksMap;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }
}
