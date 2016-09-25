package ua.epam.AdapterPattern;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class AdapterRun {

    public static void main(String[] args) {

        //1-й способ: через наследование
        VectorGraphicInterface g1 = new VectorAdepterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        //2-й способ: через композицию
        VectorGraphicInterface g2 = new VectorAdapterFromRaster2();
        g2.drawLine();
        g2.drawSquare();

    }
}




