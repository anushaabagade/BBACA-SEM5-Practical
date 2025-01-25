class setaq4 {
    private String name;
    private int age;

    // Constructor to initialize Person object
    public setaq4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method to copy data from another Person object
    public void copyFrom(setaq4 other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Main method to test copying
    public static void main(String[] args) {
        // Create the first Person object
        setaq4 person1 = new setaq4("Alice", 30);
        System.out.println("Person 1 details:");
        person1.display();

        // Create the second Person object
        setaq4 person2 = new setaq4("Bob", 25);
        System.out.println("Person 2 details before copying:");
        person2.display();

        // Copy data from person1 to person2
        person2.copyFrom(person1);
        System.out.println("Person 2 details after copying:");
        person2.display();
    }
}
