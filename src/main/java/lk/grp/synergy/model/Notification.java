package lk.grp.synergy.model;

import java.time.LocalDateTime;


/**
 * Created by isuru on 1/12/17.
 */
public class Notification {
    private int notificationId;
    private int studentId;
    private String message;
    private int channel;
    private String from;
    private String to;
    private LocalDateTime scheduledTime;
    private LocalDateTime deliveredTime;

    public Notification(int notificationId, int studentId, String message, int channel, String from, String to, LocalDateTime scheduledTime, LocalDateTime deliveredTime) {
        this.notificationId = notificationId;
        this.studentId = studentId;
        this.message = message;
        this.channel = channel;
        this.from = from;
        this.to = to;
        this.scheduledTime = scheduledTime;
        this.deliveredTime = deliveredTime;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public LocalDateTime getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(LocalDateTime deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notification that = (Notification) o;

        return notificationId == that.notificationId;

    }

    @Override
    public int hashCode() {
        return notificationId;
    }
}
