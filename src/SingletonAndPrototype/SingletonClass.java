package SingletonAndPrototype;

/**
 * This class represents a singleton class.
 * It is an empty class for demonstration purposes.
 * Singleton classes are designed to have only one instance throughout the application.
 * Typically, they provide a global access point to that instance.
 * Commonly, they implement a private constructor and a static method to get the instance.
 */

public class SingletonClass {
    // Private constructor to prevent instantiation
    private SingletonClass() {
        // Initialization code can go here
    }

    // Static method to provide access to the single instance
    public static SingletonClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // Inner static class responsible for holding the singleton instance
    private static class SingletonHolder {
        private static final SingletonClass INSTANCE = new SingletonClass();
    }
}
