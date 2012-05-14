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
		OArc a2 = new OArc(n2,n3);
		OArc a3 = new OArc(n3,n4);
		OArc a4 = new OArc();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		
		System.out.println("eeeee\n");

	}

}
