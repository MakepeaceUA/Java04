import java.util.Scanner;

public class Book {

    private String title;
    private String authorName;
    private int year;
    private String publisherName;
    private String genre;
    private int pages;

    public Book() {}

    public Book(String bookTitle, String bookAuthor, int publicationYear, String publisher, String bookGenre, int pagesCount)
    {
        title = bookTitle;
        authorName = bookAuthor;
        year = publicationYear;
        publisherName = publisher;
        genre = bookGenre;
        pages = pagesCount;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public void setAuthorName(String newAuthorFullName)
    {
        authorName = newAuthorFullName;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int newYearOfPublication)
    {
        year = newYearOfPublication;
    }

    public String getPublisherName()
    {
        return publisherName;
    }

    public void setPublisherName(String newPublisherName)
    {
        publisherName = newPublisherName;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String newGenre)
    {
        genre = newGenre;
    }

    public int getPages()
    {
        return pages;
    }

    public void setPages(int newNumberOfPages)
    {
        pages = newNumberOfPages;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги: ");
        title = scanner.nextLine();

        System.out.print("Введите ФИО автора: ");
        authorName = scanner.nextLine();

        System.out.print("Введите название издательства: ");
        publisherName = scanner.nextLine();

        System.out.print("Введите жанр книги: ");
        genre = scanner.nextLine();

        System.out.print("Введите год выпуска: ");
        year = scanner.nextInt();

        System.out.print("Введите количество страниц: ");
        pages = scanner.nextInt();
    }

    @Override
    public String toString()
    {
        return "Название:" + title + ", Автор:" + authorName + ", Год выпуска:" + year + ", Издательство:" + publisherName +
                ", Жанр:" + genre + ", Страниц:" + pages;
    }
}
