package graphlib;

public class OArc {

	public OArc() {
		// TODO Auto-generated constructor stub
	}
	
	public OArc(Node first, Node second) {
		// TODO Auto-generated constructor stub
		startNode = first;
		endNode = second;
	}
	
	public void setName(String name){
		if(name != null){
			aName = name;
		}
		else throw new NullPointerException("class OArc: setName() - name = null");
	}
	
	public String toString(){
		String tmp="OArc ";
		tmp +=aName+": first node ";
		if(startNode!=null) tmp += startNode.getName()+" ";
		else tmp+="null ";
		tmp+="second node ";
		if(endNode!=null) tmp += endNode.getName()+" ";
		else tmp+="null ";
		
		return tmp;
	}
	
	public String getName(){
		return aName;
	}
	
	public Node getFirst(){
		return startNode;
	}
	
	public Node getSecond(){
		return endNode;
	}
	
	
	public void markArc(){
		isMark = true;
	}
	
	public void unmarkArc(){
		isMark = false;
	}
	
	public void setVertex(Node first, Node second){
		startNode = first;
		endNode = second;
	}
	
	private Node startNode;
	private Node endNode;
	private String aName;
	private boolean isMark;
	{
		startNode = null;
		endNode = null;
		aName = "";
		isMark = false;
	}

}
