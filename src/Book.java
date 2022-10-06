public class Book  {
    private String name;
    private Author author;
    private int year;

    public Book (String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author.getAuthorName() + " " + this.author.getAuthorLastName();
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return getName() + ", " + author.toString() + ", " + getYear();
    }

    public int hashCode() {
        return java.util.Objects.hash(31 * (name.length() + author.toString().length() + year));
    }

    public boolean equals(Book other) {
        if (this.hashCode() != other.hashCode()) {
            return false;
        } else {
            return this.name == other.name && this.author.equals(other.author) && this.year == other.year;
        }
    }
}
