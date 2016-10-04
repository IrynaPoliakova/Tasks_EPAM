package ua.epam.entities;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class Hall {
    private Long id;
    private String name;

    public Hall(){
    }

    public Hall(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
