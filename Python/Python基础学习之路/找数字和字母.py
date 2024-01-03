str1 = "asduiaf878123jkjsfd-‐213928"
number = 0
word = 0
for i in str1.upper():
    if "0" <= i <= "9":
        number += 1
    elif "A" <= i <= "Z":
        word += 1
print("数字个数:", number)
print("字母个数:", word)
