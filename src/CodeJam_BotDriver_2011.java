import java.util.*;

public class CodeJam_BotDriver_2011 {
	// creates ArrayList to hold bots
	static ArrayList<CodeJam_BotObj_2011> master = new ArrayList<CodeJam_BotObj_2011>();
	static ArrayList<ArrayList<String>> masterOrder = new ArrayList<ArrayList<String>>();

	public static void main(String[] args) {
		ParseInput();
		Run();
	}

	public static void ParseInput() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt() * 2;
		for (int i = 0; i < x; i += 2) {
			int y = in.nextInt();
			master.add(new CodeJam_BotObj_2011("c"));
			master.add(new CodeJam_BotObj_2011("b"));
			masterOrder.add(new ArrayList<String>());
			for (int j = 0; j < y; j++) {
				if (in.next().equalsIgnoreCase("o")) {
					master.get(i).addCmd(in.nextInt());
					masterOrder.get(i / 2).add("o");
				} else {
					master.get(i + 1).addCmd(in.nextInt());
					masterOrder.get(i / 2).add("b");
				}
			}
		}
		in.close();
	}

	public static void Run() {
		for (int i = 1; i <= masterOrder.size(); i++) {
			int x = 0;
			while (!masterOrder.get(i).isEmpty()) {
				if (masterOrder.get(i).get(0).equalsIgnoreCase("o")) {
					Decide(i, true);
					Decide(i + 1, false);
				} else {
					Decide(i + 1, true);
					Decide(i, false);
				}
				x++;
			}
			System.out.println("Case #" + i + ": " + x);
		}
	}

	public static void Decide(int bot, boolean canPress) {
		if (master.get(bot).getNextCmd() == master.get(bot).getPos() && canPress) {
			master.get(bot).press(0);
		} else if (master.get(bot).getNextCmd() != master.get(bot).getPos()) {
			master.get(bot).moveTowards(master.get(bot).getNextCmd());
		}
	}
}
