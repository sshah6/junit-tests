
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
//    public static void main(String[] args) {
//        ArrayList<Integer> grades = new ArrayList<>();
//        Student student = new Student(456245623, "Alex", new ArrayList<>(grades));
//
//        student.addGrade(1);
//        student.addGrade(5);
//        student.addGrade(7);
//        student.addGrade(12);
//        System.out.println(student.getId());
//        System.out.println(student.getName());
//        System.out.println(student.getGradeAverage());
//    }

    ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(43, 44, 45));

    Student student = new Student(123456789L, "Alex", grades);

    @Test
    public void testIfArraysEquals(){
        ArrayList<Integer> newstudent = new ArrayList<>(Arrays.asList(43, 44, 45));

        Assert.assertEquals(newstudent, student.getGrades());
    }

//    @Test
//    public void testIfIdMatch(){
//        Assert.assertEquals(123, 123);
//    }
//
//    @Test
//    public void testIfAverageCorrect(){
//        Assert.assertEquals("6", "6");
//    }
}
