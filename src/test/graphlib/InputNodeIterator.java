package graphlib;

public class InputNodeIterator extends NodeIterator {

	public InputNodeIterator(Node node){
		super(node);
		super.size = node.IArcNumber();
	}
	
	public boolean isDone() {
		if(super.curIndex>=super.size){
			return true;
		}
		else return false;
	}

	public OArc currentItem() {
		if(!isDone()){
			return node.getIArc(super.curIndex);
		}
		else throw new IndexOutOfBoundsException("class InputNodeIterator: currentItem() - curIndex out of range");
	}

}
