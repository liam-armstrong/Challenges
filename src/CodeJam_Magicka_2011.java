import java.util.ArrayList;
import java.util.Scanner;

public class CodeJam_Magicka_2011 {
	static ArrayList<ArrayList<Character>> elements = new ArrayList<ArrayList<Character>>();
	static ArrayList<ArrayList<Character>> combination = new ArrayList<ArrayList<Character>>();
	static ArrayList<ArrayList<Character>> oppositions = new ArrayList<ArrayList<Character>>();
	static ArrayList<Character> output = new ArrayList<Character>();
	public static void main(String[] args) {
		ParseInput();
	}

	public static void ParseInput() {
		int x = 0;
		String input = null;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < in.nextInt(); i++) {
			System.out.println(i);
			combination.add(new ArrayList<Character>());
			oppositions.add(new ArrayList<Character>());
			elements.add(new ArrayList<Character>());
			x = in.nextInt();
			System.out.println(x);
			for (int a = 0; a < x; a++) {
				if(a == 0) input = in.next();
				combination.get(i).add(input.charAt(a));
			}
			x = in.nextInt();
			System.out.println(x);
			for (int b = 0; b < x; b++) {
				if(b == 0) input = in.next();
				oppositions.get(i).add(input.charAt(b));
			}
			x = in.nextInt();
			for (int c = 0; c < x; c++) {
				if(c == 0) input = in.next();
				elements.get(i).add(input.charAt(c));
			}
			
			for (int c = 0; c < elements.get(i).size(); c++) {
				System.out.print(elements.get(i).get(c));
			}
			
		}
		in.close();
	}
	
	public static void invoke(){
		for(int i = 0; i < elements.size(); i++){
			for(int j = 0; j < elements.get(i).size(); j++){
				
			}
		}
	}
	
	public static char compare(char orig, char append, ArrayList<Character> list, int grpSize){
		for(int i = grpSize; i < list.size()/grpSize; i++){
			
			if(orig == list.get(i) && append == list.get(i + 1)){
				
			}
			
		}
		return 0;
	}
	
	public static char compareOppose(char orig, char append, ArrayList<Character> list, int grpSize){
		for(int i = grpSize; i < list.size()/grpSize; i++){
			
			if(orig == list.get(i) && append == list.get(i + 1)){
				
			}
			
		}
		return 0;
	}
}
