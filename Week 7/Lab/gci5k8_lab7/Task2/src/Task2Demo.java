public class Task2Demo {
    public static void main(String[] args) {

        //Creating animal references to cat, dog and duck
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();

        //Printing the sounds made by each animal
        System.out.println("Cat says:");
        System.out.println(cat.say());
        System.out.println();

        System.out.println("Dog says:");
        System.out.println(dog.say());
        System.out.println();

        System.out.println("Duck says:");
        System.out.println(duck.say());
    }
}
