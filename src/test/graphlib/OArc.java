package graphlib;

public class OArc {

	public OArc() {
		// TODO Auto-generated constructor stub
	}
	
	public OArc(Node first, Node second) {
		// TODO Auto-generated constructor stub
		startNode = first;
		endNode = second;
		startNode.addOutputArc(this);
		endNode.addInputArc(this);
	}
	
	public void removeFirstVertex(){
		startNode.removeOutputArc(this);
		startNode = null;
	}
	
	public void removeSecondVertex(){
		endNode.removeInputArc(this);
		endNode = null;
	}
	
	public void setName(String name){
		if(name != null){
			aName = name;
		}
		else throw new NullPointerException("class OArc: setName() - name = null");
	}
	
	
	public String name(){
		return aName;
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
		if(startNode!=null)startNode.removeOutputArc(this);
		startNode = first;
		if(startNode!=null)startNode.addOutputArc(this);
		if(endNode!=null)endNode.removeInputArc(this);
		endNode = second;
		if(endNode!=null)endNode.addInputArc(this);
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
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		startNode.removeOutputArc(this);
		endNode.removeInputArc(this);
	}

}
