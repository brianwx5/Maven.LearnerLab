package io.zipcoder.interfaces;

final public class Students extends People<Student>{

    final private static Students instance = new Students();

    private Students() {
        Student student1 = new Student(1);
        student1.setName("Ajah");
        personList.add(student1);
        Student student2 = new Student(2);
        student2.setName("Alex");
        personList.add(student2);
        Student student3 = new Student(3);
        student3.setName("Kate");
        personList.add(student3);
        Student student4 = new Student(4);
        student4.setName("Neela");
        personList.add(student4);
        Student student5 = new Student(5);
        student5.setName("Will");
        personList.add(student5);
        Student student6 = new Student(6);
        student6.setName("David");
        personList.add(student6);
        Student student7 = new Student(7);
        student7.setName("Davis");
        personList.add(student7);
        Student student8 = new Student(8);
        student8.setName("Marshilla");
        personList.add(student8);
        Student student9 = new Student(9);
        student9.setName("Christina");
        personList.add(student9);
        Student student10 = new Student(10);
        student10.setName("Charlie");
        personList.add(student10);
    }

    @Override
    public Student[] getArray() {
        Student[] studentArray = personList.toArray(new Student[0]);
        return studentArray;
    }

    public static Students getInstance() {
        return instance;
    }


}
