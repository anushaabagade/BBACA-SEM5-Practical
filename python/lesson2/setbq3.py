def count(sentence):
    w = sentence.lower().split()
    word_count = {}
    
    for word in w:
        if word in word_count:
            word_count[word] += 1
        else:
            word_count[word] = 1
    
    return word_count
sentence = input("Enter a sentence: ")

word_counts = count(sentence)
print("Word occurrences:", word_counts)
