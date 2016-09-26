package ua.epam.StatePattern;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class Work implements Activity {
    public void doSomething(Human context) {
        System.out.println("Work!!");
        context.setState(new WeekEnd());
    }
}
