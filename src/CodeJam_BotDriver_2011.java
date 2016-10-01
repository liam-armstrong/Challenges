import java.util.*;

public class CodeJam_BotDriver_2011 {
	//creates ArrayList to hold bots
	static ArrayList<CodeJam_BotObj_2011> master = new ArrayList<CodeJam_BotObj_2011>();
	static ArrayList<ArrayList<String>> masterOrder = new ArrayList<ArrayList<String>>();
	static int s;
	public static void main(String[] args) {
		ParseInput();
		for(int i = 0; i < masterOrder.get(0).size(); i++){
			System.out.println(masterOrder.get(0).get(i));
		}
//		Run();
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
					masterOrder.get(i / 2).add("o");
				}
				else {
					master.get(i + 1).addCmd(in.nextInt());
					masterOrder.get(i / 2).add("b");
				}
			}
		}
		in.close();
	}
	
	public static void Run(){
		for(int i = 0; i < masterOrder.size(); i++){
			int x = 0;
			while(!masterOrder.get(i).isEmpty()){
				if(masterOrder.get(i).get(x).equalsIgnoreCase("o")){
					
				}
			}
		}
	}
}
