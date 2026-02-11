package JavaDesignPattern.singleton;

public class Samosa {

    private Samosa(){
        //declared constructor as private because other class should not call constructor and created new object.
    }

    private static Samosa test;
        /**
         * this getInstance method should called by another class to get the object,
         * if object is not created the then it will create object and return to caller.
         */

        //this is Lazy way of singleton object creation. means when anyone called this method then only object will create.

        public static Samosa getInstance() {
            if (test == null) {
                test = new Samosa();
            }
            return test;
        }
}
