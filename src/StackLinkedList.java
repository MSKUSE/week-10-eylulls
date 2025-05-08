public class StackLinkedList implements Stack{
    Stackitem top = null;

    @Override
    public void push(Object item) {
        Stackitem temp_box = new Stackitem(item);
        Stackitem previous_top = top;
        top = temp_box;
        top.setNext(previous_top);

    }

    @Override
    public Object pop() {
        Object data = top.getItem();
        top = top.getNext();
        return data;
    }

    @Override
    public void peek() {
        System.out.println("the top is " + top.getItem());

    }

    @Override
    public boolean isEmpty() {
        return this.top == null;

    }
}
