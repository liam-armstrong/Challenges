import java.util.ArrayList;

public class CodeJam_BotObj_2011 {
	private String color;
	private int pos = 1;
	private ArrayList<Integer> cmds = new ArrayList<Integer>();
	
	public CodeJam_BotObj_2011(String c){
		this.color = c;
	}
	
	public void setColor(String c){
		color = c;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getPos(){
		return pos;
	}
	
	public void moveTowards(int dest){
		if(dest > pos) pos++;
		if(dest < pos) pos--;
	}
	
	public void press(int cmdNum){
		if(!cmds.isEmpty()){
			System.out.println(color + " pressed the button");
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
		return 0;
	}
}
