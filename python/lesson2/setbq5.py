def count_repeated_characters(input_str):
    char_count = {}
    
    for char in input_str:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
    
    for char, count in char_count.items():
        if count > 1:
            print(f"{char} {count}")

input_str = 'thequickbrownfoxjumpsoverthelazydog'
count_repeated_characters(input_str)
