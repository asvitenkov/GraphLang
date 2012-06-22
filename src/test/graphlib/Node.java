package graphlib;


import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;

import org.w3c.dom.traversal.NodeIterator;

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
		tmp=tmp+nName+" \n\tinput arcs: " + inputArc.toString()+"\n\toutput arcs: "+outputArc.toString();
		return tmp;
	}
	public int IOArcNumber(){
		return inputArc.size()+outputArc.size();
	}
	
	public boolean isMark(){
		return isMark;
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
	
	
	public String name(){
		return nName;
	}
	
	
	public void addInputArc(OArc arc){
		if(!inputArc.contains(arc))
			inputArc.add(arc);
	}
	
	public void addOutputArc(OArc arc){
		if(!outputArc.contains(arc))
			outputArc.add(arc);
	}
	
	
	public void removeInputArc(OArc arc){
		if(inputArc.contains(arc))
			inputArc.remove(arc);
	}
	
	
	public void removeOutputArc(OArc arc){
		if(outputArc.contains(arc))
			outputArc.remove(arc);
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
	
	
	public graphlib.NodeIterator IOIterator(){
		return new IONodeIterator(this);
	}
	
	public graphlib.NodeIterator OIterator(){
		return new OutputNodeIterator(this);
	}
	
	
	public graphlib.NodeIterator IIterator(){
		return new InputNodeIterator(this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		
		for(OArc tmp:inputArc){
			tmp.removeSecondVertex();
		}
		
		for(OArc tmp: outputArc){
			tmp.removeFirstVertex();
		}
		
	}
}
