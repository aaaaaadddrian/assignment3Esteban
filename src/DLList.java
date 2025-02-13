public class DLList {

    private DLNode head;
    private DLNode tail;
    private int size = 0;

    public DLList(){
        head = null;
        tail = null;
    }

    public void addy(Song s){
        DLNode newNode = new DLNode(s);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            DLNode current = head;
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
        if(pos > size/2){
            DLNode current = tail;
            for(int i = size; i > pos; i--){
                current = current.previous;
            }
            current.previous.previous.next = current;
            current.previous = current.previous.previous;
        }else{
            DLNode current = head;
            for(int i = 0; i < pos; i++){
                current = current.next;
            }
            current.next.previous = current;
            current.next = current.next.next;
        }
        size--;
    }
}
