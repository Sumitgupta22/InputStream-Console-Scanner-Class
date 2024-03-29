package javainputclass;
import java.io.*;
public class Console_class{
public void Consolclass(){
   Console c=System.console();    
   System.out.println("Enter your name: ");    
   String n=c.readLine();    
   System.out.println("Welcome "+n);    
  }
}