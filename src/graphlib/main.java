package graphlib;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node n1 = new Node("1");
		Node n2 = new Node("2");
		Node n3 = new Node("3");
		Node n4 = new Node("4");
		Node n5 = new Node("5");
		Node n6 = new Node("6");
		Node n7 = new Node("7");
		OArc a1 = new OArc(n1,n2);
		a1.setName("1->2");
		OArc a2 = new OArc(n1,n3);
		a2.setName("1->3");
		OArc a3 = new OArc(n6,n1);
		a3.setName("6->1");
		OArc a4 = new OArc(n7,n1);
		a4.setName("7->1");
//		OArc a5 = new OArc(n5,n1);
//		a5.setName("5->1");
//		OArc a6 = new OArc(n4,n1);
//		a6.setName("4->1");
//		OArc a7 = new OArc(n1,n6);
//		a7.setName("1->6");
		
		
		System.out.println(n1);
		
//		a1.setVertex(null, null);
		
		OArc tmp;
		NodeIterator it = n1.IOIterator();
		while(!it.isDone()){
			tmp=it.currentItem();
			System.out.println(tmp);
			it.next();
		}
		
	
		
		
		
		
	}

}
