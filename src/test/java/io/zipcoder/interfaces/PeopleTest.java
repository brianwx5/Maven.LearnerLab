//package io.zipcoder.interfaces;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class PeopleTest {
//
//    @Test
//    public void testAdd() {
//        //Given
//        People people = new People();
//        Person person = new Person(1);
//        int expected = 1;
//
//        //When
//        people.add(person);
//        int actual = people.getArray().length;
//
//        //Then
//        Assert.assertEquals(expected,actual);
//    }
//
//
//
//    @Test
//    public void testRemove() {
//        //Given
//        People people = new People();
//        Person person = new Person(1);
//        Person person2 = new Person(2);
//        int expected = 1;
//
//        //When
//        people.add(person);
//        people.add(person2);
//        people.remove(person);
//        int actual = people.getArray().length;
//
//        //Then
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void testRemoveById() {
//        //Given
//        People people = new People();
//        Person person = new Person(1);
//        Person person2 = new Person(2);
//        int expected = 1;
//
//        //When
//        people.add(person);
//        people.add(person2);
//        people.removeById(1);
//        int actual = people.getArray().length;
//
//        //Then
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void testRemoveAll(){
//        //Given
//        //Given
//        People people = new People();
//        Person person = new Person(1);
//        Person person2 = new Person(2);
//        int expected = 0;
//
//        //When
//        people.add(person);
//        people.add(person2);
//        people.removeAll();
//        int actual = people.getArray().length;
//
//        //Then
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void testFindById() {
//        //Given
//        People people = new People();
//        Person person = new Person(1);
//        Person person2 = new Person(2);
//        Person expected = person;
//
//        //When
//        people.add(person);
//        people.add(person2);
//        Person actual = people.findById(1l);
//
//        //Then
//        Assert.assertEquals(expected,actual);
//
//    }
//
//}