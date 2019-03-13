package io.zipcoder.interfaces;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(1);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(1);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learn() {
        //Given
        Student student = new Student(1);
        Double expected = 8.0;

        //When
        student.learn(8.0);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual);
    }

}