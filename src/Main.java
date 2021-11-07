
import school.managment.School;
import school.managment.Student;
import school.managment.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers=new ArrayList<>( );

        teachers.add( new Teacher(1,"ali ahmed", 5000 ));
        teachers.add( new Teacher(3,"tarik ramadan", 3000));
        teachers.add(  new Teacher(4,"moubarak ahmed", 5000));
        teachers.add(  new Teacher(2,"ali houssain", 2070));
        Teacher t1=new Teacher(123,"elkant alami", 5000);
        ArrayList<Student> students=new ArrayList<>( );

        students.add( new Student(1,"ali ahmed", 2, 0));
        students.add( new Student(2,"fadel adam", 2, 0));
        students.add( new Student(3,"ali ismail", 2, 0));
        students.add( new Student(6,"tarek ahmed", 2, 0));
        Student S1= new Student(434,"reda molit", 6, 0);

       // School ajial_mosta9bal=new School(teachers, students);
      // System.out.println(ajial_mosta9bal.getStudents());

        S1.payFees(10800);
        S1.payFees(10800);
        S1.payFees(10000);
        System.out.println(S1);
        t1.pay(t1.getSalary());
        t1.pay(t1.getSalary());
        System.out.println(t1);
        System.out.println(t1);
        System.out.println(School.getSchoolmoney());

    }

}
