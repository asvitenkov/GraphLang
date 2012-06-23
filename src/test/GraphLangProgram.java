
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
  
  void voidF1(){
    return ;
  }

  int intF(int ___a){
    return ___a;
  }

  double doubleF(double ___a){
    return ___a;
  }

  String stringF(String ___a){
    return ___a;
  }

  Graph graphF(Graph ___g){
    return ___g;
  }

  Node nodeF(Node ___n){
    return ___n;
  }

  OArc oarcF(OArc ___a){
    return ___a;
  }


  
  public void run() throws IOException, RecognitionException{
    double ___f=0;
    Node ___n=new Node();
    ___n.setName("test node");
    Graph ___g=new Graph();
    ___g.setName("test graph");
    OArc ___a=new OArc();
    ___a.setName("test arc");
    int ___i=0;
    boolean ___b;
    String ___s="";
    System.out.println("hello");

  }
  {
    __in = new Scanner(System.in);
  }
  
  
    public static void main(String[] args) {
    GraphLangProgram pr = new GraphLangProgram();
    try {
    pr.run();
  } catch (Exception e) {
    e.printStackTrace();
  }
  }
  
}