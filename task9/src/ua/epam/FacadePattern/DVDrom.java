package ua.epam.FacadePattern;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class DVDrom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load(){
        data = true;
    }

    void unLoad(){
        data = false;
    }

}
