import java.util*;
public class Main{
  public static void main(String[] args){
    SortedMap<Integer, String> map = new TreeMap<> ();
    map.put(3, "Apple");
    map.put(1, "Banana");
    map.put(4, "Cherry");
    map.put(2, "Date");
    System.out.println(map);
  }
}
