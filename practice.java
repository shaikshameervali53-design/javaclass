import java.util.Scanner;
public class practice{
public static void main(String[] args){
int n,i;
Scanner r=new Scanner(System.in);
System.out.print("enter a number");
n=r.nextInt();
System.out.println("odd numbers are:");
for(i=0;i<=n;i++){
if(i%2==1){
System.out.println(i);
r.close();
}
}
}
}
