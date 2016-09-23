package ua.epam;

import java.util.Scanner;


/**
 * Created by Iryna_Poliakova on 9/23/2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void gameMoreLess() {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int numberToGuess = Model.rand();

        int min = 0;
        int max = 100;

        while (true) {
            System.out.println(View.INPUT_INT_DATA + "от " + min + " до " + max);
            // считывает целое число с потока ввода и сохраняем в переменную

            if (!sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                view.printMessage(View.WRONG_INPUT_TYPE);
                sc.next();
                continue;
            }

            int curr = sc.nextInt();


            if (curr < 0) {
                View.printMessage(View.ENTERED_DATA_SHOULD_BE_MORE_THAN_0);
                continue;
            }

            if (curr > 100) {
                View.printMessage(View.ENTERED_DATA_SHOULD_BE_LESS_THAN_100);
                continue;
            }

            if (curr == numberToGuess) {
                System.out.println(View.OUR_INT + numberToGuess);
                break;
            } else {
                if (curr < numberToGuess) {
                    min = curr;
                } else {
                    max = curr;
                }
            }

        }
    }
}
