package ua.epam.entities;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class Author {

    public Author() {
    }
    private int id;
    private String name;
    private int birthDate;
    private int deathDate;

    public Author(int id, String name, int birthDate, int deathDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (id != author.id) return false;
        if (birthDate != author.birthDate) return false;
        if (deathDate != author.deathDate) return false;
        return name != null ? name.equals(author.name) : author.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + birthDate;
        result = 31 * result + deathDate;
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", deathDate=" + deathDate +
                '}';
    }
}
