package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int num;
   
 //add constructors
   
   public Perfect(){
	   setNumber(6);
   }
   
   public Perfect(int n){
	   setNumber(n);
   }

	//add a set method
   public void setNumber(int n){
	   num = n;
   }

	public boolean isPerfect()
	{
		int sum = 1;
		for(int i = 2; i<num; i++){
			if(num%i==0)
				sum+=i;
		}
		if(sum==num)
			return true;
		return false;
	}

	//add a toString	
	public String toString(){
		if(isPerfect())
			return num + " is perfect.\n";
		return num + " is not perfect.\n";
	}
}