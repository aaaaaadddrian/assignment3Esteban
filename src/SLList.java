public class SLList {

    private int headPointer;
    private SLNode[] list;
    private int maxSize;
    private SLNode head;

    public SLList(){
        maxSize = 10;
        list = new SLNode[maxSize];
        head = null;
        headPointer = 0;
    }

    public void addy(Song s){
        list[headPointer] = new SLNode(s);
        if(headPointer > maxSize){
            maxSize *= 2;
            SLNode[] tempList = new SLNode[maxSize];

            for(int i = 0; i < list.length; i ++){
                tempList[i] = list[i];
            }
            list = tempList;
        }
        headPointer++;
    }

    public void removey(int pos){

    }



}
