class University:
    def __init__(self, university_name):
        self.university_name = university_name

    def display_university(self):
        print(f"University: {self.university_name}")

class Department(University):
    def __init__(self, university_name, department_name):
        super().__init__(university_name)
        self.department_name = department_name

    def display_department(self):
        print(f"Department: {self.department_name}")

class Professor:
    def __init__(self, professor_name):
        self.professor_name = professor_name

    def display_professor(self):
        print(f"Professor: {self.professor_name}")

class Course(Department, Professor):
    def __init__(self, university_name, department_name, professor_name, course_name):
        Department.__init__(self, university_name, department_name)
        Professor.__init__(self, professor_name)
        self.course_name = course_name

    def display_course(self):
        print(f"Course: {self.course_name}")
        self.display_university()
        self.display_department()
        self.display_professor()

course = Course("SCMIRT", "BBACA", "Monali", "Python")

course.display_course()
