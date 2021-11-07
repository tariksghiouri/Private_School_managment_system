package school.managment;

public class Teacher {
    private int id;
    private String FullName;
    private int salary;

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return FullName;
    }

    public int getSalary() {
        return salary;
    }

    public Teacher(int id, String fullName, int salary) {
        this.id = id;
        FullName = fullName;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return ("name:"+this.getFullName()+
                " ID: "+ this.getId() +
                " salary : " + this.getSalary());
}
}
