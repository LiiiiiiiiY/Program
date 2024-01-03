def finder(text,words):
    false_out = []
    for new in words.split(" "):
        i = 0
        while text.find(new, i) != -1:
            value = [text.find(new, i), text.find(new, i) + len(new) - 1]
            false_out.append(frozenset(value))
            i += 1
    ture_out = [list(false_out) for false_out in set(false_out)]
    return sorted(ture_out)
Text = input("请输入text的内容: ")
Words = input("请输入words的内容:")
print(finder(Text,Words))

