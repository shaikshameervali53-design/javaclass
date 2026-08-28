import java.util.Scanner;
class A{
private int add(int a,int b){
int c=a+b;
System.out.println(c);
return 1;
}
public void calculate(int a,int b){
add(a,b);
}
}
public class practice2{
public static void main(String[] args){
int a,b;
Scanner r=new Scanner(System.in);
System.out.println("enter a value");
a=r.nextInt();
System.out.println("enter b value");
b=r.nextInt();
A v=new A();
v.calculate(a,b);
r.close();
}}
