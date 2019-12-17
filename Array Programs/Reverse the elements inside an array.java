class reverse{
public static void main(String[]args){
int[] a={1,2,3,4,5,6};
int center=a.length/2;
for(int i=0;i<center;i++){
int temp=a[i];
a[i]=a[a.length-i-1];
a[a.length-i-1]=temp;
}
for(int k=0;k<a.length;k++){
System.out.print(a[k]+" ");
}

}}
