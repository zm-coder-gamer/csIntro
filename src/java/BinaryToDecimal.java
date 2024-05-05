import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinaryToDecimal {
	public static void main(String[] args) throws FileNotFoundException{
		String [] binaryNums = new String[100];
		Scanner sc = new Scanner(new File("src/binarydata.txt"));
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			//System.out.println(line);
			String[] parts = line.split(",");
			for (int i = 0; i < parts.length; i++) {
				System.out.println(parts[i]);
				binaryNums[i] = parts[i];
			}
		}
		for (int i = 0; i < binaryNums.length; i++) {
			if (binaryNums[i] == null) {
				break;
			}
			System.out.println(binaryNums[i]);
		}
	}
	
}