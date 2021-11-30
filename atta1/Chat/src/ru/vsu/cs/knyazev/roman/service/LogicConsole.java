package ru.vsu.cs.knyazev.roman.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.vsu.cs.knyazev.roman.entity.console.Console;
import ru.vsu.cs.knyazev.roman.entity.listUsers.CurrentListOfUsers;
import ru.vsu.cs.knyazev.roman.entity.user.User;
import ru.vsu.cs.knyazev.roman.utils.SortUtils;
import ru.vsu.cs.knyazev.roman.utils.WriteConsoleUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class LogicConsole {

    public static final Logger log = LoggerFactory.getLogger(Console.class);


    private static SortUtils utils = new SortUtils();

    private static CurrentListOfUsers currentListOfUsers = new CurrentListOfUsers();

    private static ArrayList<User> result = new ArrayList<User>();

    private static WriteConsoleUtils writeConsole = new WriteConsoleUtils();

    public static void ageChoose(int age) {
        log.info("Age selection");
        result.addAll(utils.usersSearchAge(currentListOfUsers.users, age));
    }

    public static void townChoose(String town) {
        log.info("Town selection");
        utils.searchTown(result, town);
    }
}
