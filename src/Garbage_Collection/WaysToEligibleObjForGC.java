package Garbage_Collection;

public class WaysToEligibleObjForGC {
    public static void main(String[] args) {
        /**
         * 1. Nullifying reference
         */
        WaysToEligibleObjForGC t1 = new WaysToEligibleObjForGC();
        t1 = null;
        //
        /**
         * after processing task with the object t1 you can make t1 as null so object will not be
         * having any reference then GC will destroy this object.
         */

        //2. Reassigning reference
        WaysToEligibleObjForGC t2 = new WaysToEligibleObjForGC();
        t2 = new WaysToEligibleObjForGC(); //above object eligible for GC.

        //3.Island of Isolation
        WaysToEligibleObjForGC t3 = new WaysToEligibleObjForGC();
        WaysToEligibleObjForGC t4 = new WaysToEligibleObjForGC();
        t3 = t4;
        t4 = t3;

        t3 = null;
        t4 = null;

        /**
         * Two services referencing each other but removed from main system.
         * 
         */


    }
    //4.Object created inside method (local reference ends)
    public static void m1(){
        WaysToEligibleObjForGC t5 = new WaysToEligibleObjForGC();
        t5.toString();
        /**
         * once method execution ends, t3 object will be eligible for GC.
         */
    }

}
