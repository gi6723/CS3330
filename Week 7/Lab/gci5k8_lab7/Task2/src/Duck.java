//Represents a duck which is a type of animal
public class Duck extends Animal {
    //Overrides the say method to return the duck's sound
    @Override
    public String say() {
        return "quack-quack";
    }
}
