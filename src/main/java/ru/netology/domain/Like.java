package ru.netology.domain;

public class Like {
    private boolean like; // стоит ли лайк от пользователя
    private int likeIndicator; // количество лайков

    private int canLike; // из документации // [0,1]) — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    private int canPublish; // из документации // [0,1]) — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

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
