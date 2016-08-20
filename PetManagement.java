import java.util.*;

class Pets
{

	String petName;
	
	Pets(String petName)
	{
		this.petName =  petName;
		
	}
	public String getPetName()
	{
		return petName;
	}
	
}
class PetsHouse
{
	ArrayList<Pets> pets = new ArrayList<Pets>();
	int count = 0;
	public void addPetToHome(Pets obj)
	{
		if(count<=20)
		{
			pets.add(obj);
			count++;
		}
		else if(count>20 || count<0)
		{
			System.out.println("Sorry ,the house is full!!Better luck next time");
		}


	}
	public void adoptPet()
	{
		pets.remove(0);
	}
	public void showListofPets()
	{
		for(Pets obj:pets)
		{
			System.out.println(obj.getPetName());
		}
	}
}

public class PetManagement
{
	public static void main(String[] args) {
		Pets obj = new Pets("Scooby");
		Pets obj2 = new Pets("Pihu");
		PetsHouse house = new PetsHouse();
		house.addPetToHome(obj);
		house.addPetToHome(obj2);
		System.out.println("before adopting");
		house.showListofPets();
		house.adoptPet();
		System.out.println("after adopting");
		house.showListofPets();


		
	}
}