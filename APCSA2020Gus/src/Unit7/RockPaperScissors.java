package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	Random rand = new Random();

	public RockPaperScissors()
	{
		int choice = rand.nextInt(3);
		if(choice==0)
			setPlayers("R");
		if(choice==1)
			setPlayers("P");
		if(choice==2)
			setPlayers("S");

	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int choice = rand.nextInt(3);
		if(choice==0)
			compChoice = "R";
		if(choice==1)
			compChoice = "P";
		if(choice==2)
			compChoice = "S";
	}

	public String determineWinner()
	{
		String winner = null;
		if(playChoice.equals(compChoice))
			return "!Draw Game!";

		if(playChoice.equals("R")){
			if(compChoice.equals("P"))
				return "!Computer wins <<Paper Covers Rock>>!";
			if(compChoice.equals("S"))
				return "!Player wins <<Rock Breaks Scissors>>!";
		}
		if(playChoice.equals("P")){
			if(compChoice.equals("S"))
				return "!Computer wins <<Scissors Cut Paper>>!";
			if(compChoice.equals("R"))
				return "!Player wins <<Paper Covers Rock>>!";
		}
		if(playChoice.equals("S")){
			if(compChoice.equals("R"))
				return "!Computer wins <<Rock Breaks Scissors>>!";
			if(compChoice.equals("P"))
				return "!Player wins <<Scissors Cut Paper>>!";
		}
			return "Please enter R, P, or S";
	}

	public String toString()
	{
		return "Player had "+playChoice+"\nComputer had "+compChoice+"\n"+determineWinner();
	}
}