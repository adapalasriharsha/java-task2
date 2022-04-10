import java.util.*;
class Fib{
public static void main(String args[]){
long n, a=0, b=1;
Scanner sc= new Scanner(System.in);
System.out.println("enter the limit: ");
n= sc.nextInt();
System.out.println("The fibonacci series of " +n+ " is :");
System.out.print(a + " " + b);
long i=1;
while(i<n-1){
long sum= a+b;
a=b;
b=sum;
System.out.print(" " +sum );
i++;
}

}
}