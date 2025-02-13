public class DLNodeGeneric<T> {

    public T value;
    public DLNodeGeneric next;
    public DLNodeGeneric previous;

    public DLNodeGeneric(T thing){
        value = thing;
        next = null;
        previous = null;
    }
}
