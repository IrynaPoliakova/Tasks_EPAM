package ua.epam.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

/**
 * Created by irinapoliakova on 03.10.16.
 */
public class RunnerJSON {
    Author a1 = new Author("William Shakespeare", 1564 , 1616 );
    JSONObject json =  new JSONObject();

//    json.put("name", a1.getName());
//        json.put("birthYear" , a1.getDescription() );
//        json.put("deathYear", a1.getManufacturerId());
//        System.out.println(json.toJSONString());
//    String jString = json.toJSONString();
//
//    ObjectMapper mapper = new ObjectMapper();
//    Goods wasRead = mapper.readValue(jString, Goods.class);
//        System.out.println(wasRead);


    //CSV0 https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    //CSV1 http://www.journaldev.com/2544/java-csv-parser
    //XPATH http://freeformatter.com/xpath-tester.html
    //Jacson https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
    //XLS http://prologistic.com.ua/rabotaem-s-excel-v-java.html
}
