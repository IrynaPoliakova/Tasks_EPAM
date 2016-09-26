package ua.epam.Strategy;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
