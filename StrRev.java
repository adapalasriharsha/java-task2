import java.util.*;
class StrRev{
public static void main(String args[]){
String a, b="";
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string to reverse");
a= sc.nextLine();
for(int i=a.length()-1; i>=0; i--){
b=b+a.charAt(i);
}
System.out.print("Reversed String: " +b);
}
}