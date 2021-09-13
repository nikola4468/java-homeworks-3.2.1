package ru.netology.domain;

public class Donut {
    // информация о записи VK Donut
    private boolean isDonut; // запись доступна только платным подписчикам VK Donut;
    private int paidDuration; // время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    private Placeholder placeholder; // Заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
    private boolean canPublishFreeCopy; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    private String editMode; // Информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    // all — всю информацию о VK Donut.
    // duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Placeholder getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Placeholder placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
