public class Book {
    private String title;
    private Author author;
    private int yaer;

    public Book (String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.yaer = year;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public int getYaer(){
        return yaer;
    }
    public void setYaer(int yaer){
        this.yaer = yaer;
    }
}
