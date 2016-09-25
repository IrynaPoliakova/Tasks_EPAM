package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Operator operator1 = new Operator("Vasilii", "Petrovich");
        Robot robot1 = new Robot(1.5, 2.5);
        operator1.setRobot(robot1);
        robot1.getOperator();
    }
}
