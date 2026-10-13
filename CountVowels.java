text = "education"
count = 0

for ch in text:
    if ch in "aeiou":
        count += 1

print("Vowels =", count)
