package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		System.out.println("Lets play Rock Paper Scissors!\n");
		Scanner keyb = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
		player = keyb.nextLine();
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game);
			String res = "";
			System.out.print("\nPlay again? ");
			res = (keyb.nextLine()).toLowerCase();
			
			while (!res.equals("no")){
				out.print("\ntype in your prompt [R,P,S] :: ");
				player = keyb.nextLine();
				game.setPlayers(player);
				out.println(game);
				System.out.print("\nPlay again? ");
				res = keyb.nextLine().toLowerCase();				
			}
	}
}



