a = [10, 20, 30, 40]
b = [30, 40, 50, 60]

common = []

for x in a:
    if x in b:
        common.append(x)

print("Common Elements =", common)
