package CallCenter;

public enum Rank {
	respondent(0), manager(1), director(2);

	private int value;

	private Rank(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
