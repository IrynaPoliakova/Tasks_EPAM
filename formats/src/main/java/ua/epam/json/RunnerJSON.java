package ua.epam.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by irinapoliakova on 03.10.16.
 */
public class RunnerJSON {
    public static void main(String[] args) throws IOException {

        try {
            Author a1 = new Author("William Shakespeare", 1564, 1616, "England");
            JSONObject obj = new JSONObject();
            obj.put("name", a1.getName());
            obj.put("birthYear", a1.getBirthDate());
            obj.put("deathYear", a1.getDeathDate());
            obj.put("country", a1.getCountry());
            FileWriter file = new FileWriter("D:\\Iryna_Poliakova\\GIT_new\\test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }





//        ObjectMapper mapper = new ObjectMapper();
//        Author wasRead = mapper.readValue(jString, Author.class);
//        System.out.println(wasRead);




        //CSV0 https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
        //CSV1 http://www.journaldev.com/2544/java-csv-parser
        //XPATH http://freeformatter.com/xpath-tester.html
        //Jacson https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
        //XLS http://prologistic.com.ua/rabotaem-s-excel-v-java.html

}
