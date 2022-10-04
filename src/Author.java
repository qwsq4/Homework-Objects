public class Author {
    public String authorName;
    public String authorLastName;

    public Author (String name, String lastName) {
        this.authorName = name;
        this.authorLastName = lastName;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
}
