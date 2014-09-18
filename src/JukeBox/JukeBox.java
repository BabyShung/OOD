package JukeBox;

import java.util.List;

public class JukeBox {

	private CDPlayer cdPlayer;
	private User user;
	private List<CD> cdCollection;
	private SongSelector ss;

	public JukeBox(CDPlayer cdPlayer, User user, List<CD> cdCollection,
			SongSelector ss) {

	}

	public Song getCurrentSong() {
		return ss.getCurrentSong();
	}

	public void setUser(User user) {
		this.user = user;
	}
}
