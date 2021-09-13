package ru.netology.domain;

public class CommentInfo {
    private boolean comment; // можно ли оставлять комментарии
    private int commentIndicator; // количество комментариев

    private int groupsCanPost; // из документации // [0,1] — информация о том, могут ли сообщества комментировать запись;
    private boolean canClose; // из документации // может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; // из документации // может ли текущий пользователь открыть комментарии к записи.

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

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
