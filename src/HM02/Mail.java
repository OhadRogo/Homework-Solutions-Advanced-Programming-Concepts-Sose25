package HM02;

import java.time.LocalDateTime;

public class Mail {
    private String senderAddress;
    private String subject;
    private String message;
    private LocalDateTime datetime;
    private boolean isRead = false;

    public Mail(String senderAddress, String subject, String message) {
        this.senderAddress = senderAddress;
        this.subject = subject;
        this.message = message;
        this.datetime = LocalDateTime.now();
    }
    public void markAsRead() {
        this.isRead = true;
    }

    public void print() {
        System.out.println(subject + " from " + senderAddress  + " on " + datetime + ": " + message);
    }

    //Getters & setters
    public String getSenderAddress() {
        return senderAddress;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isRead() {
        return isRead;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }


}
