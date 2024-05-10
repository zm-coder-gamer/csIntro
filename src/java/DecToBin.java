import java.util.ArrayList;
import java.util.List;

public class DecToBin {
	public String convert (int dec) {
		List<Integer> rems = new ArrayList<>();
		int rem = dec % 2;
		if (rem == 1) {
			dec--;
			rems.add(rem);
		}
		else {
			rems.add(0);
		}
		rem = dec%2;
		if (rem == 1) {
			dec--;
			rems.add(rem);
		}
		else {
			rems.add(0);
		}
		rem = dec%2;
		if (rem == 1) {
			dec--;
			rems.add(rem);
		}
		else {
			rems.add(0);
		}
		System.out.println(rems);
		return "WIP";
	}
}