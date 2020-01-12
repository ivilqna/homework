package library;

import java.util.Scanner;

public class books {

book theBooks[] = new book[50];     // Array that stores 'book' Objects.
public static int count;   

Scanner input = new Scanner(System.in);


public int compareBookObjects(book b1, book b2){

    if (b1.bookName.equalsIgnoreCase(b2.bookName)){

        System.out.println("Book of this Name Already Exists.");
       

    }
	return 0;
    
 
}

public void addBook(book b){

    for (int i=0; i<count; i++){

        if (this.compareBookObjects(b, this.theBooks[i]) == 50)
            return;

    }

    if (count<50){

        theBooks[count] = b;
        count++;

    }
    else{

        System.out.println("No Space to Add More Books.");

    }


}

public void searchByauthorName(){

    System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
    
    System.out.println("Enter author Name:");
    String authorName = input.nextLine();
    int flag = 0;
    System.out.println("tName\t\tauthor\t\tpublishing\t\tyear\t\tISBN");
    for (int i=0; i<count; i++){

        if (authorName.equalsIgnoreCase(theBooks[i].authorName)){

        	System.out.println(theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + 
                    theBooks[i].publishing + "\t\t" + theBooks[i].year + "\t\t" + theBooks[i].ISBN);
            flag++;
        }

    }
    if (flag == 0)
        System.out.println("No Books of " + authorName + " Found.");

}


public void showAllBooks(){

    System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
    System.out.println("bookName\t\tAuthor\t\tpublishing\t\tyear\t\tISBN");
    for (int i=0; i<count; i++){

        System.out.println(theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + 
                theBooks[i].publishing + "\t\t" + theBooks[i].year + "\t\t" + theBooks[i].ISBN);


    }

}



public void dispMenu(){

    System.out.println("----------------------------------------------------------------------------------------------------------");
    System.out.println("Enter 0 to Exit Application.");
    System.out.println("Enter 1 to Add new Book.");
    System.out.println("Enter 2 to Search a Book.");
    System.out.println("Enter 3 to Show All Books.");
    System.out.println("Enter 4 to Check Out Book. ");
    System.out.println(" ---------------------------------------------");

}


}
