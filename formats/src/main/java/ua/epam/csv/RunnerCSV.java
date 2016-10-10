package ua.epam.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import ua.epam.json.Author;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iryna_Poliakova on 10/7/2016.
 */
public class RunnerCSV {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //String csvFile = "test.csv";

        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
        CSVParser parser = new CSVParser(new FileReader("src\\main\\resources\\test.csv"), format);
        List<Author> authors = new ArrayList<Author>();
        for (CSVRecord record : parser){
            Author author = new Author();
            author.setName(record.get("name"));
            author.setBirthDate(Integer.parseInt(record.get("birth")));
            author.setDeathDate(Integer.parseInt(record.get("death")));
            author.setCountry(record.get("country"));
            authors.add(author);
        }
        parser.close();
        for (Author a : authors){
            System.out.println(a.toString());
        }





    }
}
