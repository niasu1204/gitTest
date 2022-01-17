package book;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus", 50000, 5.0);
		Book b2 = new Book("java 2.0", 40000, 3.0);
		Book b3 = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책이름\t\t가격\t할인율\t할인 후 금액");
		System.out.println("----------------------------------------");

		Book[] books = {b1,b2,b3};
		
		for(Book b : books) {
			System.out.println(b);
		}
		
	}

}
