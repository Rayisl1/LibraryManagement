public class Library {
    private String name;
    private Book book;
    private LibraryMember member;

    public Library(String name, Book book, LibraryMember member) {
        this.name = name;
        this.book = book;
        this.member = member;
    }

    public void displayInfo() {
        System.out.println("Library: " + name);
        System.out.println(book);
        System.out.println(member);
    }
}
