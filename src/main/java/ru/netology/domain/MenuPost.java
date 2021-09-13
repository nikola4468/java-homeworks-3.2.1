package ru.netology.domain;

public class MenuPost {
    private int favorites; // добавить статью в избранное
    private int complain; // пожаловаться на пост

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }

    public int getComplain() {
        return complain;
    }

    public void setComplain(int complain) {
        this.complain = complain;
    }
}
