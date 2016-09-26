package ua.epam.StatePattern;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class Human {
    private Activity state;

    public void setState(Activity s) {
        this.state = s;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
