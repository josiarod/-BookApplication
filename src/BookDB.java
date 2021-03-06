   class BookDB {
       String sku = "Java1001";
       private String title;
       private String author;
       private String description;
       private double price;

       public BookDB() {

       }


       public BookDB(String SKU) {
           this.sku = SKU;
           switch (this.sku) {
               case "Java1001":
                   this.title = "Head First Java";
                   this.author = "Kathy Sierra and Bert Bates";
                   this.description = "Easy to read Java workbook";
                   this.price = 47.50;
                   break;
               case "Java1002":
                   this.title = "Thinking in Java";
                   this.author = "Bruce Eckel";
                   this.description = "Details about Java under the hood";
                   this.price = 20.00;
                   break;
               case "Orcl1003":
                   this.title = "OCP: Oracle Certified Professional Java SE";
                   this.author = "Jeanne Boyarsky";
                   this.description = "Everything you need to know in one place";
                   this.price = 45.00;
                   break;
               case "Python1004":
                   this.title = "Automate the Boring Stuff with Python";
                   this.author = "Al Sweigart";
                   this.description = "Fun with Python";
                   this.price = 10.50;
                   break;
               case "Zombie1005":
                   this.title = "The Maker's Guide to the Zombie Apocalypse";
                   this.author = "Simon Monk";
                   this.description = "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi";
                   this.price = 16.50;
                   break;
               case "Rasp1006":
                   this.title = "Raspberry Pi Projects for the Evil Genius";
                   this.author = "Donald Norris";
                   this.description = "A dozen fiendishly fun projects for the Raspberry Pi!";
                   this.price = 14.75;
                   break;
           }


       }

     public void book(){
         System.out.println("Title: " + getTitle());
         System.out.println("Author: " + getAuthor());
         System.out.println("Description: " + getDescription());
         System.out.println("Price: " + getPrice());
         System.out.println();
     }

       public String getSku() {
           return sku;
       }

       public void setSku(String sku) {
           this.sku = sku;
       }

       public String getTitle() {
           return title;
       }

       public void setTitle(String title) {
           this.title = title;
       }

       public String getAuthor() {
           return author;
       }

       public void setAuthor(String author) {
           this.author = author;
       }

       public String getDescription() {
           return description;
       }

       public void setDescription(String description) {
           this.description = description;
       }

       public double getPrice() {
           return price;
       }

       public void setPrice(double price) {
           this.price = price;
       }


   }
