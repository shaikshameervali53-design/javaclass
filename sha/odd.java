import java.util.Scanner;
public class odd {
    public static void main(String[] args){
        int n;
        Scanner r=new Scanner(System.in);
        System.out.print("enter a number: ");
        n=r.nextInt();
        int temp=n;
        int divi=1;
        while(temp>=10){
            temp/=10;
            divi*=10;

        }
        while(divi>0){
            int digit=n/divi;
            if(digit%2==1){
                System.out.println(digit+" is odd");
            }else {
                System.out.println(digit+" is even");
            }
           n%=divi;
           divi/=10; 
        }
        r.close();
    }
}
