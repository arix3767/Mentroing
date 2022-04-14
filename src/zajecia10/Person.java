package zajecia10;

import java.util.List;

public class Person {
    protected String name;
    protected String surmane;


    public Person(String name, String surmane) {
        this.name = name;
        this.surmane = surmane;
    }

    @Override
    public String toString() {
        return   name + ' ' + surmane;
    }
}
