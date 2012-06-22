package graphlib;


public class GraphVertexIterator extends GraphIterator {

	
	public GraphVertexIterator(Graph graph) {
		super(graph);
		if(graph!=null) this.mSize = graph.nodeNumber();
	}
	
	public boolean isDone() {
		if(mCurIndex>=mSize) 
			return true;
		return false;
	}

	public Node currentItem() {
		if(!isDone()){
			return mGraph.getNode(mCurIndex);
		}
		else throw new IndexOutOfBoundsException("class GraphVertexIterator: currentItem() - curIndex out of range");
	}

	
	{
		mCurIndex = 0;
		mSize = 0;
	}
	
}
