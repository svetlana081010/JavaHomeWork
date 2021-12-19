package com.pb.malkova.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {

        User user1 = new User("Anton", LocalDate.of(1991, 01, 12), "+380669966954", "Dnepr");
        User user2 = new User("Maria", LocalDate.of(2001, 05, 20), "+380667772255", "Kiev");
        User user3 = new User("Ann", LocalDate.of(1988, 10, 18), "+380686369912", "Odessa");
        User user4 = new User("Maxim", LocalDate.of(1990, 11, 01), "+380638789889", "Harkov");
        User.showAll();

        System.out.println("Delete User: ");
        User.removeUser(user2);
        User.showAll();

        System.out.println("Get User: ");
        User.getUser(2);

        System.out.println("Compare sort 1 - by address or 2 - by name: ");
        User.compare(2);
        User.showAll();

        System.out.println("Change User: ");
        User.setUser(0, new User("Taras", LocalDate.of(1890, 12, 03), "+380666572195", "Mariupol"));
        User.showAll();

        System.out.println("Write to file and red from file: ");
        User.toFile();
        System.out.println("Write from file: ");
        User.fromFile(User.toFile());
    }

}
