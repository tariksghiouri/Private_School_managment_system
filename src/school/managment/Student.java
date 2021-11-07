package school.managment;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFees_total() {
        return fees_total;
    }

    public int getFees_paid() {
        return fees_paid;
    }

    public void setFees_paid(int fees_paid) {
        this.fees_paid = fees_paid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(int id, String name, int grade, int fees_paid) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.fees_paid = fees_paid;
        //every new student has to pay 100000 mad
        this.fees_total = 100000;
    }
}