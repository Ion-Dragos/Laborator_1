package lab1;

import java.util.*;

import lab1.task2.Student;
import lab1.task2.Course;

public class Task3_4 {
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.setName("Dragos");
        stud1.setYear(2001);

        Student stud2 = new Student();
        stud2.setName("Dragos");
        stud2.setYear(2001);

        System.out.println(stud1.equals(stud2));

        Course course = new Course();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("Marius");
        s1.setYear(2010);
        s2.setName("Andreea");
        s2.setYear(2010);
        s3.setName("Ioana");
        s3.setYear(2013);

        ArrayList<Student> student_list = new ArrayList<>();
        student_list.add(s1);
        student_list.add(s2);
        student_list.add(s3);

        System.out.println(student_list);


//        student_list = course.filterYear(Integer.parseInt("2010"));
//        for(Student : student_list)
//            System.out.println(student.getName());

//        System.out.println(student_list);

    }
}
