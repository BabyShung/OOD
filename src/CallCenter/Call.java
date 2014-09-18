package CallCenter;

public class Call {
	private Rank rank;

	private Caller caller;

	private Employee handler;

	public Call(Caller c) {
		rank = Rank.respondent;
		caller = c;
	}

	public void setHandler(Employee e) {
		handler = e;
	}

	public void reply(String msg) {

	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank r) {
		rank = r;
	}

	public Rank incrementRank() {
		return null;
	}

	public void disconnect() {

	}

}
