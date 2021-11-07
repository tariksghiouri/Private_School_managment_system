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
    public ArrayList<Student> getStudents() {
        return students;
    }
    //get the list of teachers
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    //get the list of Students
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getMoneyIn() {
        return moneyIn;
    }

    public void AddToMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }

    public int getMoneyOut() {
        return moneyOut;
    }

    public void AddToMoneyOut(int moneyOut) {
    moneyIn-=moneyOut;
    }

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.moneyIn = 0;
        this.moneyOut = 0;
    }
    public void displayStudents(){
        System.out.println(students);
    }
}
