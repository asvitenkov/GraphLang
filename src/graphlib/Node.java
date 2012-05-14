package graphlib;


import java.util.ArrayList;

public class Node {
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(String name){
		nName = name;
	}
	
	public void setName(String name){
		if(name==null) throw new NullPointerException("class Node: setName - name = null");
		nName = name;
	}
	public String toString(){
		String tmp = "Node ";
		tmp=tmp+nName+"";
		return tmp;
	}
	public int IOArcNumber(){
		return inputArc.size()+outputArc.size();
	}
	
	public int size(){
		return inputArc.size()+outputArc.size();
	}
	
	public int IArcNumber(){
		return inputArc.size();
	}
	
	public int OArcNumber(){
		return outputArc.size();
	}
	
	public String getName(){
		return nName;
	}
	
	public OArc  getIOArc(int index){
		int iSize = inputArc.size();
		int oSize = outputArc.size();
		if(index> iSize+oSize) throw new NullPointerException("class Node: getArc - index out of range");
		
		if(index<iSize){
			return inputArc.get(index);
		}
		else{
			return outputArc.get(index-iSize);
		}
	}
	
	public OArc getOArc(int index){
		if(index>outputArc.size()) throw new NullPointerException("class Node: get OArc - index out of range");
		else return outputArc.get(index);
	}
	
	public OArc getIArc(int index){
		if(index>inputArc.size()) throw new NullPointerException("class Node: get OArc - index out of range");
		else return inputArc.get(index);
	}
	
	public void markNode(){
		isMark = true;
	}
	
	public void unmarkNode(){
		isMark = false;
	}
	
	private String nName;
	private ArrayList<OArc> inputArc;
	private ArrayList<OArc> outputArc;
	private boolean isMark;
	{
		inputArc = new ArrayList<OArc>();
		outputArc = new ArrayList<OArc>();
		nName = "";
		isMark = false;
	}
}
