import java.util.*;

public class HobbiesFromList {

	static String[] hobbies;
	static int hobbiesIndex = 0;

	private static void generateHobbiesTable(String line) {
		System.out.println("INSERT INTO hobbies (name) VALUES (\"" + line.trim() + "\");");
		//hobbies[hobbiesIndex] = line;
		//hobbiesIndex++;
	}

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String line = in.nextLine();
			while(line != null) {

				generateHobbiesTable(line);

				line = in.nextLine();
			}
		} catch (Exception e) {}
	}
}