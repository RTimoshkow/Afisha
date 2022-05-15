package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.dataClass.FilmItem;
import ru.netology.repository.FilmRepository;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FilmManagerTest {
    @Mock
    FilmRepository repository;
    FilmManager manager;

    FilmItem first = new FilmItem(1, "first", "first", "first");
    FilmItem second = new FilmItem(2, "second", "second", "second");
    FilmItem third = new FilmItem(3, "third", "third", "third");
    FilmItem fourth = new FilmItem(4, "fourth", "fourth", "fourth");

    @Test
    void getAll() {
        FilmItem[] result = new FilmItem[]{first, second};
        Mockito.doReturn(result).when(repository).findAll();

        manager = new FilmManager(repository);

        FilmItem[] aclual = manager.getAll();
        FilmItem[] expected = new FilmItem[]{first, second};

        assertArrayEquals(aclual, expected);
    }
}