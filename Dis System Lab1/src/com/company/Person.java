package com.company;
import FactoryMethod.*;
import java.io.Serializable;

public class Person implements Serializable {
    String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }
}

