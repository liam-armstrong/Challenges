import java.util.*;

public class CodeJam_BotDriver_2011 {
	//creates ArrayList to hold bots
	static ArrayList<CodeJam_BotObj_2011> master = new ArrayList<CodeJam_BotObj_2011>();
	static ArrayList<ArrayList<String>> cmdColors = new ArrayList<ArrayList<String>>();
	public static void main(String[] args) {
		ParseInput();
		Run();
	}

	public static void ParseInput() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt() * 2;
		for(int i = 0; i < x; i += 2){
			int y = in.nextInt();
			master.add(new CodeJam_BotObj_2011("c"));
			master.add(new CodeJam_BotObj_2011("b"));
			cmdColors.add(new ArrayList<String>());
			for(int j = 0; j < y; j++){
				if(in.next().equalsIgnoreCase("o")){
					master.get(i).addCmd(in.nextInt());
					cmdColors.get(i / 2).add("o");
				}
				else {
					master.get(i + 1).addCmd(in.nextInt());
					cmdColors.get(i / 2).add("b");
				}
			}
		}
		in.close();
	}
	
	public static void Run(){
		for(int i = 0; i < cmdColors.size() * 2; i+=2){
			int x = 0;
			while(!cmdColors.get(i / 2).isEmpty()){
				if(cmdColors.get(i / 2).get(0).equalsIgnoreCase("o")){
					Decide(i, i/2,  true);
					Decide(i+1, i/2, false);
				}
				else{
					Decide(i+1, i/2, true);
					Decide(i, i/2, false);
				}
				x++;
			}
			int c = i/2 + 1;
			System.out.println("Case #" + c + ": " + x);
		}
	}
	
	public static void Decide(int bot, int caseNum, boolean canPress){
		if(master.get(bot).getNextCmd() == master.get(bot).getPos() && canPress){
			master.get(bot).press(caseNum);
		}
		else if(master.get(bot).getNextCmd() != master.get(bot).getPos()){
			master.get(bot).moveTowards(master.get(bot).getNextCmd());
		}
	}
}
