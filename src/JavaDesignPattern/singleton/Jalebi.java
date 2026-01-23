package JavaDesignPattern.singleton;

public class Jalebi {
    /**
     * Eager way of creating object - at the time of loading class itself object will create.
     * whether any class calls it or not.
     */

    private Jalebi(){

    }

    private static Jalebi instance = new Jalebi();

    public static Jalebi getInstance(){
        return instance;
    }
}
