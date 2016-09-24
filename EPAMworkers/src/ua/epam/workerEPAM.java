package ua.epam;

/**
 * Created by Iryna_Poliakova on 9/19/2016.
 */
public class workerEPAM {
    String name;
    int age;
    String education;
    String maritalStatus;

    public workerEPAM(String name, int age, String education, String maritalStatus) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.maritalStatus = maritalStatus;
    }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }

    public String getMaritalStatus() { return maritalStatus; }
    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        workerEPAM that = (workerEPAM) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (education != null ? !education.equals(that.education) : that.education != null) return false;
        return maritalStatus != null ? maritalStatus.equals(that.maritalStatus) : that.maritalStatus == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        return result;
    }
}
