public class AList {

    private int size;
    private int maxSize;
    private Song[] list;

    public AList(){
        maxSize = 10;
        list = new Song[maxSize];
        size = 0;
    }

    public void addy(Song s){
        list[size] = s;
        if(size > maxSize){
            maxSize *= 2;
            Song[] tempList = new Song[maxSize];

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

    public String toString(){
        String result = "";

        for(Song s : list){
            result = result + s.getTitle() + "\n";
        }

        return result;
    }





}
