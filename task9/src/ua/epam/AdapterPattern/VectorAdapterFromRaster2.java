package ua.epam.AdapterPattern;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class VectorAdapterFromRaster2 implements VectorGraphicInterface {
    RasterGraphics raster = new RasterGraphics();

    public void drawLine(){
        raster.drawRasterLine();
    }

    public void drawSquare(){
        raster.drawRasterSquare();
    }
}
