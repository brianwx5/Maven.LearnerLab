package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    final private static Instructors instance = new Instructors();

    private Instructors() {
        Instructor instructor1 = new Instructor(1001);
        instructor1.setName("Leon");
        personList.add(instructor1);
        Instructor instructor2 = new Instructor(1002);
        instructor2.setName("Wilhem");
        personList.add(instructor2);
        Instructor instructor3 = new Instructor(1003);
        instructor3.setName("Nhu");
        personList.add(instructor3);
        Instructor instructor4 = new Instructor(1004);
        instructor4.setName("Froilan");
        personList.add(instructor4);
        Instructor instructor5 = new Instructor(1005);
        instructor5.setName("Dolio");
        personList.add(instructor5);

    }

    @Override
    public Instructor[] getArray() {
        Instructor[] instructorArray = personList.toArray(new Instructor[0]);
        return instructorArray;
    }

    public static Instructors getInstance() {
        return instance;
    }
}
