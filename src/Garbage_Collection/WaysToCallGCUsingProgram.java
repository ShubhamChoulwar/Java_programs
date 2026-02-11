package Garbage_Collection;

/**
 * two ways
 * 1. System.gc();
 * 2. Runtime class Runtime.getRuntime().gc()
 */

public class WaysToCallGCUsingProgram {

    public static void main(String[] args) {
        //1. using System.gc();
        WaysToCallGCUsingProgram t1 = new WaysToCallGCUsingProgram();

        t1 = null;  //nullifying object  //eligible for GC

        System.gc();  //request to JVM for GC
        /**
         * JVM may ignore sometime GC calling because JVM will check is there any less heap memory
         * then JVM will remove some objects but not sure all eligible objects will get deleted, some object
         * JVM will delete and free up memory
         */

        //2. using Runtime.getRuntime().gc()
        System.out.println(Runtime.getRuntime().freeMemory());
        WaysToCallGCUsingProgram t2 = new WaysToCallGCUsingProgram();
        System.out.println(Runtime.getRuntime().freeMemory());
        t2 = null;
        System.out.println(Runtime.getRuntime().freeMemory());
        Runtime.getRuntime().gc();
        System.out.println(Runtime.getRuntime().freeMemory());

        /**
         * JVM may ignore sometime GC calling because JVM will check is there any less heap memory
         * then JVM will remove some objects but not sure all eligible objects will get deleted, some object
         * JVM will delete and free up memory
         */
        /**
         *
         */


    }

}
