package ua.epam.StatePattern;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class Radio {
    Station station;

    void setStation(Station st) {
        station = st;
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new VestiFM());
        } else if (station instanceof VestiFM) {
            setStation(new Radio7());
        }

    }

    void play() {
        station.play();
    }
}
