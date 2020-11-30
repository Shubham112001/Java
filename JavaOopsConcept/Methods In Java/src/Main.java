
public class Main {

	public static void main(String[] args) {
		int position= CalculateHighScorePosition(1500);
		displayHighestScorePosition("Shubham",position);
		position= CalculateHighScorePosition(900);
		displayHighestScorePosition("Shubha",position);
		position= CalculateHighScorePosition(400);
		displayHighestScorePosition("Shubh",position);
		position= CalculateHighScorePosition(50);
		displayHighestScorePosition("Shub",position);
			
		}
	public static void displayHighestScorePosition(String name, int position) {
		System.out.println(name+" manage to get the position "+position);
		}
	public static int CalculateHighScorePosition(int score) {
		if(score>=1000) {
			return 1;
		}
		else if(score>=500 && score<1000) {
			return 2;
		}
		else if(score>=100 && score<500) {
			return 3;
		}
		else
			return 4;
		
	}

}
