package ru.netology.manager;

import ru.netology.dataClass.FilmItem;

public class FilmManager {
    private FilmItem[] items = new FilmItem[0];
    private int limit = 10;

    public FilmManager() {

    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void add(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getAll() {
        return items;
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
