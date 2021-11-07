package school.managment;

import java.util.ArrayList;

public class School {
   private ArrayList<Teacher> teachers;
   private ArrayList<Student> students;
   private int moneyIn;
   private int moneyOut;

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }

    public int getMoneyOut() {
        return moneyOut;
    }

    public void setMoneyOut(int moneyOut) {
        this.moneyOut = moneyOut;
    }

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, int moneyIn, int moneyOut) {
        this.teachers = teachers;
        this.students = students;
        this.moneyIn = moneyIn;
        this.moneyOut = moneyOut;
    }
    public void displayStudents(){
        System.out.println(students);
    }
}
