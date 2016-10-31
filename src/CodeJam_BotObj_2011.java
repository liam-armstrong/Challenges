import java.util.ArrayList;

public class CodeJam_BotObj_2011 {
	private String color;
	private int pos = 1; //starting position always one
	private ArrayList<Integer> cmds = new ArrayList<Integer>();
	
	public CodeJam_BotObj_2011(String c){
		//bot objects are initated with a color
		this.color = c;
	}
	
	public void setColor(String c){
		color = c;
	}
	
	public String getColor(){
		return color;
	}
	
	//used for comparing in Decide() method
	public int getPos(){
		return pos;
	}
	
	//moves towards destination using basic logic. Will wait if dest == pos
	public void moveTowards(int dest){
		if(dest > pos) pos++;
		if(dest < pos) pos--;
	}
	
	//presses button and removes command from both bot arraylist and master arraylist
	public void press(int cmdNum){
		if(!cmds.isEmpty()){
			cmds.remove(0);
			CodeJam_BotDriver_2011.cmdColors.get(cmdNum).remove(0);
		}
	}
	
	public void addCmd(int pos){
		cmds.add(pos);
	}
	
	//gets next command in local command arraylist
	public int getNextCmd(){
		if(!cmds.isEmpty()){
			return cmds.get(0);
		}
		return 0;
	}
}
