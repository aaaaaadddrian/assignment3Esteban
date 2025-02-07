public class SLList {

    private SLNode tail;
    private SLNode head;

    public SLList(){
        head = null;
        tail = null;
    }

    public void addy(Song s){
        SLNode newNode = new SLNode(s);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            newNode = head;
        }
    }

    public void removey(int pos){
        int currPos = 0;
        SLNode currNode = tail;
        while(currNode.next != null){
            if(pos == currPos){
                SLNode successive = currNode.next.next;
                currNode.next = successive;
            }
            currPos++;
            currNode = currNode.next;
        }
    }

    public String toString(){
        SLNode currNode = tail;
        String result = "";
        while(currNode != null){
            result = result + " " + currNode.value + "\n";
        }
        return result;
    }



}
