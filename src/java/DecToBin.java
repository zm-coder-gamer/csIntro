import java.util.ArrayList;
import java.util.List;

public class DecToBin {
	public String convert (int dec) {
		List<Integer> rems = new ArrayList<>();
		
		
		while (dec>1){
			int rem = dec%2;
			if (rem == 1) {
				dec--;
			}
			dec = dec/2;
			rems.add(rem);
		}
		rems.add(1);
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