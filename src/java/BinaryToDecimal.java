import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinaryToDecimal {
	public static void main(String[] args) throws FileNotFoundException{
		String [] binaryNums = new String[100];
		Scanner sc = new Scanner(new File("src/binarydata.txt"));
		int index = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			//System.out.println(line);
			String[] parts = line.split(",");
			for (int i = 0; i < parts.length; i++) {
				//System.out.println(parts[i].trim());
				binaryNums[index] = parts[i].trim();
				index++;
			}
		}
		for (int i = 0; i < binaryNums.length; i++) {
			if (binaryNums[i] == null) {
				break;
			}
			System.out.println(binaryNums[i]);
			int dec = convertbintodec(binaryNums[i]);
			System.out.println(dec);
		}
	}
	private static int convertbintodec(String bin) {
		int sum = 0;
		for (int i = bin.length()-1; i >= 0; i--) {
			char achar = bin.charAt(i);
			if (achar == '0') {continue;}
			Double num = Math.pow(2, bin.length()-i);
			int converted = num.intValue();
			sum = sum + converted;
		}
		return sum;
	}
}