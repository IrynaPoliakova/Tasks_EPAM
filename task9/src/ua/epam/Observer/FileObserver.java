package ua.epam.Observer;

import javax.imageio.IIOException;
import java.io.File;
import java.io.PrintWriter;

/**
 * Created by irinapoliakova on 26.09.16.
 */
public class FileObserver implements Observer{
    public void handleEvent(int temp, int presser){
        File f;
        try {
            f = File.createTempFile("TempPreassure", "_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Погода изменилась. Температура= " + temp +  ", давление = " + presser);
            pw.println();
            pw.close();
        } catch (IIOException e){
            e.printStackTrace();
        }
    }
}
