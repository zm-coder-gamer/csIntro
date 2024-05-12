import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinaryToDecimal {
	public static void main(String[] args) throws FileNotFoundException{
		
		DecToBin dectobin = new DecToBin();
		String newbin = dectobin.convert(10);
		System.out.println(newbin);
		int newdec = convertbintodec(newbin);
		System.out.println(newdec);
		String [] binaryNums = new String[100];
		Scanner sc = new Scanner(new File("src/binarydata.txt"));
		int index = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			//System.out.println(line);
			String[] parts = line.split(",");
			for (int i = 0; i < parts.length; i++) {
				String bin = parts[i].trim();
				//System.out.println(parts[i].trim());
				binaryNums[index] = bin;
				index++;
				int num = convertbintodec(bin);
				System.out.print(num + " ");
			}
			System.out.println();
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
		int binlength = bin.length()-1;
		for (int i = binlength; i >= 0; i--) {
			char achar = bin.charAt(i);
			if (achar == '0') {continue;}
			
			Double num = Math.pow(2, binlength-i);
			int converted = num.intValue();
			sum = sum + converted;
		}
		return sum;
	}
}