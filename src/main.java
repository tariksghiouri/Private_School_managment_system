import school.managment.School;
import school.managment.Teacher;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers=new ArrayList<Teacher>( );

        teachers.add( new Teacher(1,"ali ahmed", 2000));
        teachers.add( new Teacher(3,"tarik ramadan", 3000));
        teachers.add(  new Teacher(4,"moubarak ahmed", 5000));
        teachers.add(  new Teacher(2,"ali houssain", 2070));

        System.out.println(teachers);
        System.out.println(teachers);

    }

}
