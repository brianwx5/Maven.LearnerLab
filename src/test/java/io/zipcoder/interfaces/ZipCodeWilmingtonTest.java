package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {


    @Test
    public void testHostLectureWithTeacher() {
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Double expected = zipCodeWilmington.students.personList.get(0).getTotalStudyTime() + 1.0;
        Double expected2 = zipCodeWilmington.students.personList.get(1).getTotalStudyTime() + 1.0;


        //When
        Teacher teacher = zipCodeWilmington.instructors.personList.get(0);
        zipCodeWilmington.hostLecture(teacher,10.0);
        Student student = zipCodeWilmington.students.personList.get(0);
        Double actual = student.getTotalStudyTime();
        Student student2 = zipCodeWilmington.students.personList.get(1);
        Double actual2 = student2.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void testHostLectureWithId() {
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Double expected = zipCodeWilmington.students.personList.get(0).getTotalStudyTime() + 1.0;
        Double expected2 = zipCodeWilmington.students.personList.get(1).getTotalStudyTime() + 1.0;

        //When
        zipCodeWilmington.hostLecture(1001L,10.0);
        Student student = (Student) zipCodeWilmington.students.personList.get(0);
        Double actual = student.getTotalStudyTime();
        Student student2 = (Student) zipCodeWilmington.students.personList.get(1);
        Double actual2 = student2.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void testHostLectureWithEducator() {
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Double expected = 10.0;

        //When
        zipCodeWilmington.hostLecture(Educator.NHU,10.0);
        Double actual = Educator.NHU.getTimeWorked();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testHostLectureWithEducatorId() {
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Double expected = 10.0;

        //When
        zipCodeWilmington.hostLecture(1300L,10.0);
        Double actual = Educator.WILHEM.getTimeWorked();

        //Then
        Assert.assertEquals(expected,actual);

    }

}