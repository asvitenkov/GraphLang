package graphlib;
import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	
	public int answer;
	
	public Node beginNode, endNode;
	
	private void searchNext(Node curNode, int size){
		if(curNode==endNode){
			if(size<answer){
				answer=size;
				return;
			}
		}
		
		OArc arc;
		Node node;
		int temp;
		NodeIterator it = curNode.OIterator();
		for(it.first(); !it.isDone();it.next()){
			arc = it.currentItem();
			node = arc.getSecond();
			if(!node.isMark()){
				node.markNode();
				temp=size+1;
				searchNext(node, temp);
				node.unmarkNode();
			}
		}
	}
	
	public static void main(String[] args) {

		Graph g1 = new Graph();
		Node n1 = new Node("v1");
		Node n2 = new Node("v2");
		Node n3 = new Node("v3");
		Node n4 = new Node("v4");
		Node n5 = new Node("v5");
		OArc a1 = new OArc(n1, n2);
		a1.setName("v1->v2");
		OArc a2 = new OArc(n2, n3);
		a2.setName("v2->v3");
		OArc a3 = new OArc(n3, n4);
		a3.setName("v3->v4");
		OArc a4 = new OArc(n4, n5);
		a4.setName("v4->v5");
		OArc a5 = new OArc(n1, n5);
		a5.setName("v1->v5");
		OArc a6 = new OArc(n1, n3);
		a5.setName("v1->v3");
		
		
		main m = new main();
		
		m.answer = 99999;
		
		m.beginNode = n1;
		m.endNode = n5;
		
		
		m.searchNext(m.beginNode, 0);
		
		System.out.println(m.answer);
		
		graphlib.NodeIterator it_aArc = n1.IOIterator();
	    OArc aArc = it_aArc.currentItem();
	    for(it_aArc.first();!it_aArc.isDone();aArc=it_aArc.currentItem(),it_aArc.next()) 
	    {
	      System.out.println(aArc);

	    }
	    
	    
	    Scanner in = new Scanner(System.in);
	    String name;
	    int age;
	    
	    

	       // Reads a integer from the console
	       // and stores into age variable
	    age=in.nextInt();
	    name = in.nextLine();
	    in.close();            

	       // Prints name and age to the console
	    System.out.println("Name :"+name);
	    System.out.println("Age :"+age);
		
	}

}
