package ru.netology.domain;

public class PostVk {

    private int id; // номер поста
    private int data; // дата поста
    private Text text; // текст поста
    private int idAuthor; // автор поста
    private MenuPost menuPost; // меню поста
    private Preview preview; // превью поста
    private Like like; // лайк
    private CommentInfo comment; // комментарий
    private Retweet retweet; // поделиться
    private int browsing; // количество просмотров
}
