package ru.vsu.cs.knyazev.roman.utils;

import ru.vsu.cs.knyazev.roman.entity.user.User;

import java.util.ArrayList;

public class SortUtils {

    public ArrayList<User> usersSearchAge(ArrayList<User> people, int age) {
        int lowerBound = AgeUtils.limit(age)[0];
        int highBound = AgeUtils.limit(age)[1];
        ArrayList<User> result = new ArrayList<User>();
        for (User user : people) {
            if (user.getProfile().getAge() >= lowerBound && user.getProfile().getAge() <= highBound) {
                result.add(user);
            }
        }
        return result;
    }

    public void searchTown(ArrayList<User> people, String town) {
        for (User user : people) {
            if (user.getProfile().getHometown().equals(town)) {
                User tmp = user;
                people.remove(user);
                people.add(0, tmp);
            }
        }
    }

    public ArrayList<User> usersSearchGender(ArrayList<User> people, char gender) {
        ArrayList<User> result = new ArrayList<User>();
        for (User user : people) {
            if (user.getProfile().getSex() == gender) {
                result.add(user);
            }
        }
        return result;
    }

    public void searchUsersMusic(ArrayList<User> people, String music) {
        for (User user : people) {
            if (user.getProfile().getHometown().equals(music)) {
                User tmp = user;
                people.remove(user);
                people.add(0, tmp);
            }
        }
    }
}
