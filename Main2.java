class Animal{
    String name;
    public void displayAnimal(){
        System.out.println("Iam an animal");
    }
}
class Dog extends Animal{
    public void displayDog(){
        System.out.println("Iam a dog");
    }
}
class Puppy extends Dog{
    public void displayPuppy(){
        System.out.println("iam a puppy");
    }
}
public class Main2{
    public static void main(String[] args){
        Puppy p=new Puppy();
        p.displayAnimal();
        p.displayDog();
        p.displayPuppy();
    }
}