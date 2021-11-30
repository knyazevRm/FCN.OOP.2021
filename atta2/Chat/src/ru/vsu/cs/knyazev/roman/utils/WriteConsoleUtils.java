package ru.vsu.cs.knyazev.roman.utils;

import ru.vsu.cs.knyazev.roman.entity.user.User;

import java.util.ArrayList;

public class WriteConsoleUtils {

    public void printUsersProfile(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user.getProfile().toString());
        }
    }

    public void printUsersContact(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user.getContact().toString());
        }
    }
}
