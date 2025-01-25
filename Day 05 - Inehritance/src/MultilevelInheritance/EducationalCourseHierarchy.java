package MultilevelInheritance;

// Defining the superclass Course
class Course {
    // Class Attributes
    public String courseName;
    public int duration;

    // Defining Constructor
    public Course(String courseName, int duration) {
        // Initializing the attributes
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course name: " + courseName);
        System.out.println("Course duration: " + duration + " weeks.");
    }
}

// Defining the subclass OnlineCourse
class OnlineCourse extends Course {
    // Class Attributes
    public String platform;
    public boolean isRecorded;

    // Defining Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        // Calling the superclass constructor
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding the displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Defining the subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    // Class Attributes
    public double fee;
    public double discount;

    // Defining Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
            double discount) {
        // Calling the superclass constructor
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate discounted fee
    public double calculateDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    // Overriding the displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: $" + calculateDiscountedFee());
    }
}

// Main class
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Creating instances of each class
        Course course = new Course("Java", 45);
        OnlineCourse onlineCourse = new OnlineCourse("Math", 8, "Zoom", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Science", 12, "Google Meet", true, 200.0, 20.0);

        // Calling the displayCourseInfo method on each instance
        course.displayCourseInfo();
        System.out.println();
        onlineCourse.displayCourseInfo();
        System.out.println();
        paidOnlineCourse.displayCourseInfo();
    }
}
