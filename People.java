import java.util.Scanner;
//sort into ten groups where no more than two people from same company sit together
//create table class
//create table class
//create collection of table objects that contain people objects
public class People
{
	private int pID;
	private int tableID;
	private int companyID;
	private String name;
	private String company;
	public People(int pID, String name, int companyID)
	{
		this.name = name;
		this.pID = pID;
		this.companyID = companyID;
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
