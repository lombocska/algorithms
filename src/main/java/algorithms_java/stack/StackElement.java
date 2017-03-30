package algorithms_java.stack;

/**
 * Created by lombo on 2017. 02. 17..
 */
public class StackElement {

    private StackElement next;
    private StackElement previous;
    private Object stackElementValue;

    public StackElement(StackElement next, StackElement previous, Object stackElementValue) {
        this.next = next;
        this.previous = previous;
        this.stackElementValue = stackElementValue;
    }

    public StackElement getNext() {
        return next;
    }

    public void setNext(StackElement next) {
        this.next = next;
    }

    public StackElement getPrevious() {
        return previous;
    }

    public void setPrevious(StackElement previous) {
        this.previous = previous;
    }

    public  Object getStackElementValue() {
        return stackElementValue;
    }

    public void setStackElementValue(Object stackElementValue) {
        this.stackElementValue = stackElementValue;
    }
}
