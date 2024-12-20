package org.example;

import java.util.*;

public class PhoneBook<T, V> {
    private String bookName;
    private Map<T, Set<V>> phoneBook;

    PhoneBook(String bookName) {
        this.bookName = bookName;
        this.phoneBook = new HashMap<>();
    }

    public void add(T lastName, V phone) {
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new HashSet<>());
        }
        //  Set<V> phones = phoneBook.get(lastName);
        //   phones.add(phone);
        phoneBook.get(lastName).add(phone);
    }

    public void get(T lastName) {
        System.out.println(lastName + " -> " + phoneBook.get(lastName));
    }

    @Override
    public String toString() {
        return bookName;
    }

}
