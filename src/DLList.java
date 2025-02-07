public class DLList {

    DLNode head;
    DLNode tail;

    public DLList(){
        head = null;
        tail = null;
    }

    public void addy(Song s){
        DLNode newNode = new DLNode(s);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = null;
            newNode.previous = null;
        }else{
            head.next = newNode;
            newNode.previous = head;
            head = newNode;
        }
    }

    public void removey(int pos){
        int count = 0;
        DLNode currNode = tail;
        while(currNode != null){

        }
    }
}
