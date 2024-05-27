import numpy as np
import jieba
from tqdm import tqdm
from docx import Document
import re

# 打开一个.docx文件
doc = Document('学生手册.docx')

# 读取并合并文档中所有段落的文本
text = ' '.join([paragraph.text for paragraph in doc.paragraphs])
# print(text)
# 使用正则表达式根据中文标点符号切分文本
# 这个正则表达式匹配了中文的句号、问号和感叹号
pattern = r'。|？|！'

# 使用re.split()进行切分，注意设置maxsplit参数以避免空字符串
sentences = re.split(pattern, text)

# 过滤掉空字符串（如果有的话）
sentences = [sentence for sentence in sentences if sentence]

# print(sentences)
lines=sentences
id2sent = dict(enumerate(lines))
word2sentid = {}
tf = {}

for i in tqdm(iter(range(len(lines)-1))):
    for w in set(jieba.cut(lines[i] + lines[i + 1],HMM=True)):
        if w not in word2sentid:
            word2sentid[w] = []
        if w not in tf:
            tf[w] = 0
        word2sentid[w].append(i)
        tf[w] += 1

# 统计tf、idf的匹配
total = sum(tf.values())*1.
idf = {i:np.log(total)-np.log(j) for i,j in tf.items()}


def answers(s):
    ws = jieba.lcut(s, HMM=True)
    result = {}
    for w in ws:
        if w in word2sentid:
            for i in word2sentid[w]:
                if i not in result:
                    result[i] =0
                result[i] += idf[w]

    # 使用max函数和key参数找到最大值的索引
    if result:
        i = max(result, key=result.get)
        return id2sent[i] + '\n' + id2sent[i + 1]
    else:
        return "没有找到相关的句子。"
s=input("请输入查询内容:")
print(answers(s))