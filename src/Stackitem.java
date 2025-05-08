public class Stackitem {
    private Object item;
    private Stackitem next;

    public Stackitem(){

    }

    public Stackitem(Object item) {
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        if(item == null){
            return "NULL";
        }
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Stackitem getNext() {
        return next;
    }

    public void setNext(Stackitem next) {
        this.next = next;
    }
}
