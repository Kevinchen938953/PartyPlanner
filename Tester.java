import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tester
{
	

	public static void main(String[] args)
	{
		String p="";
		ArrayList<ArrayList<People>>tables = new ArrayList<ArrayList<People>>();
		ArrayList<String>partylist = new ArrayList<String>();
		try {
		   
           File myObj = new File("names.csv");
           Scanner scan = new Scanner(myObj);
           
           for(int i=0; i<90; i++)
           {
			   p = scan.nextLine();
			   partylist.add(p);//Adds all ninety people to an ArrayList of String from the csv file
			 
			
		   }
		   for(int x=0; x<partylist.size(); x++)
		   {
			   int count=0;
			   for(int n=0; n<partylist.get(x).length(); n++)
			   {
					if(partylist.get(x).substring(n).equals(","))
					{
						System.out.print(n);//Testing to see if the loop is even checking for a comma in each string
					}
					else
					{
						//System.out.print("Hi");
						count++;
						System.out.print(count);
					}
				}
			}
						
		   //System.out.print(partylist.size());
		   //System.out.print(partylist);
		  
		   
           
        }
        catch (FileNotFoundException e)
        {
		System.out.println("error");
		e.printStackTrace();
		}
		
		//Create 2d arraylist to represent rows of tables each with 10 people
		/*
		*/
		// ArrayList <People> party = new ArrayList<People>();
		//Import name.csv file into the code
		//Define each dataset as a people object
		//use for each loop to populate the ArrayList
		
		
		People p1 = new People(12, "Kevin", 1);
		People p2 = new People(2, "Bob", 2);
		People p3 = new People(3, "Bob", 3);
		People p4 = new People(5, "Bob", 4);
		People p5 = new People(6, "Bob", 5);
		People p6 = new People(7, "Bob", 6);
		People p7 = new People(8, "Bob", 7);
		People p8 = new People(10, "Bob", 8);
		People p9 = new People(11, "Bob", 9);
		People p10 = new People(13, "Bob", 10);
		//Manually create 10 people objects
								
		
		for(int i=0; i<10; i++)
		{
			tables.add(new ArrayList<People>());//Create ten tables
		}
		tables.get(0).add(p1);
		tables.get(0).add(p2);
		tables.get(0).add(p3);
		tables.get(0).add(p4);
		tables.get(0).add(p5);
		tables.get(0).add(p6);
		tables.get(0).add(p7);
		tables.get(0).add(p8);
		tables.get(0).add(p9);
	    tables.get(0).add(p10);//Add the manually created People objects to the first table
	    //System.out.println(tables);
		
		
			
		
	}
}
