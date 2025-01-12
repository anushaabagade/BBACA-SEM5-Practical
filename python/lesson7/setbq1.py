class InvalidDateException(Exception):
    def __init__(self, message):
        super().__init__(message)

class Date:
    def __init__(self, day, month, year):
        self.day = day
        self.month = month
        self.year = year

    def accept_date(self):
        try:
            self.day = int(input("Enter day: "))
            self.month = int(input("Enter month: "))
            self.year = int(input("Enter year: "))
            self.validate_date()
        except ValueError:
            raise InvalidDateException("Invalid input. Please enter integers for day, month, and year.")

    def validate_date(self):
        if self.month < 1 or self.month > 12:
            raise InvalidDateException("Month must be between 1 and 12.")

        days_in_month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        if self.is_leap_year(self.year):
            days_in_month[1] = 29
        else:
            days_in_month[1] = 28

        if self.day < 1 or self.day > days_in_month[self.month - 1]:
            raise InvalidDateException(f"Day must be between 1 and {days_in_month[self.month - 1]} for month {self.month}.")

    def is_leap_year(self, year):
        return (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)

    def display_date(self):
        print(f"Date: {self.day:02d}/{self.month:02d}/{self.year}")

def main():
    try:
        date = Date(00, 00 , 0000)
        date.accept_date()
        date.display_date()
    except InvalidDateException as e:
        print(f"InvalidDateException caught: {e}")

if __name__ == "__main__":
    main()
