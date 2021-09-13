package ru.netology.domain;

public class PostVk {
    private int id; // номер поста
    private int data; // дата поста
    private int idAuthor; // автор поста
    private Text text; // текст поста
    private MenuPost menuPost; // меню поста
    private Preview preview; // превью поста
    private Like like; // лайк
    private CommentInfo comment; // комментарий
    private Retweet retweet; // поделиться
    private int browsing; // количество просмотров

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public MenuPost getMenuPost() {
        return menuPost;
    }

    public void setMenuPost(MenuPost menuPost) {
        this.menuPost = menuPost;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public CommentInfo getComment() {
        return comment;
    }

    public void setComment(CommentInfo comment) {
        this.comment = comment;
    }

    public Retweet getRetweet() {
        return retweet;
    }

    public void setRetweet(Retweet retweet) {
        this.retweet = retweet;
    }

    public int getBrowsing() {
        return browsing;
    }

    public void setBrowsing(int browsing) {
        this.browsing = browsing;
    }

}
