text = [
    "40.html, 5, 3, 0.30, 1",
    "04.html, 3, 1, 0.70, 1",
    "66.html, 1, 2, 0.70, 1",
    "62.html, 6, 3, 0.20, 1",
    "52.html, 1, 4, 0.70, 1",
    "32.html, 7, 3, 0.50, 0",
    "26.html, 6, 3, 0.70, 1",
    "61.html, 1, 3, 0.40, 1",
    "71.html, 3, 4, 0.70, 0",
    "34.html, 3, 4, 0.70, 1",
    "11.html, 6, 4, 0.70, 0",
    "91.html, 8, 4, 0.70, 1",
    "45.html, 6, 3, 0.70, 1",
    "81.html, 7, 3, 0.10, 0",
    "01.html, 1, 1, 0.70, 1",
]

words = map(lambda l: l.split(","), text)
counts = map(
    lambda data: (data[0], round(float(data[1]) * 0.1 + float(data[2]) * 0.9 + float(data[3]) * 0.4 + float(data[4]),2)), words)
counts = sorted(counts, key=lambda x: x[1], reverse=True)
for item in counts:
    print(item)
