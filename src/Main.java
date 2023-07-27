public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Федор", "Достоевский");

        Book book = new Book("Book ", author, 1967);
        Book book1 = new Book("Book1 ", author1, 1866);

        System.out.println( book.getTitle() +  book.getAuthor().getFirstName() + " "  + book.getAuthor().getLastName() + ", публикация в " + book.getYaer() + " году");
        System.out.println( book1.getTitle() +  book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", публикая в " + book1.getYaer() + " году");
        book.setYaer(1989);
        System.out.println(book.getTitle()  + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ", публикация в " + book.getYaer() + " году");
    }
}