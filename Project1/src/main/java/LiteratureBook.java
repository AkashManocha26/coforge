public class LiteratureBook  extends Book{
    private String author;
    private String publisherName;

    public LiteratureBook(long isbn, String bname, float cost, String author, String publisherName) {
        super(isbn, bname, cost);
        this.author = author;
        this.publisherName = publisherName;
    }
    void literatureBookInfo(){
        System.out.println("Book Information ");
        System.out.println("\tisbn: "+getIsbn());
        System.out.println("\tname: "+getBname());
        System.out.println("\tcost: "+getCost());
        System.out.println("\tauthor: "+author);
        System.out.println("\tpublisher name: "+publisherName);
    }

    public static void main(String[] args) {
        LiteratureBook literatureBook =new LiteratureBook(1,"Harry Potter",1000,"Akash","XYZ");
        //Book book =new LiteratureBook(1,"Harry Potter",1000,"Akash","XYZ");
        literatureBook.literatureBookInfo();
    }
}
