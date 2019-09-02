package com.kodilla.kodillapatterns2.observer.homework;

public interface ObsetvableTask {
    void registerObserver(ObserverTask observerTask);
    void notifyObservers();
    void removeObserver(ObserverTask observerTask);
}
