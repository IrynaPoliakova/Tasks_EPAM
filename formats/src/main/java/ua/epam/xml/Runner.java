package ua.epam.xml;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


/**
 * Created by Iryna_Poliakova on 10/3/2016.
 */
public class Runner {
    public static void main(String[] args) throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse("Authors.xml");

        //get all fields
        NodeList authorsList = document.getElementsByTagName("person");
        for (int i = 0; i < authorsList.getLength(); i++){
            Node a = authorsList.item(i);
            if (a.getNodeType() == Node.ELEMENT_NODE){
                Element author = (Element) a;
                String id = author.getAttribute("id");
                NodeList authorsNames = author.getChildNodes();
                for (int j = 0; j < authorsNames.getLength(); j++){
                    Node n = authorsNames.item(j);
                    if (n.getNodeType() == Node.ELEMENT_NODE){
                        Element name = (Element) n;
                        System.out.println("Person" + id + " : " + name.getTagName() + " = " + name.getTextContent());
                    }
                }
            }
        }

        //get name of the first author
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile("/authors/list/person[@id=1]/name");
        String result = (String) expr.evaluate(document , XPathConstants.STRING);
        System.out.println(result);

        //get name and id of authors
        XPathExpression exprList = xpath.compile("/authors/list/person");
        NodeList nodeList = (NodeList) exprList.evaluate(document , XPathConstants.NODESET);
        for( int i = 0; i< nodeList.getLength(); i++){
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getAttribute("id"));
            System.out.println( elem.getElementsByTagName("name")
                    .item(0).getFirstChild().getNodeValue()  );
        }

        NodeList nodeList2 = (NodeList) xpath.compile("//person").evaluate(document, XPathConstants.NODESET);
        //1 get number of elements in the list of authors
        System.out.println("Number of authors = " + nodeList2.getLength());
        for (int k = 0; k < nodeList2.getLength(); k++){
            // 2 get id attribute of athors node
            System.out.println("Id : " + xpath.compile("./@id").evaluate(nodeList2.item(k)));
            // 3 get name node
            System.out.println("Name : " + xpath.compile("./name").evaluate(nodeList2.item(k)));
        }







    }
}
