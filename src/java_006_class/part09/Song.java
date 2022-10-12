package java_006_class.part09;

public class Song {

	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {
		
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.printf("노래제목 : %s\n가수 : %s\n앨범 : %s\n작곡가 : %s, %s\n년도 : %d\n트랙 : %d\n", title, artist, album, composer[0],composer[1], year, track);
		//for(int i = 0; i<composer.length; i++) {
		// char chk = i<composer.length -1 ? ',' : '\n';
		//		System.out.printf(....,composer[i], chk);
		// }
	}
	
	
}
