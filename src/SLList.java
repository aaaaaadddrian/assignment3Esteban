public class SLList {

    private SLNode head;
    private SLNode next;
    private int size;

    public SLList(){
        head = null;
        next = null;
    }

    public void addy(Song s){
        SLNode newNode = new SLNode(s);
        if(head == null){
            head = newNode;
        }else{
            SLNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removey(int pos){
        SLNode current = head;
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
        SLNode currNode = head;
        String result = "";
        while(currNode != null){
            result = currNode.value.toString() + "\n";
            currNode = currNode.next;
        }
        return result;
    }



}
