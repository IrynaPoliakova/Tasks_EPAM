package ua.epam.Observer;

/**
 * Created by irinapoliakova on 26.09.16.
 */
public class ConsoleObservers implements Observer{
    public void handleEvent(int temp, int pressure){
        System.out.println("Погода изменилась. Температура = " + temp + ", давление = " + pressure);
    }
}
