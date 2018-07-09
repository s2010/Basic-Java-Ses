package SchoolSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Teacher lizzy= new Teacher(1,"Lizzy", 30000);
        Teacher semantha= new Teacher(2,"Semantha", 250000);

        Student besh = new Student(1,"Besh",4);

        List<Teacher> teacherLsit = new ArrayList<>();
        teacherLsit.add(lizzy);
        teacherLsit.add(semantha);

        List<Student> studentList = new ArrayList<>();
        studentList.add(besh);

        School forth = new School(teacherLsit,studentList);

        System.out.println("the earnings are " + forth.getTotalMoneyEarned());

        besh.payFees(5000);
    }
}
