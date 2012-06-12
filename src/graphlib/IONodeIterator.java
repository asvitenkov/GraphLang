package graphlib;

public class IONodeIterator extends NodeIterator {

	public IONodeIterator(Node node){
		super(node);
		if(node!=null) super.size = node.IOArcNumber();
	}
	
	public boolean isDone() {
		if(super.curIndex>=super.size){
			return true;
		}
		else return false;
	}

	public OArc currentItem() {
		if(!isDone()){
			return node.getIOArc(super.curIndex);
		}
		else throw new IndexOutOfBoundsException("class IONodeIterator: currentItem() - curIndex out of range");
	}

}
