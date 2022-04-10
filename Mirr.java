class Mirr{
static boolean mirrInv(int arr[]){
for(int i=0; i<arr.length; i++){
if(arr[arr[i]] != i)
return false;
}
return true;
}
public static void main(String args[]){
int arr[]= {3,4,2,0,1};
if(mirrInv(arr))
System.out.println("YES");
else 
System.out.println("NO");
}
}