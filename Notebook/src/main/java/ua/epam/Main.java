package ua.epam;

import ua.epam.controller.Controller;
import ua.epam.model.Model;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Model model = new Model();
            View view = new View();
            Controller controller = new Controller(model, view);
            controller.processUser();

    }
}
