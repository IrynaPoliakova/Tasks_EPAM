package ua.epam.Observer;

/**
 * Created by irinapoliakova on 26.09.16.
 */
public class ObserverRun {
    public static void main(String[] args) {

        Meteostation station = new Meteostation(); //автор
        station.addObserver(new ConsoleObservers()); //подписчик

        station.setMesurements(25, 760);

    }
}
