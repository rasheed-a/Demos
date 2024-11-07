import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		//Create a HashMap to store Employee's names and salaries
		HashMap<String, Double> payroll = new HashMap<String, Double>();
		payroll.put("Frodo", 215697.63);
		payroll.put("Sam", 36921.16);
		payroll.put("Pippin", 1567913.12);
		payroll.put("Merry", 752119.10);
		payroll.put("Bilbo", 5876345617.99);
		System.out.println("Pippin's salary: $"+payroll.get("Pippin"));
		System.out.println("Hobbits:");
		payroll.put("Sam",100000.0); //Wont work (needs to have a unique key (does change the value to new input)
		for(String s : payroll.keySet()) {
			System.out.println(s);
		}
		// When turned into a Tree Map it becomes printed in alphabetical order
		
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		String s = "I enjoy pizza with cheese and onions with root beer.";
		for(char c : s.toLowerCase().toCharArray()) { // for each char c in string s
			if(charCount.containsKey(c))
				charCount.put(c,  charCount.get(c)+1);
			else
				charCount.put(c, 1);
		}
		System.out.println(s);
		for(char c  : charCount.keySet()) {
			System.out.println(c+": "+charCount.get(c));
		}
	}
}
