package Stack;

import java.util.Stack;

public class StackOperations {

    public static void main(String[] args){

        Stack<String> stk = new Stack();

        stk.push("Name");
        stk.push("Address");
        stk.push("phone");

        System.out.println(stk);
        //stk.pop();
        //System.out.println(stk);
        stk.peek();
        System.out.println(stk);
        stk.addElement("email");
        System.out.println(stk);
        stk.push("city");
        System.out.println(stk);
    }
}
