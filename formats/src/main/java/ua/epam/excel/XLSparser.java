package ua.epam.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Iryna_Poliakova on 10/31/2016.
 */
public class XLSparser {
    private InputStream input;
    private HSSFWorkbook workBook;

    public XLSparser() {
        try {
            input = new FileInputStream("src\\main\\resources\\File1.xls");
            workBook = new HSSFWorkbook(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object[][] parse(String nameSheet) {
        Sheet sheet = workBook.getSheet(nameSheet);
        int rows = sheet.getPhysicalNumberOfRows();
        int column = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] result = new Object[rows][column];


        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < column; j++ ) {
                Cell cell = row.getCell(j);
                result[i][j] = (int)cell.getNumericCellValue();
            }
        }

        return result;
    }
}
