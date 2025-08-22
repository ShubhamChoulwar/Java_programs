package methodOverloading_1;

public class CalcMain {
    public static void main(String[] args) {

    calculator calc = new calculator();
    int result1 = calc.add(2,3);
    int result2 = calc.add(10,20,30);
    System.out.println("two parameter addition: "+ result1);
    System.out.println("three parameter addition: "+ result2);
}
}
