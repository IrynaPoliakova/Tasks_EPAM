package ua.epam.entity;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class Excursion {
    private Long id;
    private String name;
    private int duration;
    private int price;
    private String data;

    public Excursion(){
    }

    public Excursion(Long id, String name, int duration, int price, String data) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", data='" + data + '\'' +
                '}';
    }
}
