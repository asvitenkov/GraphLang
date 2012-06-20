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

    graphlib.NodeIterator it_aArc289259 = curNode.OIterator();
    it_aArc289259.first();
    aArc = it_aArc289259.currentItem();
    for(;!it_aArc289259.isDone();aArc=it_aArc289259.currentItem(),it_aArc289259.next()) 
    {
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
    beginNode.setName("begin");
    endNode.setName("end");

    // set graph operation
    listForSGOVar = new ArrayList<String>();
    listForSGOFirstV = new ArrayList<String>();
    listForSGOSecondV = new ArrayList<String>();
    listForSGOVar.add("v1");
    listForSGOVar.add("v2");
    listForSGOVar.add("v3");
    listForSGOFirstV.add("v1");
    listForSGOFirstV.add("v2");
    listForSGOSecondV.add("v2");
    listForSGOSecondV.add("v3");
    g.setGraph(listForSGOVar,listForSGOFirstV,listForSGOSecondV);
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

  public static void main(String[] args) throws RecognitionException, IOException{
	  GraphLangProgram pr = new GraphLangProgram();
	  pr.run();
  }
  
}


