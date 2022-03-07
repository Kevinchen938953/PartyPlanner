
import java.util.Scanner;
import java.util.ArrayList;
public class Tester
{

	public static void main(String[] args)
	{
		ArrayList<ArrayList<People>>tables = new ArrayList<ArrayList<People>>();//Create 2d arraylist to represent rows of tables each with 10 people
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
		tables.get(0).add(new People(12, Kevin, 1) );
		tables.get(0).add(p2);
		tables.get(0).add(p3);
		tables.get(0).add(p4);
		tables.get(0).add(p5);
		tables.get(0).add(p6);
		tables.get(0).add(p7);
		tables.get(0).add(p8);
		tables.get(0).add(p9);
	    tables.get(0).add(p10);//Add the manually created People objects to the first table
	    System.out.println(tables);
		
		
			
		
	}
}
