
public class toyClassInheritance {

	public static void main(String[] args) {
		
		Toy toy = new Toy("Car", 5);
		toy.printData();
		
		Lightsaber lightsaber = new Lightsaber("Lightsaber", 5);
		lightsaber.printData();
		
	} 

} //end of main

class Toy{
	
	protected String toyName = "";
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
	
} //end of Toy
	
class Lightsaber extends Toy{
	
	public boolean isOn;
	
	//default constructor
	public Lightsaber() 
	{
		toyName = "";
		toyWeight = 0;
	}
	
	//parameterized constructor
	public Lightsaber(String name, int weight) 
	{
		toyName = name;
		toyWeight = weight;
	}
		
	public void turnOn() 
	{
		isOn = true;
	}
	
	@Override
	public void printData()
	{
		turnOn();
		System.out.println("Name: " + toyName);
		System.out.println("Weight: " + toyWeight);
		System.out.println("Is on: " + isOn);
	}
	
} //end of Lightsaber