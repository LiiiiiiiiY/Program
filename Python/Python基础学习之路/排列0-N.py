def loveYou(n: int):
    if n > 0:
        loveYou(n - 1)
    print(n, end="\t")
    if n % 10 == 9:
        print('\n')


number = int(input())

loveYou(number)
