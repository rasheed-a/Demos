import java.util.HashSet;
import java.util.Random;

/**
 * A unique account number in the pattern xxxx-xxxxxx
 */
public class AccountNumber {

	private static HashSet<String> numbers = new HashSet<String>();  // Set of all used account numbers
	private static Random rand = new Random();  // Random number generator
	
	/**
	 * Returns a new, unique account number in the pattern xxxx-xxxxxx
	 */
	private static String generateNumber() {
		String s = "";
		for(int i=0; i<4; i++) {
			s += rand.nextInt(10);
		}
		s += "-";
		for(int i=0; i<6; i++) {
			s += rand.nextInt(10);
		}
		return s;
	}
	
	private String number;		// account number
	
	/**
	 * Default constructor.
	 */
	public AccountNumber() {
		do {
			number = generateNumber();
		} while (numbers.contains(number));
		numbers.add(number);
	}
	
	// Returns this object formatted as a string (so it can be printed).
	public String toString() {
		return number;
	}
	
	/**
	 * Returns true if this AccountNumber is equal to the given object.
	 * Two AccountNumber objects are equal if they have the same number.
	 * An AccountNumber may also be compared to a String object.
	 */
	public boolean equals(Object o) {
		if (o instanceof AccountNumber) {
			return number.equals(((AccountNumber) o).number);
		} else if (o instanceof String) {
			return number.equals(o);
		} else {
			return false;
		}
	}
	
}