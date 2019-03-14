package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    private Double timeWorked = 0.0;

    public Instructor(long l) {
        super(l);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        Double numberOfHoursPerLearner = numberOfHours/learners.length;
        for (Learner learner: learners) {
            learner.learn(numberOfHoursPerLearner);
        }
        timeWorked += numberOfHours;
    }

    public Double getTimeWorked() {
        return timeWorked;
    }
}
