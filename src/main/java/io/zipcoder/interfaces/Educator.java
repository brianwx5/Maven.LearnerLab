package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON (1200),
    WILHEM (1300),
    NHU (1400),
    FROILAN (1500),
    DOLIO (1600);

    private final Instructor instructor;

    Educator(long id) {
        Instructor instructor = new Instructor(id);
        this.instructor = instructor;
        Instructors.getInstance().add(this.instructor);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
    }

    public Double getTimeWorked() {
        return instructor.getTimeWorked();
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
