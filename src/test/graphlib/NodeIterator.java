package graphlib;

public  abstract class NodeIterator {
	
	public NodeIterator(Node node){
		if(node == null) throw new NullPointerException("class NodeIterator: constuctor  NodeIterator - node==null");
		else{ 
			this.node = node;
		}
	}
	
	public void first(){
		curIndex = 0;
	}
	public void next(){
		curIndex++;
	}
	
	public abstract boolean isDone();
	public abstract OArc currentItem();
	
	
	
	protected Node node;
	protected int curIndex;
	protected int size;
	{
		node  = null;
		curIndex = 0;
		size = -1;
	}
}
