import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("071 766 4232");


    public static void main(String[] args){

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down..");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void startPhone(){
        System.out.println("Starting phone ...");
    }

    private static void printActions(){
        System.out.println("\nAvailable Actions: \npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                            "2 - add contact\n" +
                            "3- update and existing contact\n"+
                            "4- to remove an existing contact\n" +
                            "5- query if an existing contact exists\n"+
                            "6 - to print a list of available actions");
        System.out.println("Choose your action");
    }

    private static void addNewContact(){
        System.out.println("Enter new Contact Name");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact added +" + name);
        }else{
            System.out.println("Cannot add " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.print("Enter new Contact Name");
        String newName = scanner.nextLine();
        System.out.println("Enter New Contact Phone Number");;
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully Updated Record");
        }else{
            System.out.println("Error updated Record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting record");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name : " + existingContactRecord.getName() + " phone number is + " +
                existingContactRecord.getPhoneNumber());
    }


}
