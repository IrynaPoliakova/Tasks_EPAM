package ua.epam.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 26.09.16.
 */
public class Meteostation implements Observed {
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMesurements(int t, int p){
        temperature = t;
        pressure = p;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.handleEvent(temperature,pressure);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
