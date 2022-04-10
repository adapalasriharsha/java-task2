import java.util.*;
class Basic{
public static void main(String args[]){
char op;
double num1,num2;
double res=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter the operator: +,-,*,or/");
op= sc.next().charAt(0);
System.out.println("enter first number: ");
num1= sc.nextDouble();
System.out.println("enter second number: ");
num2= sc.nextDouble();

switch(op){
case '+':
res= num1+num2;
break;

case '-':
res= num1-num2;
break;

case '*':
res= num1*num2;
break;

case '/':
res= num1/num2;
break;

default:
System.out.println("invalid");
break;
}
System.out.println("The result of" + num1 + " " + op + " " + num2 + " is " + res);
}
}