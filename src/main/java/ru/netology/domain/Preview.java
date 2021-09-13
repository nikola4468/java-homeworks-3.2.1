package ru.netology.domain;

public class Preview {
    private int picture;  // картинка превью
    private int heading; // заголовок в превью
    private int idAuthor; // автор в превью
    private int button; // ссылка на статью
    private int favorites; // добавить статью в избранное

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(char heading) {
        this.heading = heading;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }
}
