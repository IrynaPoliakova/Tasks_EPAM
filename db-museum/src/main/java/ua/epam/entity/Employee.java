package ua.epam.entity;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class Employee {
    private Long id;
    private String name;
    private String position;
    private int salary;

    public Employee(){
    }

    public Employee(Long id, String position, String name, int salary) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
