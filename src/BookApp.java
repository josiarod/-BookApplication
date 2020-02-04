public class BookApp {
    public static void main(String[] args){
        Book b = new Book();
        b.setAuthor("Dr. David Hawkins");
        b.setTitle("Power vs Force");
        b.setDescription("How to get a higher consciousness level.");
        b.setPrice(25.34);
        b.setInStock(true);

        b.getDisplayText();
        b.pricing(5);
        System.out.println();

        BookDB book = new BookDB("Java1001");

        book.book();

        BookDB book1 = new BookDB("Orcl1003");

        book1.book();



    }
}
