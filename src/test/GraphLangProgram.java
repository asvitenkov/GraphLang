
package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import antlr.RecognitionException;

import graphlib.*;


public class GraphLangProgram {

  private ArrayList<String> listForSGOVar;
  private ArrayList<String> listForSGOFirstV; 
  private ArrayList<String> listForSGOSecondV;
  private Scanner __in;
  
  private Node beginNode=new Node(),endNode=new Node();
  private int answer=123;
  int searchNext(Node curNode,int size){
    if(curNode==endNode){
      if(size<answer){
        answer=size;
      }
      else{
      }
    }
    else{
    }
    OArc aArc=new OArc();
    Node tNode=new Node();
    int temp=123;
    int tSize=123;

    graphlib.NodeIterator it_aArc439584 = curNode.OIterator();
    //aArc = it_aArc439584.currentItem();
    for(it_aArc439584.first();!it_aArc439584.isDone();it_aArc439584.next()){
    aArc=it_aArc439584.currentItem();

      tNode=aArc.getSecond();
      if(tNode.isMark()==false){
        tNode.markNode();
        temp=size+1;
        tSize=searchNext(tNode,temp);
        tNode.unmarkNode();
      }
      else{
      }

    }

    return tSize;
  }


  
  public void run() throws IOException, RecognitionException{
    Graph g=new Graph();
    Node n1=new Node(),n2=new Node(),n3=new Node(),n4=new Node(),n5=new Node();
    beginNode=n1;
    endNode=n5;
    n1.setName("v1");
    n2.setName("v2");
    n3.setName("v3");
    n4.setName("v4");
    n5.setName("v5");
    OArc a1=new OArc(),a2=new OArc(),a3=new OArc(),a4=new OArc(),a5=new OArc();
    a1.setVertex(n1,n2);
    a1.setName("v1->v2");
    a2.setVertex(n2,n3);
    a2.setName("v2->v3");
    a3.setVertex(n3,n4);
    a3.setName("v3->v4");
    a4.setVertex(n4,n5);
    a4.setName("v4->v5");
    a5.setVertex(n2,n5);
    a5.setName("v2->v5");
    System.out.println("begin node");
    System.out.println(beginNode);
    System.out.println("end node");
    System.out.println(endNode);
    g.addNode(n1);
    g.addNode(n2);
    g.addNode(n3);
    g.addNode(n4);
    OArc tmp=new OArc();
    answer=999999;
    searchNext(beginNode,0);
    if(answer!=999999){
      System.out.println(answer);
    }
    else{
      System.out.println("way does not exist");
    }

  }
  {
    __in = new Scanner(System.in);
  }
}