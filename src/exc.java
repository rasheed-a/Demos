/**
import java.util.Scanner;

public class exc {
	public static void main(String[] args){
		try {
		Scanner scan = new Scanner(new File("poem"));
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
		Scan.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File poem not found.");
		}
	}
}
**/