public class SLNode {

    public Song value;
    public SLNode next;

    public SLNode(Song song){
        value = song;
        next = null;
    }

    public Song getValue(){
        return value;
    }

    public SLNode getNext(){
        return next;
    }

    public void next(SLNode t){
        next = t;
    }

}
