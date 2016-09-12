/**
 * Nicole Latchman
 * This program handles collisions through the use of a open hash table with a linear probing. 
 * If the spot in the hash table is already taken, then it will go to the next open spot. 
 */

import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		HashTable table = new HashTable(1232); 
		Scanner user_input = new Scanner( System.in );
		String option = "0"; 
		while (option != null){ 
			System.out.println("Select number of choice you would like to do: ");
			System.out.println("1: Add Family"); 
			System.out.println("2: Find Family"); 
			System.out.println("3: Show All Families"); 
			System.out.println("4: Exit");
			option = user_input.next( );
			if (option.equalsIgnoreCase("1")){
				String birthday;
				String familyName; 
				String team; 
				String month = null; 
				String day = null; 
				System.out.print("Enter the month and day of the birthday (ex. 10/16): ");
				birthday = user_input.next( );
				StringTokenizer myTokens = new StringTokenizer(birthday, "/"); //Tokenize the line
				myTokens = new StringTokenizer(birthday,"/");	
				while (myTokens.hasMoreTokens()) {
					month = myTokens.nextToken();
					day = myTokens.nextToken(); 
				}
				int monthAndDay = Integer.parseInt(month+day); 
				System.out.print("Enter your family name: ");
				familyName = user_input.next( );
				System.out.print("What team do you support?: ");
				team = user_input.next( );
				Family household = new Family(familyName, team, monthAndDay); 
				table.addFamily(monthAndDay, household); 
			}
		
			if (option.equalsIgnoreCase("2")){
				String birthday = null; 
				String month = null; 
				String day = null; 
				String familyName; 
				System.out.println("Enter the month and day of the birthday (ex. 10/16): "); 
				birthday = user_input.next( );
				StringTokenizer myTokens = new StringTokenizer(birthday, "/"); 
				myTokens = new StringTokenizer(birthday,"/");	
				while (myTokens.hasMoreTokens()) {
					month = myTokens.nextToken();
					day = myTokens.nextToken(); 
				}
				int monthAndDay = Integer.parseInt(month+day); 
				System.out.print("Enter the family name: ");
				familyName = user_input.next( );
				table.findFamily(monthAndDay, familyName);
			}
		
			//You might need to scroll up to see the families because it gets 
			//hidden by the option list. 
			if (option.equalsIgnoreCase("3")){
				table.printTable();
			}
			
			if (option.equalsIgnoreCase("4")){
				System.out.print("Goodbye");
				option = null; 
			}
		} 
	}
	
}
