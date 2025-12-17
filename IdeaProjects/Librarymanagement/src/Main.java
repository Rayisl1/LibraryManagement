public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Clean Code", "Robert Martin", 2008);
        Book book2 = new Book("Clean Code", "Robert Martin", 2008);

        LibraryMember member = new LibraryMember("Nurislam", 101);

        Library library = new Library("AITU Library", book1, member);

        library.displayInfo();

        System.out.println("Are books equal? " + book1.equals(book2));
    }
}
