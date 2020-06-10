package ewDefense;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class highscore {

	private int hs;
	File file = new File("src/ewDefense/HighScore.txt");
	
	public highscore(){
		set(0);
	}
	
	public highscore(int hs){
		set(hs);
	}
	
	public void set(int hScore){
		hs = hScore;
	}
	
	public int get(){
		return hs;
	}
	public void obtain()throws IOException{
		int temp = 0;	
		Scanner scan = new Scanner(file);
		while(scan.hasNextInt()){
			temp = scan.nextInt();
		}
		set(temp);
		scan.close();
	}
	
	public void input(int score) throws IOException{
		PrintWriter clear = new PrintWriter(file);
		clear.print("");
		clear.close();
		FileWriter writer = new FileWriter(file, false);
		writer.write(String.valueOf(score));
		writer.close();
	}
}
