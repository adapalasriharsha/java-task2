import java.util.*;
class Fact{
public static void main(String args[]){
int n, fac=1;
Scanner sc= new Scanner(System.in);
System.out.print("enter the number: ");
n= sc.nextInt();
for(int i=1; i<=n; i++){
fac=fac*i;
}
System.out.print("The factorial of " +n+ " is: " +fac);
}
}