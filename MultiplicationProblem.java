
public class MultiplicationProblem {
	private int x, y, answer;

	public MultiplicationProblem() {
		x = Math.round((int) (10 + 40 * Math.random()));
		y = Math.round((int) (30 * Math.random()));
		answer = x * y;
	}

	public String getProblem() {
		return "Solve the following: " + x + " * " + y;
	}

	public int getAnswer() {
		return answer;
	}

}
