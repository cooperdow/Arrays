public class CreativeWriting {
	public static void main(String[] args) {
		String [] Students={"Jake","Jack","Julie", "Jabdul", "Jacy", "Shelly"};
		String [] Protagonists={"Cinnamon", "Sugar", "Shinequia", "Trisha", "Sarah Ortiz", "Collin Brogan"};
		String [] Antagonists={"Danger Dan", "Thomas Schwappach", "Carter Scruggs", "all marsupials", "TSA", "Obama"};
		String [] Settings={"Back seat of a car", "Local middle school", "Burger King", "Scary forest at night", "Upstream", "Homecoming"};
		String [] Genres={"Horror", "Romance", "Comedy", "Drama", "Action", "Boring"};	
		
			for(int i=0;i<Students.length; i++)
				{
				int randomProtagonists=(int)(Math.random()*6);
				int randomAntagonists=(int)(Math.random()*6);
				int randomSettings=(int)(Math.random()*6);
				int randomGenres=(int)(Math.random()*6);
				System.out.println("Student: " + Students[i]);
				System.out.println("Protagonist: " + Protagonists[randomProtagonists]);
				System.out.println("Antagonist: " + Antagonists[randomAntagonists]);
				System.out.println("Settings: " + Settings[randomSettings]);
				System.out.println("Genre: " + Genres[randomGenres]);
				System.out.println(" ");
				
				}
			}
		}