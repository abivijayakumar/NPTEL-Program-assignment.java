import java.util.*;
public class Main{
  public static void main(String[] args){
    Vector<String> vec = new Vector<> ();
    vec.add("A");
    vec.add("B");
    vec.remove(1);
    vec.add("C");
    System.out.println(vec);
  }
}
