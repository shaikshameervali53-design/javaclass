import java.util.Scanner;
public class shameer{
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        int a ,b,n,i,temp;
        System.out.println("Enter n value to repeat");
        n=r.nextInt();
        System.out.println("Enter a,b values");
        a=r.nextInt();
        b=r.nextInt();
        for( i=0;i<n;i++){
           System.out.println(a+" ");
           temp =a+b;
           a=b;
           b=temp;
        } 
        System.out.println(b);
        r.close();
    }
}