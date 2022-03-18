import java.util.Scanner;
//sort into ten groups where no more than two people from same company sit together
//create table class
//create table class
//create collection of table objects that contain people objects
public class People
{
	 int pID;
	 int tableID;
	 int companyID;
	 String name;
	 String company;
	public People(int pID, String name, int companyID)//Constructer to create Person objects with these attributes
	{
		this.name = name;
		this.pID = pID;
		this.companyID = companyID;
		//constructer to create People objects
	}
	
	
	public String toString() {
		
		return("The Person ID is " + " " + pID + "The name is " + " " + name + "The Company ID is " + " " + companyID);
		//converts the people objects to string
	}
	public void scan()//scan method for the constructer
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the person name?");
		name = scan.nextLine();
		System.out.println("What is the person ID?");
		pID = scan.nextInt();
		System.out.println("What is COmpany Id?");
		companyID = scan.nextInt();
	}
		
	
}

/*public class Table
{
	int tableID;
	Person[10] = new Person[10];
	public Table(int tableID)
	{
	
	}
}
//suppose
public class Banquet
{
	int numPPL;
	int[][] pplFrCo= int[16][20];//companyID, num from company there are sixteen companies with 20 people at each company
	Person[][] bt = new Person[10][10];
*/
