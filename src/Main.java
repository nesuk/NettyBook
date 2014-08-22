
public class Main {

	public static void main(String[] args) {
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.NaN);
		
		byte[] ba = "abc".getBytes();
		byte[] bb = ba.clone();
		System.out.println(ba == bb);
		System.out.println(new String(ba).equals(new String(bb)));
	}
}
