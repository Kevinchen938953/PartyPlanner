import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;



public class Tester
{
	

	public static void main(String[] args) throws IOException
	{
			int random = (int)(Math.random()*99);
		//String p="";
		String row;
		Integer[][]tables = new Integer[10][10];
		//ArrayList<ArrayList<People>>tables = new ArrayList<ArrayList<People>>();
		ArrayList<People> partylist = new ArrayList<People>();
		ArrayList<Integer>randolist = new ArrayList<Integer>();
		
		
			BufferedReader csvReader = new BufferedReader(new FileReader("names.csv"));
			while ((row = csvReader.readLine()) != null) 
			{
				String[] data = row.split(",");
				System.out.println(data[3]);
				Integer.parseInt(data[3]);
				Integer.parseInt(data[0]);
				People p1 = new People(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[3]));
				partylist.add(p1);
				//System.out.println(p1.toString());
				
				
				
				
			}
			csvReader.close();
		
			    partylist.add(new People(1, "Kevin", 15));
				partylist.add(new People(2, "Phillip", 5));
				partylist.add(new People(3, "Dave", 4));
				partylist.add(new People(4, "Jim", 3));
				partylist.add(new People(5, "David", 2));
				partylist.add(new People(6, "Jaden ", 3));
				partylist.add(new People(7, "Kaden", 5));
				partylist.add(new People(8, "Jerome", 6));//manually add people to partylist
				partylist.add(new People(9, "Jake", 7));
				partylist.add(new People(10, "Arnie", 8));
				System.out.print(partylist.size());
				int count = 0;
				int onecount=0;
				int twocount=0;
				int threecount=0;
				int fourcount=0;
				int fivecount=0;
				int sixcount=0;
				int sevencount=0;
				int eightcount=0;
				int ninecount=0;
				int tencount=0;
				int elevencount=0;
				int twelvecount=0;
				int thirteencount=0;
				int fourteencount=0;
				int fifteencount=0;
			
			
				for(int x=0; x<10; x++)
				{
					for(int y=0; y<10; y++)
					{
						tables[y][x] = partylist.get(count).companyID;
						count++;
						
					}
					
				}
				//after populating for the first time, check every table to see if there are more than 2. For every company person present, there will be a counter that counts the amount
				for(int x=0; x<10; x++)
				{
					for(int y=0; y<10; y++)
					{
						if(tables[x][y]==1)
						{
							onecount++;
						}
						else if(tables[x][y]==2)
						{
							twocount++;
						}
						else if(tables[x][y]==3)
						{
							threecount++;
						}
						else if(tables[x][y]==4)
						{
							fourcount++;
						}
						else if(tables[x][y]==5)
						{
							fivecount++;
						}
						else if(tables[x][y]==6)
						{
							sixcount++;
						}
						else if(tables[x][y]==7)
						{
							sevencount++;
						}
						else if(tables[x][y]==8)
						{
							eightcount++;
						}
						else if(tables[x][y]==9)
						{
							ninecount++;
						}
						else if(tables[x][y]==10)
						{
							tencount++;
						}
						else if(tables[x][y]==11)
						{
							elevencount++;
						}
						else if(tables[x][y]==12)
						{
							twelvecount++;
						}
						else if(tables[x][y]==13)
						{
							thirteencount++;
						}else if(tables[x][y]==14)
						{
							fourteencount++;
						}else if(tables[x][y]==15)
						{
							fifteencount++;
						}
						
					}
					
				}
				randolist.add(random);
				
				for(int i=0; i<99; i++)
				{
					randolist.add(i);
				}
			//random number generates from 0-99
			    
				while(onecount>2 || twocount>2 || threecount>2 || fourcount>2 || fivecount>2 || sixcount>2 || sevencount>2 || eightcount>2 || ninecount>2 || tencount>2 || elevencount>2 || twelvecount>2 || thirteencount>2 ||fourteencount>2 || fifteencount>2)
				{
					for( int b =0; b<randolist.size(); b++)
					{
						if(randolist.get(b)==random)
						{
							random = (int)(Math.random()*99);
						}//Checks for overlap so that no random number is generated again
						else
						{
					
							for(int i=0; i<10; i++)
							  {
								for(int n=0; n<10; n++)
								{
									tables[n][i] = partylist.get(random).companyID;//continuosly randomly populate 2d array with arraylist items as long as number of people in same company exceed 2
								}
							  }
							}
						}
			   }
			   for(int x=0; x<10; x++)
			   {
				   for(int y=0; y<10; y++)
				   {
					   System.out.println(tables[x][y]);//Prints out each table position
				   }
				}
				//System.out.println(samecount);
			
		
		
			
		
		
		//Create 2d arraylist to represent rows of tables each with 10 people
		
		
		// ArrayList <People> party = new ArrayList<People>();
		//Import name.csv file into the code
		//Define each dataset as a people object
		//use for each loop to populate the ArrayLis
		}
	}

