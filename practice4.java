import java.util.Scanner;
public class practice4 {
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        char temp;
        int i,j;
        char[] arr=new char[7];
        System.out.println("enter a elements");
        for(i=0;i<arr.length;i++){
            arr[i]=r.next().charAt(0);
        }
       for (i = 0, j = arr.length - 1; i < j; i++, j--){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        System.out.println("reversed array is:");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        r.close();
    }
}
