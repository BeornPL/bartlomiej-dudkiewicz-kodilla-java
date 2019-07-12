package com.kodilla.patterns2.observer.homework;

public interface Observalbe {
    void registerObserver(Observer observer);
    void notifyObservers();
}
