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
		System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
	try {
	Scanner input = new Scanner(new File("src/ConsumerLab/simpleReview.txt"));
	while(input.hasNextLine()){
	String temp = input.nextLine().trim();

	}
	input.close();
	}
	catch(Exception e){
	System.out.println("Error reading or parsing simpleReview.txt\n" + e);
	}
  }
}