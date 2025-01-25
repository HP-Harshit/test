package SingleInheritance;

// Defining the superclass Book
class Book {
    // Class Attributes
    public String title;
    public int publicationYear;

    // Defining Constructor
    public Book(String title, int publicationYear) {
        // Initializing the attributes
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Defining the subclass Author
class Author extends Book {
    // Class Attributes
    public String name;
    public String bio;

    // Defining Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        // Calling the superclass constructor
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating an instance of Author
        Author author = new Author("The Great Book", 2025, "John Doe",
                "John Doe is an acclaimed author known for his insightful writings on modern fiction.");

        // Calling the displayInfo method on the instance
        author.displayInfo();
    }
}
