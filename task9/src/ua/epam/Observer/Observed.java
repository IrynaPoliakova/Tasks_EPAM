package ua.epam.Observer;

/**
 * Created by irinapoliakova on 26.09.16.
 */
public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
