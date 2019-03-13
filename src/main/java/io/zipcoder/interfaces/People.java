package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class People<E extends Person> {

    protected ArrayList<E> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(E person) {
        this.personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        personList.remove(findById(id));
    }

    public Integer getCount() {
        return personList.size();
    }

    public abstract Person[] getArray();
//        Person[] personArray = personList.toArray(new Person[getCount()]);
//        return personArray; (this was the original code)


    public void removeAll() {
        personList.removeAll(personList);
    }

    public ArrayList<E> getPersonList() {
        return personList;
    }


}
