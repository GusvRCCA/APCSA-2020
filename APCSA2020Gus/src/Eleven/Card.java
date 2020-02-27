package Eleven;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
	private String suit;
	private String rank;
		//int face
	private int face;
	private int points;

  	//constructors
	public Card() {
	setCard("SPADES", 1);
	}
	
	public Card(String cardSuit, int faceVal) {
		suit = cardSuit;
		face = faceVal;
	}


	// modifiers
		//set methods
public void setCard(String cardSuit, int faceVal) {
	suit = cardSuit;
	face = faceVal;
}


  	//accessors
		//get methods
public String getSuit() {
	return suit;
}

public String getRank() {
	return rank;
}

public int getFaceVal() {
	return face;
}

public int getPointVal() {
	return points;
}

public void setSuit(String cardSuit) {
	this.suit=cardSuit;
}

public void setRank(String cardRank) {
	this.rank=cardRank;
}

public void setFaceVal(int faceVal) {
	this.face=faceVal;
}

public void setPointVal(int pointVal) {
	this.points=pointVal;
}

  	//toString
public String toString() {
	return FACES[face]+" of "+suit;
	
}


 }