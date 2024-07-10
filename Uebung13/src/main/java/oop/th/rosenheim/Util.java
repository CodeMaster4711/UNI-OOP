package oop.th.rosenheim;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Util {
    public static <E> void reverse1(List<E> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            E temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }

    public static <E> List<E> reverse2(List<E> list) {
        List<E> reversedList;
        try {
            reversedList = list.getClass().newInstance(); // Erzeugt eine neue Instanz der Liste
            for (int i = list.size() - 1; i >= 0; i--) {
                reversedList.add(list.get(i)); // Fügt Elemente in umgekehrter Reihenfolge hinzu
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Unable to create a new list instance", e);
        }
        return reversedList;
    }
}
