package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        //Given
        Instructor instructor = new Instructor(31);

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Instructor instructor = new Instructor(31);

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(31);
        Learner student = new Student(1);
        Double expected = 8.0;

        //When
        instructor.teach(student,8.0);
        Double actual = ((Student) student).getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(31);
        Learner student = new Student(1);
        Learner student2 = new Student(2);
        Learner[] learnerArray = {student,student2};
        Double expected = 1.0;
        Double expected2 = 1.0;

        //When
        instructor.lecture(learnerArray,2.0);
        Double actual = ((Student) student).getTotalStudyTime();
        Double actual2 = ((Student) student2).getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2,actual2);
    }

}