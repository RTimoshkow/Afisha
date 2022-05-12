package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.dataClass.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    FilmManager manager = new FilmManager();

    FilmItem first = new FilmItem(1, "first", "first", "first");
    FilmItem second = new FilmItem(2, "second","second","second");
    FilmItem third = new FilmItem(3,"third", "third", "third");
    FilmItem fourth = new FilmItem(4, "fourth", "fourth", "fourth");

    @Test
    void getAll() {
        manager.add(first);

        FilmItem[] aclual = manager.getAll();
        FilmItem[] expected = new FilmItem[]{first};

        assertArrayEquals(aclual, expected);
    }

    @Test
    void findLast() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        FilmItem[] aclual = manager.findLast();
        FilmItem[] expected = new FilmItem[]{third, second, first};

        assertArrayEquals(aclual, expected);
    }

    @Test
    void findLastConstrector() {
        FilmManager manager = new FilmManager(2);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        FilmItem[] aclual = manager.findLast();
        FilmItem[] expected = new FilmItem[]{third, second};

        assertArrayEquals(aclual, expected);
    }
}