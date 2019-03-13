package io.zipcoder.interfaces;

import java.util.Arrays;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    final private static ZipCodeWilmington instance = new ZipCodeWilmington();

    private ZipCodeWilmington() {

    }

    public static ZipCodeWilmington getInstance() {
        return instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
//        Student[] learner = Arrays.stream(students.getArray())
//                .toArray(Student[]::new);
        Student[] learner =students.getArray();
        teacher.lecture(learner,numberOfHours);
    }

    public void hostLecture(Long id, Double numberOfHours) {
       Teacher teacher = instructors.findById(id);
//       Student[] learner = Arrays.stream(students.getArray())
//               .toArray(Student[]::new);
        Student[] learner =students.getArray();
       teacher.lecture(learner,numberOfHours);
    }

}
