import java.util.Scanner;
public class eve{
    public static void main(String[] args){
        int n,i;
        Scanner r=new Scanner(System.in);
        System.out.println("enter a long number that each number defines even or odd");
        n=r.nextInt();
        String no=String.valueOf(n);
        for(i=0;i<no.length();i++){
            int digit=no.charAt(i)-'0';
            if(digit%2==1){
                System.out.println("given number is odd"+digit);
            }else {
                System.out.println("given number is even"+digit);
            }
        }
    
        
        r.close();
    }
}
