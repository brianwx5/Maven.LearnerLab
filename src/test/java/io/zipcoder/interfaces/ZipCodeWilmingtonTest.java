package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {


    @Test
    public void testHostLectureWithTeacher() {
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Double expected = 1.0;

        //When
        Teacher teacher = (Teacher) zipCodeWilmington.instructors.personList.get(0);
        zipCodeWilmington.hostLecture(teacher,10.0);
        Student student = (Student) zipCodeWilmington.students.personList.get(0);
        Double actual = student.getTotalStudyTime();
        Student student2 = (Student) zipCodeWilmington.students.personList.get(1);
        Double actual2 = student2.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected,actual2);
    }

    @Test
    public void testHostLecturWithId() {
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Double expected = 2.0;

        //When
        zipCodeWilmington.hostLecture(1001L,10.0);
        Student student = (Student) zipCodeWilmington.students.personList.get(0);
        Double actual = student.getTotalStudyTime();
        Student student2 = (Student) zipCodeWilmington.students.personList.get(1);
        Double actual2 = student2.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected,actual2);
    }
}