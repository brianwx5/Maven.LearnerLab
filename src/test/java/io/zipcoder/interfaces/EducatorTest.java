package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.LEON instanceof Educator);
    }

    @Test
    public void testTeach() {
        //Given
        Student firstStudent = Students.getInstance().personList.get(0);
        Double expected = Educator.DOLIO.getTimeWorked() + 1.0;
        Educator.DOLIO.teach(firstStudent,1.0);


        //When
        Double actual = Educator.DOLIO.getTimeWorked();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testLecture () {
        //Given
        Learner[] learnerArray = Students.getInstance().getArray();
        Double expected = Educator.DOLIO.getTimeWorked() + 10.0;
        Educator.DOLIO.lecture(learnerArray,10.0);

        //When
        Double actual = Educator.DOLIO.getTimeWorked();

        //Then
        Assert.assertEquals(expected,actual);

    }


}