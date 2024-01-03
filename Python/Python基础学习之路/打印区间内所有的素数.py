# 开发时间：2023/4/19 9:53
def isprime(number): #是素数
    if number in (1, 2):
        return True
    for idx in range(2, number):
        if number % idx == 0:
            return False
    return True


def print_primes(beginning, ending):
    for number in range(beginning, ending + 1):
        if isprime(number):
            print(f"{number}是素数")


begin = 11
end = 25
print_primes(begin, end)
