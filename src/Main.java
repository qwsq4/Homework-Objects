public class Main {
    public static void main(String[] args) {
        System.out.println("   Создание объектов и задание им параметров");
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Николай", "Гоголь");
        Book book1 = new Book("Война и мир", author1, 1865);
        Book book2 = new Book("Война и мир", author2, 1842);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(author1.toString());
        System.out.println(author2.toString());

        System.out.println("   Изменение параметра объекта");
        book1.setYear(1866);
        System.out.println(book1.getYear());

        System.out.println("   Сравнение объектов");
        author1.equals(author2);
        if (author1.equals(author2)) {
            System.out.println("Авторы одинаковые");
        } else {
            System.out.println("Авторы разные");
        }
        book1.equals(book2);
        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }
    }
}