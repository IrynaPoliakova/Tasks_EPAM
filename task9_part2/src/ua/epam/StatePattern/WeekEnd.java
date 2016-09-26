package ua.epam.StatePattern;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class WeekEnd implements Activity{
    private int count = 0;

    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Rest (Zzz)");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}
