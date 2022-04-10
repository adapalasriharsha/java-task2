import java.util.*;
class Trans{
public static void main(String args[]){
int i,j;
Scanner sc= new Scanner(System.in);
System.out.println("Enter no of rows and columns");
int row= sc.nextInt();
int col= sc.nextInt();
int arr[][]= new int[row][col];
System.out.println("Enter the matrix: ");
for(i=0; i<row; i++){
for(j=0; j<col; j++){
arr[i][j]= sc.nextInt();
System.out.print("");
}
}
System.out.println("Matrix before transpose: ");
for(i=0; i<row; i++){
for(j=0; j<col; j++){
System.out.print(arr[i][j]+ " ");
}
System.out.println(" ");
}
System.out.println("Matrix after transpose: ");
for(i=0; i<col; i++){
for(j=0; j<row; j++){
System.out.print(arr[j][i]+ " ");
}
System.out.println(" ");
}
}
}