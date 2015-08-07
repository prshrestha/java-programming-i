/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Phonebook {

    private ArrayList<Person> phoneBook = new ArrayList<Person>();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.phoneBook.add(person);
    }

    public void printAll() {
        for (Person person : this.phoneBook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : this.phoneBook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
