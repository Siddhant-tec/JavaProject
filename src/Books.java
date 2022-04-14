public class Books {
    String name;
    String author;

}

class Book_run{
    public static void main(String[] args){
        Books[] mybooks = new Books[3];
        mybooks[0] = new Books();
        mybooks[1] = new Books();
        mybooks[2] = new Books();

        mybooks[0].author = "H.G Wells";
        mybooks[0].name = "The Invisible Man";
        mybooks[1].author = "Anne Frank";
        mybooks[1].name = "The Diary of a young girl";
        mybooks[2].name = "The story of my Life";
        mybooks[2].author = "Hellen Keller";

        int x = 0;

        while (x < mybooks.length){
            System.out.println(mybooks[x].name + " by "+ mybooks[x].author);
            x = x + 1;
        }

    }
}