class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public class exp5c{
    public static void main(String[] args){
  Animal mydog = new Dog();
  Animal mycat = new Cat();
  mydog.sound();
  mycat.sound();   
    }
}
