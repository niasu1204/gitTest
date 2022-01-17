package arrayex.day0107;

import java.util.Arrays;

public class ArrayCopyEx2 {

	public static void main(String[] args) {
		int[] orig = {1,2,3,4,5};
		//전체 복사(0~4)
		int[] copy = Arrays.copyOf(orig, orig.length);
		for(int i : copy) {
			System.out.print(i);}
		System.out.println();
		//0~2인덱스까지 복사
		int[] copy2 = Arrays.copyOf(orig, 3);
		for(int i : copy2) {
			System.out.print(i);}
		System.out.println();
		//2~ 3인덱스까지 복사 
		int[] copy3 = Arrays.copyOfRange(orig,2,4);
		for(int i : copy3) {
			System.out.print(i);}
		System.out.println();
	}

}
