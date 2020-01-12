package library;

import java.util.Scanner;

public class library {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the Library!");
    
    books ob = new books();
    
    int choice;
   
    do{

        ob.dispMenu();
        choice = input.nextInt();

        switch(choice){

            case 1:
                book b = new book();
                ob.addBook(b);
                break;

            case 2:        
                System.out.println("Enter 2 to Search with Author Name(Full Name).");
                  ob.searchByauthorName();
                  break;

            case 3:
                ob.showAllBooks();
                break;
                
            case 4:
            	ob.checkOutBook();
            	break; 
                
            default:
                System.out.println("CHOICE SHOULD BE BETWEEN 0 TO 4.");

        }

    }
    while (choice!=0);
}
}







