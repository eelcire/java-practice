package academy.learnprogramming;

import java.util.ArrayList;

public class Phone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public Phone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contacts) {
        if(findContact(contacts.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContacts, Contacts newContacts) {
        int foundPosition = findContact(oldContacts);
        if (foundPosition < 0) {
            System.out.println(oldContacts.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContacts);
        System.out.println(oldContacts.getName() + ", was replaced with " + newContacts.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts) {
        int foundPosition = findContact(contacts);
        if (foundPosition < 0) {
            System.out.println(contacts.getName() + ", was not found.");
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getNumber());
        }
    }
}
