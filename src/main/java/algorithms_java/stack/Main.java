package algorithms_java.stack;

/**
 * Created by lombo on 2017. 02. 17..
 */
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push("Hello");
        s.push(new Float(2.4f));

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
