package ru.vsu.cs.knyazev.roman;

import ru.vsu.cs.knyazev.roman.entity.console.Console;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        console.begin();
        console.search();
        console.end();
    }
}
