package Java8;


import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        // Example of using Optional to avoid NullPointerException
        String str = "shubham";

        // Using Optional.ofNullable to create an Optional object
        Optional<String> optionalStr = Optional.ofNullable(str);

        // Checking if the value is present
        if (optionalStr.isPresent()) {
            System.out.println("Value is present: " + optionalStr.get());
        } else {
            System.out.println("Value is not present");
        }

        // Using orElse to provide a default value
        String defaultValue = optionalStr.orElse("Default Value");
        System.out.println("Value or default: " + defaultValue);
    }
}
