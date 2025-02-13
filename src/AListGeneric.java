public class AListGeneric {
    private int size;
    private int maxSize;
    private Object[] list;

    public AListGeneric(){
        maxSize = 10;
        list = new Object[maxSize];
        size = 0;
    }

    public void addy(Song s){
        list[size] = s;
        if(size > maxSize){
            maxSize *= 2;
            Object[] tempList = new Object[maxSize];

            for(int i = 0; i < list.length; i ++){
                tempList[i] = list[i];
            }
            list = tempList;
        }
        size++;
    }

    public void removy(int pos){
        for(int i = pos; i < size; i ++){
            list[pos] = list[pos + 1];
        }
        size--;
    }

    //    public String toString(){
    //
    //    }
    public String toString(){
        for(Object g : list){
            return g.toString();
        }
        return null;
    }
}
