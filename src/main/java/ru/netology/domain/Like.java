package ru.netology.domain;

public class Like {
    private boolean like; // стоит ли лайк от пользователя
    private int likeIndicator; // количество лайков

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public int getLikeIndicator() {
        return likeIndicator;
    }

    public void setLikeIndicator(int likeIndicator) {
        this.likeIndicator = likeIndicator;
    }


}
