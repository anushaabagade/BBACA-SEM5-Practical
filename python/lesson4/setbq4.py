def create_and_print_dict():
    my_dict = {key: key**2 for key in range(1, 21)}
    
    print("Dictionary with keys from 1 to 20:")
    for key, value in my_dict.items():
        print(f"{key}: {value}")

create_and_print_dict()
