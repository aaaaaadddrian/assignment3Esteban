public class DLNode {

    public Song value;
    public DLNode next;
    public DLNode previous;

    public DLNode(Song song){
        value = song;
        next = null;
        previous = null;
    }

}
