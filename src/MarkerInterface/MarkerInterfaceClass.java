package MarkerInterface;
/**
 * This class is an example of a marker interface in Java.
 * Marker interfaces are used to indicate that a class possesses a certain property or behavior.
 * They do not contain any methods or fields.
 * For example, the Serializable interface is a marker interface that indicates that a class can be serialized
 * The main use of a marker interface is to signal to the Java runtime or other tools/frameworks that a class possesses a particular property or behavior.
 */

public class MarkerInterfaceClass {
    /**
     * This is a marker interface that indicates that the class can be serialized.
     * It does not contain any methods or fields.
     */
    public interface Serializable {
        // No methods or fields
    }

    /**
     * This is a marker interface that indicates that the class can be cloned.
     * It does not contain any methods or fields.
     */
    public interface Cloneable {
        // No methods or fields
    }

}
