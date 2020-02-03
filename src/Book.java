public class Book {
    //title, author, description, price and isInStock
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book(){

    }

    public Book(Double price){
        this.price = price;
    }

    public void getDisplayText(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Description: " + getDescription());

    }


    public  void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
         return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

}
