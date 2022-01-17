package oopex.day0107;

public class CardTest {
	public static void main(String[] args) {
		Card.width = 50;
		Card.height = 100;
		
		Card c1 = new Card();
		c1.kind="heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println(c1.width+" "+ c1.kind);
		System.out.println(c2.width+" "+ c2.kind);
		
		c1.width = 80;
		c1.height = 130;
		
		System.out.println(c1.width+" "+ c1.kind);
		System.out.println(c2.width+" "+ c2.kind);
		
	
	}
}
