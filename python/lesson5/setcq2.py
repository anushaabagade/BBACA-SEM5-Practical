from datetime import datetime

def get_day_of_week():
    now = datetime.now()
    
    day_of_week = now.strftime("%A")
    
    return day_of_week

if __name__ == "__main__":
    day_of_week = get_day_of_week()
    print(f"Today is: {day_of_week}")
