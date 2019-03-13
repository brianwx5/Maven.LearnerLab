package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {
        //Given
        Students students = Students.getInstance();
        Long expected = 1l;
        String expectedName = "Ajah";
        Long expected2 = 9l;
        String expectedName2 = "Christina";

        //When
        Long actual = students.getPersonList().get(0).getId();
        String actualName = students.getPersonList().get(0).getName();
        Long actual2 = students.getPersonList().get(8).getId();
        String actualName2 = students.getPersonList().get(8).getName();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expectedName2,actualName2);
    }
}