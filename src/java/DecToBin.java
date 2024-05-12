import java.util.ArrayList;
import java.util.List;

public class DecToBin {
	public String convert (int dec) {
		List<Integer> rems = new ArrayList<>();
		int rem = dec % 2;
		
		while (dec>1){
			dec = doIt(rem, dec, rems);
			dec = dec/2;
			rem = dec%2;
			dec = doIt(rem, dec, rems);
			dec = dec/2;
			rem = dec%2;
			dec = doIt(rem, dec, rems);
			dec = dec/2;
			rem = dec%2;
			dec = doIt(rem, dec, rems);
		}
		System.out.println(rems);
		String bin = reverse(rems);
		
		
		return bin;
	}
	private static int doIt(int rem, int dec, List<Integer> rems) {
		if (rem == 1) {
			dec--;
			rems.add(rem);
		}
		else {
			rems.add(0);
		}
		return dec;
	}
	private static String reverse(List<Integer> rems) {
		String returnVal = "";
		for (int i = rems.size()-1 ; i >= 0; i--) {
			returnVal += String.valueOf(rems.get(i));
		}
		
		return returnVal;
	}
}