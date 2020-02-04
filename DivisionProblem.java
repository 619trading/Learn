
public class DivisionProblem {
	private int x, y, answer;

	public DivisionProblem() {
		x = Math.round((int) (10 + 40 * Math.random()));
		y = Math.round((int) (30 * Math.random()));

	}

	public String getProblem() {
		return "Solve the following:" + x + " / " + y;
	}

	public double getAnswer() {
		return answer;
	}

}
