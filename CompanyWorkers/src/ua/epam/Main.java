package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        workerEPAM worker1 = new workerRD("Petr", 20, "Computer science", "NM", Department.AUTOMATION_TESTING);
        System.out.println(worker1.getEducation());

        workerEPAM worker2 = new workerRD("Petr", 20, "Computer science", "NM", Department.AUTOMATION_TESTING);
        System.out.println(worker1 == worker2);
        System.out.println(worker1.equals(worker2));
        System.out.println(worker1.hashCode() == worker2.hashCode());
        System.out.println(worker1.hashCode());
        System.out.println(worker2.hashCode());

    }
}
