import java.util.ArrayList;
import java.util.List;

public class DecToBin {
	public String convert (int dec) {
		List<Integer> rems = new ArrayList<>();
		int rem = dec % 2;
		
		doIt(rem, dec, rems);
		dec = dec/2;
		rem = dec%2;
		doIt(rem, dec, rems);
		dec = dec/2;
		rem = dec%2;
		doIt(rem, dec, rems);
		dec = dec/2;
		rem = dec%2;
		doIt(rem, dec, rems);
		System.out.println(rems);
		String bin = reverse(rems);
		
		
		return bin;
	}
	private static void doIt(int rem, int dec, List<Integer> rems) {
		if (rem == 1) {
			dec--;
			rems.add(rem);
		}
		else {
			rems.add(0);
		}
	}
	private static String reverse(List<Integer> rems) {
		String returnVal = "";
		for (int i = rems.size()-1 ; i >= 0; i--) {
			returnVal += String.valueOf(rems.get(i));
		}
		
		return returnVal;
	}
}