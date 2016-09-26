package ua.epam.StatePattern;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class StateRun {
    public static void main(String[] args) {
        // write your code here
        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }

//        Human human = new Human();
//        human.setState(new Work());
//        for (int i = 0; i < 10; i++) {
//            human.doSomething();
//        }


    }
}
