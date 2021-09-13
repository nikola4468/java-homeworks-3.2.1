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

    private int ownerId; // из документации //	идентификатор владельца стены, на которой размещена запись.
    private int createdBy;    // из документации //идентификатор администратора, который опубликовал запись.
    private int replyOwnerId; // из документации //	идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId; // из документации //	идентификатор записи, в ответ на которую была оставлена текущая.
    private int friendsOnly; // из документации // [1]	1, если запись была создана с опцией «Только для друзей». // int заменить boolean
    private String postType; // из документации //тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private int signerId; // из документации // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int canPin; // из документации // [0,1]	информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int canDelete; // из документации // [0,1]	информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private int canEdit; // из документации // [0,1]	информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private int isPinned; // из документации // [1]	информация о том, что запись закреплена.
    private int markedAsAds; // из документации // [0,1]	информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite; // из документации // true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId; // из документации // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    private Copyright copyright;  // из документации // источник материала
    private PostSource postSource; // из документации //информация о способе размещения записи
    private Geo geo; // из документации // информация о местоположении
    private Donut donut; // из документации // информация о записи VK Donut

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

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
