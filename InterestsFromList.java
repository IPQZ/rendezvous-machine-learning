import java.util.*;

public class InterestsFromList {

	static String[] interests;
	static int interestsIndex = 0;

	private static void generateInterestsTable(String line) {
		System.out.println("INSERT INTO interests (name) VALUES (\"" + line.trim() + "\");");
		//interests[interestsIndex] = line;
		//interestsIndex++;
	}

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String line = in.nextLine();
			while(line != null) {
				generateInterestsTable(line);

				line = in.nextLine();
			}
		} catch (Exception e) {}
	}
}