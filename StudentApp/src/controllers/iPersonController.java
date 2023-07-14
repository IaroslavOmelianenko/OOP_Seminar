package controllers;

import domen.Person;

public interface iPersonController<T extends Person> {

    void create(String firstName, int age);
}
