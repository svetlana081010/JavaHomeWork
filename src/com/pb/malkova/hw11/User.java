package com.pb.malkova.hw11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class User {
    private String name;
    private LocalDate BdDate;
    private String number;
    private String address;
    private LocalDateTime modification;
    static List phoneBook = new ArrayList<User>();
    String usersJson = null;

    public User() {
    }

    public User(String name, LocalDate bdDate, String number, String address) {
        this.name = name;
        BdDate = bdDate;
        this.number = number;
        this.address = address;
        this.modification = LocalDateTime.now();
        addUser(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.modification = LocalDateTime.now();
    }

    public LocalDate getBdDate() {
        return BdDate;
    }

    public void setBdDate(LocalDate bdDate) {
        BdDate = bdDate;
        this.modification = LocalDateTime.now();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
        this.modification = LocalDateTime.now();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        this.modification = LocalDateTime.now();
    }

    public static Comparator<User> COMPARE_BY_ADDRESS = new Comparator<User>() {
        public int compare(User one, User other) {
            return one.getAddress().compareTo(other.getAddress());
        }
    };

    public static Comparator<User> COMPARE_BY_NAME = new Comparator<User>() {
        public int compare(User one, User other) {
            return one.getName().compareTo(other.getAddress());
        }
    };

    @Override
    public String toString() {
        return "User: " + name +
                ", BdDate: " + BdDate +
                ", number: " + number +
                ", address: " + address +
                ", modification: " + modification;
    }

    public static void addUser(User user) {
        phoneBook.add(user);
    }

    public static void removeUser(User user) {
        phoneBook.remove(user);
    }

    public static void getUser(int i) {
        System.out.println(phoneBook.get(i));
    }

    public static void setUser(int i, User newUser) {
        phoneBook.set(i, newUser);
        phoneBook.remove(phoneBook.lastIndexOf(newUser));
    }

    public static void compareUserByAddress() {
        Collections.sort(phoneBook, User.COMPARE_BY_ADDRESS);
    }

    public static void compareUserByName() {
        Collections.sort(phoneBook, User.COMPARE_BY_NAME);
    }

    public static void compare(int number) {
        if (number == 1) {
            User.compareUserByAddress();
        }
        if (number == 2) {
            User.compareUserByName();
        }
    }

    public static void showAll() {
        System.out.println("Phone Book: ");
        for (Object person : phoneBook) {
            System.out.println(person);
        }
    }

    public static String toFile() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        mapper.registerModule(module);
        String usersJson = mapper.writeValueAsString(phoneBook);
        System.out.println(usersJson);
        return usersJson;
    }

    public static void fromFile(String usersJson) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);
        List users2 = mapper.readValue(usersJson, new TypeReference<List<User>>() {
        });
        System.out.println(users2.get(0).getClass().getName());
        System.out.println(users2);
    }
}
