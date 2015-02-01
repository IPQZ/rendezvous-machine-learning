import java.util.*;

public class GraphFromCSV {

	private static void generateGraphTable(String line) {
		String[] tokens = line.split(",");
		System.out.println("INSERT INTO graph (interest_id, hobby_id, value) VALUES (" + tokens[0].trim() + ", " + tokens[2].trim() + ", " + Double.parseDouble(tokens[4].trim())*0.1 + ");");
	}

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String line = in.nextLine();
			while(line != null) {
				generateGraphTable(line);

				line = in.nextLine();
			}
		} catch (Exception e) {}
	}
}