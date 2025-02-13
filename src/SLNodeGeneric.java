public class SLNodeGeneric<T> {
    public T value;
    public SLNodeGeneric next;

    public SLNodeGeneric(T thing){
        value = thing;
        next = null;
    }
}
