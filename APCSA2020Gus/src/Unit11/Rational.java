package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;

	//write two constructors
public Rational(int number, int denominator){
	setRational(number, denominator);
}
public Rational(){
	setRational(1,1);
}

	//write a setRational method
	public void setRational(int number, int denominator){
		setNum(number);
		setDen(denominator);
	}

	//write  a set method for numerator and denominator
public void setNum(int number){
	num = number;
}

public void setDen(int denominator){
	den = denominator;
}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2
		//new numerator = (num1 * den2 + num2 * den1)
		setNum(num*other.getDen() + other.getNum()*den);
		//new denominator = (den1 * den2)
		setDen(den*other.getDen());
		
		


		reduce();
	}

	private void reduce()
	{
		int temp = num;
setNum(num/gcd(num, den));
setDen(den/gcd(temp, den));

	}

	private int gcd(int numOne, int numTwo)
	{
int min = Math.min(numOne, numTwo);
for(int x = min; x>1; x--)
	if(numOne%x==0&&numTwo%x==0)
		return x;

		return 1;
	}

	public Object clone ()
	{
		Rational Object = new Rational(num, den);
		return Object;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum(){
		return num;
	}
	public int getDen(){
		return den;
	}
	
	
	public boolean equals(Rational obj)
	{
		obj.reduce();
		reduce();
		if((num*obj.getDen()==obj.getNum()*den))
			return true;

		return false;
	}

	public int compareTo(Rational other)
	{
if (equals(other))
	return 0;
if((num*other.getDen()>other.getNum()*den))
	return 1;
return -1;
	}



	
	//write  toString() method
	public String toString(){
		return num+" "+den;
	}
	
	
}