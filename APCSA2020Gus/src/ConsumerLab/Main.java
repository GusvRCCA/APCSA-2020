package ConsumerLab;

import java.io.File;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
	//test reading from files
	//read in the positive adjectives in postiveAdjectives.txt

		
		System.out.println(Review.sentimentVal("good"));
		System.out.println(Review.sentimentVal("goods"));
		System.out.println(Review.sentimentVal("cool"));
		System.out.println(Review.sentimentVal("crazy"));
	try {
	Scanner input = new Scanner(new File("src/ConsumerLab/simpleReview.txt"));
	while(input.hasNextLine()){
	String temp = input.nextLine().trim();
	System.out.println(temp);

	}
	input.close();
	}
	catch(Exception e){
	System.out.println("Error reading or parsing simpleReview.txt\n" + e);
	}
  }
}