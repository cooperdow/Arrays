import java.util.Scanner;
public class ArrayChallenges {
static String name;
static Scanner userInput=new Scanner (System.in);
public static void main(String[] args) {
	//greetPlayer();
	favoriteColor();
	randomNumber();
	verticalColumn();
	averageNumber();
	}		
		public static void greetPlayer()
			{
			System.out.println("What is your name?");
			name = userInput.nextLine();
			System.out.println("Hello," + name + "! Guess what your favorite color is.");
			}	
		public static void favoriteColor()
			{
			String [] favColor={"red","blue","green", "black", "orange"};
			System.out.println("First Challenge");
			System.out.println("Your favorite color is " + favColor[2]);
			}
		public static void randomNumber()
			{
			double [] randNumber={.1,1.5,2.3,78.4,2123.7123};
			System.out.println("Second Challenge");
			System.out.println("The number is " + randNumber[4]);
			}
		public static void verticalColumn()
			{
			System.out.println("Third Challenge");
			double [] randNumber={.1,1.5,2.3,78.4,2123.7123};
			for(int i = 0; i < randNumber.length; i++)
				{
				System.out.println(randNumber [i]);
				}
			}
		public static void averageNumber()
			{
			double [] randNumber={.1,1.5,2.3,78.4,2123.7123};
			double sum=0;
			for(int i = 0; i < randNumber.length; i++)
				{
				double number=randNumber[i];
				sum=sum + number;								
				}
			System.out.println("Fourth Challenge");
			System.out.println("The average of all the numbers equals " + sum/randNumber.length);		
			}
		}
