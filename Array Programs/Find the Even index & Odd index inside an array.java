class element{
public static void main(String[]args){
int[] a={1,2,3,4,5,6};
int Even=0;
int Odd=0;
for(int i=0;i<a.length;i++){
if(i%2==0){
Even=Even+a[i];
}else{
Odd=Odd+a[i];
}
}
System.out.println("Even:"+Even+" "+"Odd:"+Odd);

}
}
