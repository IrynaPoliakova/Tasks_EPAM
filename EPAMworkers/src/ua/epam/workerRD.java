package ua.epam;

/**
 * Created by Iryna_Poliakova on 9/19/2016.
 */
public class workerRD extends workerEPAM {
    Department department;

    public workerRD(String name, int age, String education, String maritalStatus, Department department) {
        super(name, age, education, maritalStatus);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof workerRD)) return false;
        if (!super.equals(o)) return false;

        workerRD workerRD = (workerRD) o;

        return department != null ? department.equals(workerRD.department) : workerRD.department == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }
}
