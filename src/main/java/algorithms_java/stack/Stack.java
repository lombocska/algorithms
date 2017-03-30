package algorithms_java.stack;

import java.io.ObjectInput;

/**
 * Created by lombocska on 2017. 02. 17..
 */
public class Stack {

    public StackElement firstElement;

    public Object push(Object object) {
        StackElement s1 = new StackElement(null, null, object);
        if (firstElement == null) {
            firstElement = s1;
        }
        else {
            firstElement.setNext(s1);
            s1.setPrevious(firstElement);
            firstElement = s1;
        }
        return s1.getStackElementValue();
    }

    public Object pop(){
        StackElement popedStackElement =  firstElement;
        firstElement = firstElement.getPrevious();
        return popedStackElement.getStackElementValue();
    }
}
