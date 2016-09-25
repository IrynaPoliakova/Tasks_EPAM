package ua.epam.AdapterPattern;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class VectorAdepterFromRaster extends RasterGraphics implements VectorGraphicInterface{
    public void drawLine(){
        drawRasterLine();
    }

    public void drawSquare(){
        drawRasterSquare();
    }
}
