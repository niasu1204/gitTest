package breakex.day0106;

public class BreakEx1 {
	public static void main(String[] args) {
		A:
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j< 3; j++) {
				if(j == 1) {break A;}
				System.out.println(i + " "+j);
			}//inner
		}//outter   
	
	}//main
}
