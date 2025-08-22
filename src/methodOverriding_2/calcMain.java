package methodOverriding_2;

public class calcMain {

    public static void main(String[] args){
        Calculation adv = new AdvCalculation();    //creating instance/object of subclass by calling parent class.
        String result = adv.add(5,10);
        System.out.println(result);

    }
}
