package school.managment;

import java.util.ArrayList;

public class School {
   private ArrayList<Teacher> teachers=new ArrayList<>();
   private ArrayList<Student> students=new ArrayList<>();

    private int moneyIn;
    private int moneyOut;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, int moneyIn, int moneyOut) {
        this.teachers = teachers;
        this.students = students;
        this.moneyIn = moneyIn;
        this.moneyOut = moneyOut;
    }
}
