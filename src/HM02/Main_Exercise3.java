package HM02;

public class Main_Exercise3 {
    public static void main(String[] args) {

        Mail mail1 = new Mail ("ohad772@gmail.com", "Excersie3 solution", " Hey There, Take a lood on my solution" );
        Mail mail2 = new Mail ("ohad.ragolsky@gmail.com", "Lets have a meeting today", " Hey There, Lets have a meeting today at 20h. Where we wanna meet?" );
        Mail mail3 = new Mail ("byragolsky@gmail.com", "Strategischer Austausch zu EA", "Hallo Tim, in diesem Gespräch möchte ich mit dir über die **Entwicklung und den Status quo des Architekturmanagements** bei Commerz Real sprechen" );

        mail2.markAsRead(); //mark a mail as read.
        mail3.markAsRead(); //mark a mail as read.

        mail1.print(); //is read = false
        mail2.print(); //is read = true
        mail3.print(); //is read = true


        System.out.println();

        Inbox inbox = new Inbox();
        inbox.addMail(mail1); //add some e-mails to the inbox
        inbox.addMail(mail2);
        inbox.addMail(mail3);

        inbox.print(); //print e-mails headers from the inbox

        System.out.println();

        inbox.open(1); //print mail2

        System.out.println();

        inbox.open(3); //Fehlermeldung no Email at this index

        System.out.println();
        System.out.println(inbox.countUnread()); //print the number of unread e-mails.


    }
}
