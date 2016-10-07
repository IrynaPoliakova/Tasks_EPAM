package ua.epam.csv;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class Author {

    public Author() {
    }

    private String name;
    private int birthDate;
    private int deathDate;
    private String country;

    public Author(String name, int birthDate, int deathDate, String country) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(int deathDate) {
        this.deathDate = deathDate;
    }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    @Override
    public String toString() {
        return "Author{" +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", deathDate=" + deathDate +
                '}';
    }
}
