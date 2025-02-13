public class SLListGeneric<T> {

    private SLNodeGeneric head;
    private SLNodeGeneric next;
    private int size;

    public SLListGeneric(){
        head = null;
        next = null;
    }

    public void addy(T s){
        SLNodeGeneric newNode = new SLNodeGeneric(s);
        if(head == null){
            head = newNode;
        }else{
            SLNodeGeneric current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removey(int pos){
        SLNodeGeneric current = head;
        if(pos == 0){
            head = head.next;
        }else{
            for(int i = 0; i < pos; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public String toString(){
        SLNodeGeneric currNode = head;
        String result = "";
        while(currNode != null){
            result = currNode.value.toString() + "\n";
            currNode = currNode.next;
        }
        return result;
    }

}
