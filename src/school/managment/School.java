package school.managment;

import java.util.ArrayList;

public class School {
   private ArrayList<Teacher> teachers;
   private ArrayList<Student> students;
   private static int schoolmoney;

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

    public static int getSchoolmoney() {
        return schoolmoney;
    }

    public static void AddToMoneyIn(int amount) {
        schoolmoney +=amount;
    }
    public static void AddToMoneyOut(int amount) {
        schoolmoney -=amount;
    }


    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        schoolmoney = 0;
    }
    public void displayStudents(){
        System.out.println(students);
    }
}
