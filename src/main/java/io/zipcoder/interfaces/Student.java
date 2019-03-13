package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student(long l) {
        super(l);
        this.totalStudyTime = 0.0;
    }

    public void learn(double v) {
        this.totalStudyTime += v;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
