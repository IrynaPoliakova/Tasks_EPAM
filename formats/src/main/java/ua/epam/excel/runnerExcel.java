package ua.epam.excel;

/**
 * Created by Iryna_Poliakova on 10/7/2016.
 */
public class runnerExcel {
    public static void main(String[] args){
//        String xlsFile = "src\\main\\resources\\File1.xls";
//        System.out.println(Parser.parse(xlsFile));

        XLSparser readerXLS = new XLSparser();

        System.out.println(readerXLS.parse("Sheet1")));

    }
}
