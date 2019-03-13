package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void testGetInstance() {
        //Given
        Instructors instructors = Instructors.getInstance();
        Long expected = 1001l;
        Long expected2 = 1002l;
        String expectedName = "Leon";
        String expectedName2 = "Wilhem";

        //When
        Long actual = instructors.personList.get(0).getId();
        Long actual2 = instructors.personList.get(1).getId();
        String actualName = instructors.personList.get(0).getName();
        String actualName2 = instructors.personList.get(1).getName();

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedName2,actualName2);
    }

}