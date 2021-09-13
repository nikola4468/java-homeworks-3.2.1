package ru.netology.domain;

public class CommentInfo {
    private boolean comment; // можно ли оставлять комментарии
    private int commentIndicator; // количество комментариев

    public boolean isComment() {
        return comment;
    }

    public void setComment(boolean comment) {
        this.comment = comment;
    }

    public int getCommentIndicator() {
        return commentIndicator;
    }

    public void setCommentIndicator(int commentIndicator) {
        this.commentIndicator = commentIndicator;
    }
}
