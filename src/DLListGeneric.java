public class DLListGeneric<T> {

    private DLNodeGeneric head;
    private DLNodeGeneric tail;
    private int size = 0;

    public DLListGeneric(){
        head = null;
        tail = null;
    }

    public void addy(T s){
        DLNodeGeneric newNode = new DLNodeGeneric(s);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            DLNodeGeneric current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
            tail = newNode;
        }
        size++;
    }

    public void removey(int pos){
        if(pos == 0){
            head = head.next;
            head.next.previous = head;
        }
        if(pos == size - 1){
            tail = tail.previous;
            tail.previous.next = tail;
        }

        if(pos > size/2){
            DLNodeGeneric current = tail;
            for(int i = size; i > pos; i--){
                current = current.previous;
            }
            current.previous.previous.next = current;
            current.previous = current.previous.previous;
        }else{
            DLNodeGeneric current = head;
            for(int i = 0; i < pos; i++){
                current = current.next;
            }
            current.next.previous = current;
            current.next = current.next.next;
        }
        size--;
    }
}
