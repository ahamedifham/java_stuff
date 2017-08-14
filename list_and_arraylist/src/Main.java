import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit= false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();  //to clear the input buffer

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\n0 - print choices");
        System.out.println("\n1 - print list of every item");
        System.out.println("\n2 - add item");
        System.out.println("\n3 - modify an item");
        System.out.println("\n4 - remove an item");
        System.out.println("\n5 - search for an item");
        System.out.println("\n6 - quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter Current Item");
        String currentItem = scanner.nextLine();

        System.out.println("Enter the new Item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem,newItem);
    }

    public static void removeItem(){
        System.out.println("Enter Current Item");
        String currentItem = scanner.nextLine();
        groceryList.removeGroceryItem(currentItem);
    }

    public static void searchForItem(){
        System.out.println("Item to search for");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in our grocesry list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
