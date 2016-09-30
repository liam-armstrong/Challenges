import java.util.*;

public class CodeJam_BotDriver_2011 {
	//creates ArrayList to hold bots
	static ArrayList<CodeJam_BotObj_2011> master = new ArrayList<CodeJam_BotObj_2011>();

	public static void main(String[] args) {
		ParseInput();
		System.out.println(master.get(0).getNextCmd());
		System.out.println(master.get(1).getNextCmd());
	}

	public static void ParseInput() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt() * 2;
		for(int i = 0; i < x; i += 2){
			int y = in.nextInt();
			System.out.println("Added 2 Bots");
			master.add(new CodeJam_BotObj_2011());
			master.add(new CodeJam_BotObj_2011());
			for(int j = 0; j < y; j++){
				if(in.next().equalsIgnoreCase("O")){
					master.get(i).addCmd(in.nextInt());
				}
				else {
					master.get(i + 1).addCmd(in.nextInt());
				}
			}
		}
		in.close();
	}
}
