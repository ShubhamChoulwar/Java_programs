package AbstractClass;

public interface Loc {

    void location(String location);    //in interface bydefault methods are abstract

    default void WFH(){
        System.out.println("Employee work from home");
    }
}
