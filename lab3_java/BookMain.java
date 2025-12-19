import java.util.Scanner;
class Book{
    private String name;
    private String author;
    private int price;
    private int num_pages;
    Book(int price,String name,String author,int pages){
        this.name=name;
        this.author=author;
        this.price=price;
        num_pages=pages;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void setnumpages(int pages){
        num_pages=pages;
    }
    
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getprice(){
        return price;
    }
    public int getpages(){
        return num_pages;
    }
    
    public String toString(){
        return "Book Name: "+name+"\nAuthor Name: "+author+"\nprice: "+price+"\nNumber of pages: "+num_pages;
    }
}
class BookMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        sc.nextLine();
        Book[] book=new Book[n];
        for(int i=1;i<=n;i++){
            System.out.println("Enter details of book "+i+": ");
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Author name: ");
            String author=sc.nextLine();
            System.out.print("Price: ");
            int price=sc.nextInt();
            System.out.print("Number of pages: ");
            int pages=sc.nextInt();
            book[i-1]=new Book(price,name,author,pages);
            System.out.println("Details of book "+i+" are: \n"+book[i-1]);
            sc.nextLine();
        }
    }
}
