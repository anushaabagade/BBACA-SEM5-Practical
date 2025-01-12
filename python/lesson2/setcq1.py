def binary_search(sorted_list, item):
    low = 0
    high = len(sorted_list) - 1

    while low <= high:
        mid = (low + high) // 2
        guess = sorted_list[mid]

        if guess == item:
            return mid
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1

    return -1

sorted_list = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
item_to_find = 7

index = binary_search(sorted_list, item_to_find)
if index != -1:
    print(f"Item {item_to_find} found at index {index}.")
else:
    print(f"Item {item_to_find} not found in the list.")
