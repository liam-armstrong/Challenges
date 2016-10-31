import java.util.*;

public class CodeJam_BotDriver_2011 {
	//creates ArrayList to hold bots
	static ArrayList<CodeJam_BotObj_2011> master = new ArrayList<CodeJam_BotObj_2011>();
	//creates an ArrayList to organize masterlists, each case is one String ArrayList
	static ArrayList<ArrayList<String>> cmdColors = new ArrayList<ArrayList<String>>();
	public static void main(String[] args) {
		ParseInput();
		Run();
	}

	public static void ParseInput() {
		Scanner in = new Scanner(System.in);
		//creates variable for total cases surveyed
		int x = in.nextInt() * 2;
		//reads in each case, iterates by 2 to make indexing/storing  in correct spot easier
		for(int i = 0; i < x; i += 2){
			int y = in.nextInt();
			//creates one bot obj for each color "c" or "b"
			master.add(new CodeJam_BotObj_2011("c"));
			master.add(new CodeJam_BotObj_2011("b"));
			//adds new String ArrayLists in master for counting commands
			cmdColors.add(new ArrayList<String>());
			for(int j = 0; j < y; j++){
				//sorts commands by color into bot and add to command array regardless of color
				if(in.next().equalsIgnoreCase("o")){
					//if command is orange, add the next commands to bot obj internal ArrayList
					master.get(i).addCmd(in.nextInt());
					cmdColors.get(i / 2).add("o");
				}
				else {
					//if command is blue, add the next commands to bot obj internal ArrayList
					master.get(i + 1).addCmd(in.nextInt());
					cmdColors.get(i / 2).add("b");
				}
			}
		}
		in.close();
	}
	
	public static void Run(){
		//for loops iterates by 2 to make accessing bots easier
		for(int i = 0; i < cmdColors.size() * 2; i+=2){
			int x = 0; //counts amount of turns required to complete command (for output)
			while(!cmdColors.get(i / 2).isEmpty()){ //runs while there is stil cmds to execute
				if(cmdColors.get(i / 2).get(0).equalsIgnoreCase("o")){
					//runs Decide method which tests bot input and makes bot act
					//since only one bot can press once, the input requires boolean canPress
					//Since orange bots were placed in the odd indexs, i refers to orange bot and i + 1 is always blue
					Decide(i, i/2,  true);
					Decide(i+1, i/2, false);
				}
				else{
					//if next command in masterlist is not orange, blue bot is the only one that can press
					Decide(i+1, i/2, true);
					Decide(i, i/2, false);
					//read as Decide(orange, command(i), cannot press);
				}
				x++; //adds one turn to required amount (for output)
			}
			int c = i/2 + 1;
			//outputs case number and required turns to solve
			System.out.println("Case #" + c + ": " + x);
		}
	}
	
	public static void Decide(int bot, int caseNum, boolean canPress){
		if(master.get(bot).getNextCmd() == master.get(bot).getPos() && canPress){
			//if bot can press, and is at required position, presses button by invoking press method
			master.get(bot).press(caseNum);
		}
		else if(master.get(bot).getNextCmd() != master.get(bot).getPos()){
			//if bot is not at desired positon or cannot press, moves towards next location or waits if already there
			master.get(bot).moveTowards(master.get(bot).getNextCmd());
		}
	}
}
