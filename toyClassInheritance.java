
public class toyClassInheritance {

	public static void main(String[] args) {
		

	} 

} //end of main

class Toy{
	
	public String toyName = "";
	public int toyWeight = 0;
	
	//default constructor
	public Toy() 
	{
		toyName = "";
		toyWeight = 0;
	}
	
	//parameterized constructor
	public Toy(String name, int weight) 
	{
		toyName = name;
		toyWeight = weight;
	}
	
	public void printData()
	{
		System.out.println("Name: " + toyName);
		System.out.println("Weight: " + toyWeight);
	}
	
}
	