package ru.netology.domain;

public class Retweet {
    private int retweetIndicator; //количество ретвитов

    private int userReposted; // из документации // [0,1]) — наличие репоста от текущего пользователя (1 — есть, 0 — нет).

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    public int getRetweetIndicator() {
        return retweetIndicator;
    }

    public void setRetweetIndicator(int retweetIndicator) {
        this.retweetIndicator = retweetIndicator;
    }
}
