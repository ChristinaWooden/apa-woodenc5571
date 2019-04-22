public class Score{

	private int leftScore;
	private int rightScore;

	public Score(){
		leftScore = 0;
		rightScore = 0;
	}

	public void leftPoint(){
		leftScore++;
		toString();
	}

	public void rightPoint(){
		rightScore++;
		toString();
	}

	public String toString(){
		return ("left score == " + leftScore +" \n rightScore ==  " + rightScore);
	}

}