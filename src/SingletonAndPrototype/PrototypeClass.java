package SingletonAndPrototype;

/**
 * This class represents a prototype class.
 * It is an empty class for demonstration purposes.
 * Prototype classes are designed to be cloned to create new instances.
 * They typically implement a method to clone themselves, allowing for the creation of copies with the same state.
 */


public class PrototypeClass {


    // Method to clone the current instance
    public PrototypeClass clone() {
        try {
            return (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can never happen
        }
    }
}
