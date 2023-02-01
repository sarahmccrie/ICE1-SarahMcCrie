package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Sarah McCrie 991405606 - Jan 26, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(rand.nextInt(12));
            card.setSuit(Card.SUITS[rand.nextInt(3)]);
            hand[i]=card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a card number between 1 and 13");
        int value = scan.nextInt();
        System.out.println("Please enter a number to represent the suit: Enter 1 for Hearts, 2 for Diamonds, 3 for Spades, or 4 for Clubs.");
        int suitAsInt = scan.nextInt();
        scan.close();

        String suit = "";
        switch(suitAsInt){
            case 1:
                suit = hand[0].getSuit();
            case 2: 
                suit = hand[1].getSuit();
                break;
            case 3:
                suit = hand[2].getSuit();
                break;
            case 4:
                suit = hand[3].getSuit();
                break;
            }
      
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
            for(int i = 0; i < hand.length; i++){
                if(suit == hand[i].getSuit() && value == hand[i].getValue()){
                    printInfo();
                    return;
                }
            }
            for(int i = 0; i < hand.length; i++){
                if(suit != hand[i].getSuit() || value != hand[i].getValue()){
                   System.out.println("Sorry, you guessed incorrectly!");
                   return;
                }
            } 
    }
        
        // If the guess is successful, invoke the printInfo() method below.

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Sarah McCrie Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sarah");
        System.out.println();
        
        System.out.println("My ambitions:");
        System.out.println("-- start my career");
        System.out.println("-- get a bunch of dogs");
	    System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- painting");
        System.out.println("-- sculpting");
        System.out.println("-- walking");
        System.out.println("-- renovating");

        System.out.println();
        
    
    }

}
