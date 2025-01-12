class Student:
    def __init__(self, roll_no, name, marks1, marks2, marks3):
        self.roll_no = roll_no
        self.name = name
        self.marks1 = marks1
        self.marks2 = marks2
        self.marks3 = marks3

    def percentage(self):
        """Calculate the percentage of marks."""
        total_marks = self.marks1 + self.marks2 + self.marks3
        return (total_marks / 300) * 100

    def display(self):
        """Display student details."""
        print(f"Roll No: {self.roll_no}")
        print(f"Name: {self.name}")
        print(f"Marks in Subject 1: {self.marks1}")
        print(f"Marks in Subject 2: {self.marks2}")
        print(f"Marks in Subject 3: {self.marks3}")
        print(f"Percentage: {self.percentage():.2f}%")
        print()

class StudentDatabase:
    def __init__(self):
        self.students = {}

    def add_student(self, roll_no, name, marks1, marks2, marks3):
        """Add a student to the database."""
        if roll_no in self.students:
            print(f"Student with Roll No {roll_no} already exists.")
        else:
            self.students[roll_no] = Student(roll_no, name, marks1, marks2, marks3)
            print(f"Student with Roll No {roll_no} added successfully.")

    def delete_student(self, roll_no):
        """Delete a student from the database."""
        if roll_no in self.students:
            del self.students[roll_no]
            print(f"Student with Roll No {roll_no} deleted successfully.")
        else:
            print(f"No student found with Roll No {roll_no}.")

    def display_students(self):
        """Display details of all students."""
        if not self.students:
            print("No student records found.")
        else:
            for student in self.students.values():
                student.display()

ob = StudentDatabase()

ob.add_student(1, "Alice", 85, 90, 95)
ob.add_student(2, "Bob", 78, 82, 88)
ob.add_student(3, "Charlie", 92, 89, 84)

print("All student details:")
ob.display_students()

ob.delete_student(2)

print("Student details after deletion:")
ob.display_students()
