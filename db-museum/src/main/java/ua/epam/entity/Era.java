package ua.epam.entity;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class Era {
    private Long id;
    private String name;
    private int century;

    public Era(){
    }

    public Era(Long id, String name, int century) {
        this.id = id;
        this.name = name;
        this.century = century;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCentury() {
        return century;
    }

    public void setCentury(int century) {
        this.century = century;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Era{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", century=" + century +
                '}';
    }
}
