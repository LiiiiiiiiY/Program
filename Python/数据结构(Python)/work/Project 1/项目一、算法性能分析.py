import time


class Exp1:
    # 解法1
    def solution_one(self, n):
        result = 0
        for i in range(1, n+1):
            sum1 = 0
            for j in range(1, i+1):
                sum1 += j
            result += sum1
        return result

    # 解法2
    def solution_two(self, n):
        result = 0
        sum2 = 0
        for i in range(1, n+1):
            sum2 += i
            result += sum2
        return result

    # 解法3
    def solution_three(self, n):
        return n * (n + 1) * (n + 2) // 6


# 主程序，测试三个算法的时间性能
# 定义Exp1类的对象
test = Exp1()
# 问题规模
n = 1000
print("n = %d" % n)

# 解法1
time_start = time.perf_counter()
s1 = test.solution_one(n)
time_end = time.perf_counter()
print("解法1 s = %d" % s1)
print("解法1运行时间: %.12f (s)" % (time_end - time_start))

# 解法2
time_start = time.perf_counter()
s2 = test.solution_two(n)
time_end = time.perf_counter()
print("解法2 s = %d" % s2)
print("解法2运行时间: %.12f (s)" % (time_end - time_start))

# 解法3
time_start = time.perf_counter()
s3 = test.solution_three(n)
time_end = time.perf_counter()
print("解法3 s = %d" % s3)
print("解法3运行时间: %.12f (s)" % (time_end - time_start))
