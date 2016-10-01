import java.util.ArrayList;

public class CodeJam_BotObj_2011 {
	String color;
	int pos = 1;
	ArrayList<Integer> cmds = new ArrayList<Integer>();
	
	public CodeJam_BotObj_2011(String c){
		this.color = c;
	}
	
	public void setColor(String c){
		color = c;
	}
	
	public String getColor(){
		return color;
	}
	
	
	public void moveTo(int dest){
		if(dest > pos) pos++;
		if(dest < pos) pos--;
	}
	
	public void press(int cmdNum){
		if(!cmds.isEmpty()){
			cmds.remove(0);
			CodeJam_BotDriver_2011.masterOrder.get(cmdNum).remove(0);
		}
	}
	
	public void addCmd(int pos){
		cmds.add(pos);
	}
	
	public int getNextCmd(){
		if(!cmds.isEmpty()){
			return cmds.get(0);
		}
		System.out.println("No Commands Left"););
		return 0;
	}
}
