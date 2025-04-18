package HM02;

import java.util.ArrayList;

public class Inbox {

    private ArrayList <Mail> inbox = new ArrayList<>();

    public void addMail(Mail mail) {
        inbox.add(mail);
    }

    public void print() {
        for (int i = 0; i < inbox.size(); i++) {
            System.out.println(inbox.get(i).isRead() + " " + inbox.get(i).getSubject() + " " + inbox.get(i).getSenderAddress() + " " + inbox.get(i).getDatetime());
        }
    }

    public void open (int index){
        if (index >= 0 && index < inbox.size()) {
            Mail mail = inbox.get(index);
            mail.print();
        }
        else System.out.println("There is no Email at this index");
    }
    public int countUnread(){
        int count = 0;
        for (int i = 0; i < inbox.size(); i++) {
            Mail mail = inbox.get(i);
            if (mail.isRead()==false) count++;
        }
        return count;
    }



}
