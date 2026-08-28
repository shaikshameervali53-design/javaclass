import java.util.Scanner;
class A{
void num(int n){
int i,j;
System.out.println("prime numbers are:");
for(i=2;i<=n;i++){
int count=0;
for(j=1;j<=i;j++){
if(i%j==0){
count++;
}
}
if(count==2){
System.out.println(i);
}
}
}
}
public class practice1{
public static void main(String[] args){
Scanner r=new Scanner(System.in);
A e=new A();
System.out.println("enter a number");
int n=r.nextInt();
e.num(n);
r.close();
}
}
