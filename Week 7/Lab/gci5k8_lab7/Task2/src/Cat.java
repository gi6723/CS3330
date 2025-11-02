//Represents a cat which is a type of animal
public class Cat extends Animal {
    //Overrides the say method to return the cats sound
    @Override
    public String say() {
        return "meow-meow";
    }
}
