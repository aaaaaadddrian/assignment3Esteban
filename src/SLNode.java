public class SLNode {

    private Song value;
    private SLNode next;

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

}
