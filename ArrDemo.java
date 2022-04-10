import java.util.*;
class ArrDemo{
public static void main(String args[]){
ArrayList<Integer> arrlist= new ArrayList<Integer>(5);
arrlist.add(20);
arrlist.add(15);
arrlist.add(30);
arrlist.add(45);
System.out.println(arrlist);
arrlist.remove(2);
System.out.println("After removing: " +arrlist);
}
}