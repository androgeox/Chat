package com.tassta.test.chat;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;

/**
 * Created by Georgiy on 24.05.2016.
 */
public class Person implements User {
    private String name;
    private int id;
    private boolean mOnline;
    private Image icon;
    private String notification;
    private List<Person> person;

    Person(){

    }

    public Person(String name, boolean mOnline, Image icon) {
        this.name = name;
        this.mOnline = mOnline;
        this.icon = icon;
    }

    public static  ArrayList<Person> initData(int numPerson) {
        List<Person> person = new ArrayList<>();
        for (int i = 0; i <=numPerson; i++) {
            person.add(new Person(getName(), isOnline(), getIcon()));
        }
        return person;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isOnline() {
        return mOnline;
    }

    @Override
    public Image getIcon() {
        return icon;
    }
}
