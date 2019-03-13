package io.zipcoder.interfaces;

public class Person {

    final private Long id;
    public String name;

    public Person(long l) {
        this.id = l;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
