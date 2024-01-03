keys = ["qwertyuiop","asdfghjkl","zxcvbnm"]
words = ["Twitter", "TOTO", "FishC", "Python", "ASL"]
out = []
for value in words:
    for key in keys:
        count = 0
        for char in value:
            if char.lower() not in key:
                break
            else:
                count+=1
        if count == len(value):
            out.append(value)
            break
print(out)