import java.io.*;
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static String getName(int Line, String file) {
		Scanner s = null;
		try {
			s = new Scanner(new File(file));
			int count = 1;
			while (s.hasNextLine()) {
				String currentLine = s.nextLine();
				if (count == Line) {
					String[] parts = currentLine.split(" ");
					if (parts.length >= 3) {
						return parts[0] + " " + parts[1];
					}
				}
				count++;
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (s != null) {
				s.close();
			}
		}
		return "";
	}
	public static int getAge(int Line, String file) {
		Scanner s = null;
		try {
			s = new Scanner(new File(file));
			int count = 1;
			while (s.hasNextLine()) {
				String currentLine = s.nextLine();
				if (count == Line) {
					String[] parts = currentLine.split(" ");
					if (parts.length >= 3) {
						return Integer.parseInt(parts[2]);
					}
				}
				count++;
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (s != null) {
				s.close();
			}
		}
		return -1;
	}
	public static int getNumber(int Line, String file) {
		Scanner s = null;
		try {
			s = new Scanner(new File(file));
			int count = 1;
			while (s.hasNextLine()) {
				String currentLine = s.nextLine();
				if (count == Line) {
					String[] parts = currentLine.split(" ");
					if (parts.length >= 4) {
						return Integer.parseInt(parts[3]);
					}
				}
				count++;
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (s != null) {
				s.close();
		}
	}	
		return -1;
	}
	public static void fileAppend(String output, String filename) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(filename, true));
			pw.print(output);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
