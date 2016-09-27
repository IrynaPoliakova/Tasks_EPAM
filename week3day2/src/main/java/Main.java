package main.java;

import java.util.*;

/**
 * Created by Iryna_Poliakova on 9/27/2016.
 */
public class Main {

    public static void main(String[] args) {

        List<?> list = new ArrayList<>(Arrays.asList(3, 3.5, 5L)); //при добавлении <?> коллекция становится константой,нельзя записать
//        list.add(3); //Integer.valueOf()
//        list.add(3.5);
//        list.add(5L);
//        list.add("three");
//        list.add('a');
        double sum = 0;
        for (Object obj : list){
            Number i = (Number) obj;
            System.out.println(i);
            sum += i.doubleValue();
        }
        Collections.unmodifiableList();

        System.out.println("sum = " + sum);
    }

}
