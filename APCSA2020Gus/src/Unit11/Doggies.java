package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		pups[spot] = new Dog(age, name);
		//make sure spot is in bounds
	}

	public String getNameOfOldest()
	{
		Dog old = new Dog(pups[0].getAge(), pups[0].getName());
		for(Dog dog:pups)
			if(dog.getAge()>old.getAge())
				old=dog;
		return old.getName();
	}

	public String getNameOfYoungest()
	{
		Dog young = new Dog(pups[0].getAge(), pups[0].getName());
		for(Dog dog:pups)
			if(dog.getAge()<young.getAge())
				young=dog;
		return young.getName();
	}

	public String toString()
	{
		return Arrays.toString(pups);
	}
}