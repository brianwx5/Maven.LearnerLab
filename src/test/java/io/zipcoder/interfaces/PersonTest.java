package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testConstructor() {
        //Given
        Person person = new Person(1L);
        Long expected = 1L;

        //When
        Long actual =person.getId();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetName() {
        //Given
        Person person = new Person(1L);
        String expected = "Leon";

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
