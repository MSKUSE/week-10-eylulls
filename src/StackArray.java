import java.util.ArrayList;

public class StackArray implements  Stack {
    private ArrayList<Object> stack = new ArrayList<>();


    @Override
    public void push(Object item) {
        stack.add(0,item);
    }

    @Override
    public Object pop() {
        return this.isEmpty()? null:stack.remove(0);
    }

    @Override
    public void peek() {
        if(this.isEmpty()){
            System.out.println("stack is empty!");
            return;
        }
        System.out.println("top element is " + stack.get(0));

    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
