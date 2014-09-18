package JukeBox;

public class CDPlayer {
	private PlayList pl;
	private CD cd;

	public CDPlayer(CD cd, PlayList pl) {
		this.cd = cd;
		this.pl = pl;
	}

	public void playSong(Song s) {

	}

	public PlayList getPlayList() {
		return pl;
	}

	public void setPlayList(PlayList pl) {
		this.pl = pl;
	}

	public CD getCD() {
		return cd;
	}

	public void setCD(CD cd) {
		this.cd = cd;
	}
}
