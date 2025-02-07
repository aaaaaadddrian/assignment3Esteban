public class Main {

    public static void main(String[] args) {

        Song s1 = new Song();
        Song s2 = new Song();
        Song s3 = new Song();
        Song s4 = new Song();
        Song s5 = new Song();

        AList listing = new AList();

        listing.addy(s1);
        listing.addy(s2);
        listing.addy(s3);
        listing.addy(s4);
        listing.addy(s5);

        System.out.println(listing.toString());
        listing.removy(2);
        System.out.println(listing.toString());

        SLList listerton = new SLList();

        listerton.addy(s1);
        listerton.addy(s2);
        listerton.addy(s3);
        listerton.addy(s4);
        listerton.addy(s5);

        System.out.println(listerton.toString());
        listerton.removey(3);
        System.out.println(listerton.toString());


    }


}
