import java.util.ArrayList;
import java.util.Scanner;

public class CodeJam_Magicka_2011 {
	static ArrayList<ArrayList<String>> elements = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> combination = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> oppositions = new ArrayList<ArrayList<String>>();
	public static void main(String[] args) {
		ParseInput();
	}
	
	public static void ParseInput() {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < in.nextInt(); i++){
			combination.add(new ArrayList<String>());
			oppositions.add(new ArrayList<String>());
			elements.add(new ArrayList<String>());
			int x = in.nextInt();
			for(int j = 0; j < x; j++){
				combination.get(i).add(in.next());
			}
			System.out.println(combination.get(i).get(i));
		}
		in.close();
	}

}
