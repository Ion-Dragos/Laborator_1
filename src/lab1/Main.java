package lab1;

import java.util.*;

import lab1.task2.Student;
import lab1.task2.Course;

public class Main {
    public static void main(String[] args) {

        /* Task 2 */
        Course course = new Course();
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++)
            students[i] = new Student();

        students[0].setName("Dragos");
        students[0].setYear(2001);

        students[1].setName("Larisa");
        students[1].setYear(2001);

        students[2].setName("Felicia");
        students[2].setYear(2001);

        students[3].setName("Mihai");
        students[3].setYear(2000);

        students[4].setName("George");
        students[4].setYear(2000);

        course.setStudents(students);

        ArrayList<Student> student_list = course.filterYear(Integer.parseInt(args[0]));

        System.out.println("Rezultatul pentru Task2: ");
        for(Student student : student_list)
            System.out.println(student.getName());

        System.out.println();

        /* Task 3 */
        Student stud1 = new Student();
        stud1.setName("Dragos");
        stud1.setYear(2001);

        Student stud2 = new Student();
        stud2.setName("Dragos");
        stud2.setYear(2001);

        System.out.println("Rezultatul pentru Task3:\n" + stud1.equals(stud2) + '\n');

    }
}
