import zipfile


def Try():
    path = 'C:/Users/YYY/Downloads/PDF电子版/电子版pdf.zip'  # 压缩文件路径
    # 破解并返回密码
    zipFile = zipfile.ZipFile(path, 'r')  # 新建ZipFile对象
    N = 10 ** 12  # 六位数密码，所以最大不超过10**
    for number in range(N):
        password = '%06d' % number  # 数字转字符串，不足补前0
        try:
            zipFile.extractall('step1', pwd=bytes(password, 'ascii'))
            break
        except:
            pass
    zipFile.close()  # 关闭文件
    return password


print(Try())
