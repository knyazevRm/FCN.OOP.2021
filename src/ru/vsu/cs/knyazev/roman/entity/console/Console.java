package ru.vsu.cs.knyazev.roman.entity.console;

import org.slf4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import org.slf4j.LoggerFactory;
import ru.vsu.cs.knyazev.roman.entity.listUsers.CurrentListOfUsers;
import ru.vsu.cs.knyazev.roman.entity.user.User;
import ru.vsu.cs.knyazev.roman.utils.SortUtils;
import ru.vsu.cs.knyazev.roman.utils.WriteConsoleUtils;

public class Console implements ConsoleInterface {

    public static final Logger log = LoggerFactory.getLogger(Console.class);

    private Scanner scanner = new Scanner(System.in);

    private SortUtils utils = new SortUtils();

    private CurrentListOfUsers currentListOfUsers = new CurrentListOfUsers();

    private ArrayList<User> result = new ArrayList<User>();

    private WriteConsoleUtils writeConsole = new WriteConsoleUtils();

    private void searchSoulmate() {
        log.info("Start search soulmate.");
        System.out.println("To find a soulmate, we need some parameters.");
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter partner's gender");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter partner's preferred city");
        String town = scanner.next();
        System.out.println("Enter your preferred music");
        String music = scanner.next();
        result.addAll(utils.usersSearchGender(currentListOfUsers.users, gender));
        result = utils.usersSearchAge(result, age);
        utils.searchTown(result, town);
        utils.searchUsersMusic(result, music);
        log.info("Successful search Soulmate.");
    }

    private void searchFriends() {
        log.info("Start search Friends.");
        System.out.println("-------------------");
        System.out.println("To find a friend, we need some parameters.");
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your city");
        String town = scanner.next();
        result.addAll(utils.usersSearchAge(currentListOfUsers.users, age));
        utils.searchTown(result, town);
        log.info("Successful search Friends.");
    }

    @Override
    public void begin() {
        log.info("Start program.");
        System.out.println("Hello there!");
        System.out.println("Here you can find friends and your soulmate!");
    }

    @Override
    public void search() {
        log.info("Choose search.");
        System.out.println("To find a friend, write friends or f. To skip write no");
        String input = scanner.next();
        boolean tmpFlag = true;
        while (tmpFlag) {
            if (!input.equals("no")) {
                if (input.equals("friends") || input.equals("f")) {
                    log.info("Friend search selected");
                    searchFriends();
                    tmpFlag = false;
                } else {
                    log.info("Incorrect input.");
                    System.out.println("Incorrect input. Repeat again.");
                }
            } else {
                log.info("Сhoosing the second half.");
                tmpFlag = false;
                searchSoulmate();
            }
        }
        log.info("End of search.");
    }

    @Override
    public void end() {
        log.info("Viewing results");
        writeConsole.printUsersProfile(result);
        System.out.println("Do you want to see the contacts? ");
        String chooseOfGetContact = scanner.next();
        if (chooseOfGetContact.equals("yes") || chooseOfGetContact.equals("Yes")) {
            writeConsole.printUsersContact(result);
        }
        System.out.println("Thank you for choosing our service!");
        log.info("End of the program.");
    }
}
