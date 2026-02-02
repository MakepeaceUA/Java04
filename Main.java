public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setTitle("Title01");
        book1.setAuthorName("Author01");
        book1.setYear(2000);

        book1.setPublisherName("Publisher01");
        book1.setGenre("Genre01");
        book1.setPages(20);

        Book book2 = new Book(
                "Title02",
                "Author02",
                2002,
                "Publisher02",
                "Genre01",
                40
        );

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println("Автор второй книги: " + book2.getAuthorName());
    }
}