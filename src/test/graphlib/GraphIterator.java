package graphlib;

public abstract class GraphIterator {
	public GraphIterator(Graph graph){
		if(graph == null) throw new NullPointerException("class GraphIterator: constuctor  GraphIterator - graph==null");
		else{
			this.mGraph = graph;
		}
	}
	
	
	public void first()
	{
		mCurIndex = 0;
	}
	
	public void next(){
		mCurIndex++;
	}
	
	public abstract boolean isDone();
	public abstract Node currentItem();
	
	
	
	protected Graph mGraph;
	protected int mCurIndex;
	protected int mSize;
	
	
	{
		mGraph = null;
		mCurIndex = 0;
		mSize = 0;
	}
}
