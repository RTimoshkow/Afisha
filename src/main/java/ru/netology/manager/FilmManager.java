package ru.netology.manager;

import ru.netology.dataClass.FilmItem;
import ru.netology.repository.FilmRepository;

public class FilmManager {
    private FilmRepository repository;

    public FilmManager(FilmRepository repository) {
        this.repository = repository;
    }

    public FilmManager() {
    }

    public void add(FilmItem item) {
        repository.save(item);
    }

    public FilmItem[] getAll() {
        return repository.findAll();
    }

    public void findById(int id) {
        repository.findById(id);
    }
}
