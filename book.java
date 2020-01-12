package library;

import java.util.Scanner;

public class book {

	
	public String bookName;
	public String authorName;
	public String publishing;
	public int year;
	public int ISBN;

	Scanner input = new Scanner(System.in);

	public book(){
		
		
	    System.out.println("Enter Book Name:");
	    this.bookName = input.nextLine();
	    
	    System.out.println("Enter Author Name:");
	    this.authorName = input.nextLine();
	
	    System.out.println("Enter Publishing:");
	    this.publishing = input.nextLine();
	    
	    System.out.println("Enter year book:");
	    this.year = input.nextInt();
	    
	    System.out.println("Enter ISBN:");
	    this.ISBN = input.nextInt();
	   
	    

	}

}

