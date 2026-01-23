package JavaDesignPattern.singleton;

import JavaDesignPattern.singleton.Jalebi;
import JavaDesignPattern.singleton.Samosa;

public class SingletonDemo {

    public static void main(String[] args) {

        Jalebi jalebi1 = Jalebi.getInstance();
        System.out.println(jalebi1.hashCode());
        Jalebi jalebi2 = Jalebi.getInstance();
        System.out.println(jalebi2.hashCode());

        Samosa samosa1 = Samosa.getInstance();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getInstance();
        System.out.println(samosa2.hashCode());

    }
}
