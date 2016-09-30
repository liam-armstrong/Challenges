import java.util.ArrayList;

public class CodeJam_BotObj_2011 {
	int pos = 1;
	ArrayList<Integer> cmds = new ArrayList<Integer>();
	
	public CodeJam_BotObj_2011(){
	}
	
	public void reset(){
		pos = 1;
		cmds.clear();
	}
	
	public int getPos(){
		return pos;
	}
	
	public void move(int dist){
		pos += dist;
	}
	
	public void press(){
		cmds.remove(0);
	}
	
	public void addCmd(int pos){
		cmds.add(pos);
	}
	
	public int getNextCmd(){
		return cmds.get(0);
	}
}
