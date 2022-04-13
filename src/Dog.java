public class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.print("Bark! Bark!");
        System.out.print("\nI am " + name);
        System.out.print("\nMy breed is " + breed);
    }
}

class DogTest {
    public static void main(String[] args){
        Dog d = new Dog();
        d.size = 50;
        d.breed = "G.Shephard";
        d.name = "Don";
        d.bark();
    }

}