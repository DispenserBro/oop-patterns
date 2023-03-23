package event.publisher;

import event.observer.Observer;

import java.util.List;

public interface Publisher {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notify(List<Observer> observers);
}
