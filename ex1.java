

class A{
    void add(double a,double b,double c){
        
        double discriminant=b*b-4*a*c;
        System.out.print("discriminant is:"+discriminant);
        
        if(discriminant>0){
            double root1=(-b+Math.sqrt(discriminant))/(2*a);
            double root2=(-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("roots are real and distinct");
            System.out.println("root1"+root1);
            System.out.println("root2"+root2);
        }
        else if(discriminant==0){
            double root=-b/(2*a);
            System.out.println("roots are real and equal");
            System.out.println("root"+root);
        }
        else{
            System.out.println("Equation has no real roots");
        }
        
    }
    
}
public class ex1{
    public static void main(String[] args){
    A a=new A();
    a.add(2.0,6.0,0);
    }
}
