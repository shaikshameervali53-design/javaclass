class Animal{
    String color="white";
    void eat(){
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal{
    String color="Black";
    void display(){
        System.out.println("Superclass Animal color:"+super.color);
        System.out.println("subclass Dog color:"+color);
    }
    void bark(){
        super.eat();
        System.out.println("Dog is barking...");
    }
}
public class Super{
    public static void main(String[] args){
        Dog r=new Dog();
        r.display();
        System.out.println();
        r.bark();
        r.eat();
    }
}