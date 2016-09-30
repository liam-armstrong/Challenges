import java.util.*;

public class CodeJam_BotDriver_2011 {
	//creates ArrayList to hold bots
	static ArrayList<CodeJam_BotObj_2011> master = new ArrayList<CodeJam_BotObj_2011>();
	static ArrayList<ArrayList> masterOrder = new ArrayList<ArrayList>();
	
	public static void main(String[] args) {
		ParseInput();
		System.out.println(master.get(5).getNextCmd());
		master.get(4).press();
		System.out.println(master.get(5).getNextCmd());
	}

	public static void ParseInput() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt() * 2;
		for(int i = 0; i < x; i += 2){
			int y = in.nextInt();
			master.add(new CodeJam_BotObj_2011("c"));
			master.add(new CodeJam_BotObj_2011("b"));
			masterOrder.add(new ArrayList<String>());
			for(int j = 0; j < y; j++){
				if(in.next().equalsIgnoreCase("o")){
					master.get(i).addCmd(in.nextInt());
					masterOrder.get(i).add("o");
				}
				else {
					master.get(i + 1).addCmd(in.nextInt());
					masterOrder.get(i).add("b");
				}
			}
		}
		in.close();
	}
}
