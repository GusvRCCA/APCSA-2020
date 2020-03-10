package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		String [] allToys = toys.split(" ");
		out.println(Arrays.toString(allToys));
		int count = 0;
		for(int i = 0; i<allToys.length; i++){
			count = 0;
			if(!allToys[i].equals(" ")){
				for(int t = i; t<allToys.length; t++){
					if(allToys[i].equals(allToys[t])){
						allToys[t] = " ";
						count++;
					}
				}
				toyList.add(new Toy(allToys[i]));
				toyList.get(toyList.size()-1).setCount(count);
				out.println(toyList.get(toyList.size()-1).getName());
				out.println(toyList.get(toyList.size()-1).getCount());
			}
		}
		out.println(Arrays.toString(allToys));
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy toy:toyList)
  			if(toy.getName().equals(nm))
  				return toy;
  		return null;
  	}
  
  	public String getMostFreqToy()
  	{
  		Toy max = new Toy(toyList.get(0).getName());
  		max.setCount(toyList.get(0).getCount());
  		for(Toy toy:toyList){
  			if(toy.getCount()>max.getCount()){
  				max.setCount(toy.getCount());
  				max.setName(toy.getName());
  			}
  		}
  		return max.getName() +" "+ max.getCount();
  	}
  	
  	public int getMostFreqToyIndex()
  	{
  		Toy max = new Toy(toyList.get(0).getName());
  		max.setCount(toyList.get(0).getCount());
  		int ind = 0;
  		for(Toy toy:toyList){
  			if(toy.getCount()>max.getCount()){
  				max.setCount(toy.getCount());
  				ind = toyList.indexOf(toy);
  			}
  		}
  		return ind;
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sorted = new ArrayList<Toy>();
  		do{
  			sorted.add(toyList.get(getMostFreqToyIndex()));
  			toyList.remove(getMostFreqToyIndex());
  		}while(toyList.size()>0);
  		toyList = sorted;
  	}
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}