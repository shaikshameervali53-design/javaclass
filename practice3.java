import java.util.Scanner;
public class practice3{
    public static void main(String[] args){
        String name;
        Scanner r=new Scanner(System.in);
        System.out.println("enter a string:");
        name=r.next();
        StringBuilder sb=new StringBuilder(name);
        sb.reverse().toString();
        System.out.println(sb);
        r.close();
    }
}