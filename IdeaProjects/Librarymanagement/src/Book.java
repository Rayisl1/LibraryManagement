public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {return title;}

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
//        return title.equals(other.title) && author.equals(other.author);
        if (this.title == other.title && this.author == other.author ) return true;
        return false;
    }

    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
    }
}
