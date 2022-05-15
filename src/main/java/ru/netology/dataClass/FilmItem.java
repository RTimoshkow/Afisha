package ru.netology.dataClass;

public class FilmItem {
    private int id;
    private String imgUrl;
    private String name;
    private String genre;

    public FilmItem(int id, String imgUrl, String name, String genre) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }
}


