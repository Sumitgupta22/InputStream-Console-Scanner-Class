package javainputclass;
import java.io.*;
public class Input_Stream{
public void InputStream(){
try{InputStreamReader obj = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(obj);
    in.readLine();
    String str = in.readLine();
   // return str;
  }catch(Exception e){
  System.out.println(e);
  }}
}