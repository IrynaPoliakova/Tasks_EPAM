package ua.epam.xml;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;

/**
 * Created by Iryna_Poliakova on 10/3/2016.
 */
public class Runner {
    public static void main(String[] args) throws Exception {


            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = (Document) db.parse(Runner.class.getResourceAsStream("Authors.xml"));

            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xpath = xPathFactory.newXPath();
            XPathExpression expr = xpath.compile("/authors/list/item[@id=1]/name");
            String result = (String) expr.evaluate(document, XPathConstants.STRING);
            System.out.println(result);





    }
}
