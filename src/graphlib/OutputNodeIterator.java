package graphlib;

public class OutputNodeIterator extends NodeIterator {

	public OutputNodeIterator(Node node){
		super(node);
		super.size = node.OArcNumber();
	}
	
	public boolean isDone() {
		if(super.curIndex>=super.size)
			return true;
		else return false;
	}

	@Override
	public OArc currentItem() {
		if(!isDone()){
			return node.getOArc(super.curIndex);
		}
		else throw new IndexOutOfBoundsException("class OutputNodeIterator: currentItem() - curIndex out of range");
	}

}
