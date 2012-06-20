package graphlib;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	
	public void setName(String name){
		mName = name;
	}
	
	public String name(){
		return mName;
	}
	
	
	public void addNode(Node node){
		if(!this.searchNode(node))
			lNode.add(node);
	}
	
	public void removeNode(Node node){
		if(this.searchNode(node))
			lNode.remove(node);
	}
	
	
	public void removeArc(OArc arc){
		if(this.searchArc(arc))
			lArc.remove(arc);
	}
	
	
	public void removeGraph(Graph graph){
		if(this == graph) return;
		ArrayList<Node> nodes = graph.getAllNode();
		ArrayList<OArc> arcs = graph.getAllArc();
		for(Node tmp: nodes){
			this.removeNode(tmp);
		}
		
		for(OArc tmp: arcs){
			this.removeArc(tmp);
		}
	}
	
	public boolean containNode(Node node){
		return this.searchNode(node);
	}
	
	public boolean containArc(OArc arc){
		return this.searchArc(arc);
	}
	
	
	public void setGraph(ArrayList<String> vars, ArrayList<String> firstN, ArrayList<String> secondN){
		lNode.clear();
		lArc.clear();
		ArrayList<String> varList = new ArrayList<String>();
		for(String tmp: vars){
			if(!varList.contains(tmp))
				varList.add(tmp);
		}
		HashMap<String,Node> nodeMap = new HashMap<String,Node>();
		for(String tmp: varList){
			Node tNode = new Node(tmp);
			nodeMap.put(tmp, tNode);
			this.addNode(tNode);
		}
		
		if(firstN.size()!=secondN.size())
			return;
		for(int i=0; i<firstN.size();i++){
			OArc tArc = new OArc(nodeMap.get(firstN.get(i)), nodeMap.get(secondN.get(i)));
			this.addArc(tArc);
		}
	}
	
	public void addGraph(Graph graph){
		ArrayList<Node> nodes = graph.getAllNode();
		ArrayList<OArc> arcs = graph.getAllArc();
		for(Node tmp: nodes){
			this.addNode(tmp);
		}
		
		for(OArc arc: arcs){
			this.addArc(arc);
		}
	}
	
	public int nodeNumber(){
		return lNode.size();
	}
	
	
	public int arcNumber(){
		return lArc.size();	
	}
	
	
	public void addArc(OArc arc){
		if(!this.searchArc(arc))
			lArc.add(arc);
	}
	
	
	public Node getNode(int index){
		if(index<lNode.size())
			return lNode.get(index);
		return null;
	}
	
	
	public String toString(){
		return "graph: name "+mName+"\n\t"+lNode.toString() +"\n\t"+ lArc.toString();
	}
	
	
	
	public GraphIterator vertexIterator(){
		return new GraphVertexIterator(this);
	}
	
	
	public void markNode(Node node){
		if(searchNode(node))
			lNode.get(lNode.indexOf(node)).markNode();
	}
	
	public void unmarkNode(Node node){
		if(searchNode(node))
			lNode.get(lNode.indexOf(node)).unmarkNode();
	}
	
	
	private boolean searchNode(Node node){
		if(lNode.contains(node))
			return true;
		else return false;
	}
	
	
	private boolean searchArc(OArc arc){
		if(lArc.contains(arc))
			return true;
		else return false;
	}
	
	public void clearMarks(){
		for(Node tmp: lNode){
			tmp.unmarkNode();
		}
		for(OArc tmp: lArc){
			tmp.unmarkArc();
		}
	}
	
	private ArrayList<Node> getAllNode(){
		return lNode;
	}
	
	private ArrayList<OArc> getAllArc(){
		return lArc;
	}
	
	
	private String mName;
	
	
	
	private ArrayList<Node> lNode; 
	private ArrayList<OArc> lArc;
	{
		lNode = new ArrayList<Node>();
		lArc = new ArrayList<OArc>();
	}
	
	
}
