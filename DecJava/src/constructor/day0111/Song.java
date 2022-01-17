package constructor.day0111;

public class Song {

	String title;
	String artist;
	int year;
	String country;
	
	Song(){}

	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show(){
		System.out.printf("%s, %d년 %s [%s]\n",
				country, year, artist, title);
	}

	public static void main(String[] args) {
		Song song 
		= new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
	}

}
