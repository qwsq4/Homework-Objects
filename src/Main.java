public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Николай", "Гоголь");
        Book book1 = new Book("Война и мир", author1, 1865);
        Book book2 = new Book("Мертвые души", author2, 1842);
        System.out.println(book1.getBook());
        System.out.println(book2.getBook());
        book1.setYear(1866);
        System.out.println(book1.getYear());
    }
}