public class Author {
    private String authorName;
    private String authorLastName;

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

    public String toString() {
        return authorName + " " + authorLastName;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(31 * (authorName.length() + authorLastName.length()));
    }

    public boolean equals(Author other) {
        if (this.hashCode() != other.hashCode()) {
            return false;
        } else {
            return (this.authorName == other.authorName && this.authorLastName == other.authorLastName);
        }
    }
}
