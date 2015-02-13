import java.util.Scanner;
public class MoreArrays {
static String name;
static String month;
static Scanner userInput=new Scanner (System.in);
public static void main(String[] args) {
	greetPlayer();
	first(); 
	second();
	third();
	}
		public static void greetPlayer()
			{
			System.out.println("What is your name?");
			name = userInput.nextLine();
			System.out.println("Hello," + name + "! Guess what the square roots are.");
			}	
		public static void first()
		{
		System.out.println("FIRST CHALLENGE");
		int[] nonSquareNumber={2,4,6,8,10,12,14,16,18,20};
		for (int i=0; i<nonSquareNumber.length; i++)			
			{		
			System.out.println("The square of the number " + nonSquareNumber[i] + " equals " + (nonSquareNumber[i]*nonSquareNumber[i]));
			}
		}
		public static void second()
		{
		String[] monthsOfYear={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println("SECOND CHALLENGE");
		System.out.println("What month of the year do you like most, 1-12?");
		int month=userInput.nextInt();
		System.out.println("I also like the month " + monthsOfYear[month-1]);
		}
		public static void third()
		{
		String[] cardSuits={"hearts", "spades", "diamonds", "clubs"};
		String[] cardRanks={"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		int cardSuit=(int)(Math.random()*4);
		int cardRank=(int)(Math.random()*13);
		System.out.println("THIRD CHALLENGE");
		System.out.println("You drew a " + cardRanks[cardRank] + " of " + cardSuits[cardSuit] );
		}
}
