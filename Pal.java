import java.util.*;
class Pal{
public static void main(String args[]){
String a, b= "";
Scanner sc= new Scanner(System.in);
System.out.println("Enter the word: ");
a= sc.nextLine();
for(int i= a.length()-1; i>=0; i--){
b= b+a.charAt(i);
}
if(a.equals(b)){
System.out.println("Palindrome");
}
else{
System.out.println("not a palindrome");
}
}
}