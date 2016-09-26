package ua.epam.Strategy;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class StrategyRun {
    StrategyClient c = new StrategyClient();

    int[] arr0 = {1, 3, 2, 1};
        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr0);

    int[] arr1 = {11, 4, 2, 7, 8, 54};
        c.setStrategy(new InsertingSort());
        c.executeStrategy(arr1);

    int[] arr2 = {3, -8, 2, 0, 33, 1, 3, 2};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr2);
}
