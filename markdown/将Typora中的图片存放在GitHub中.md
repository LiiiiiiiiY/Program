## 将Typora中的图片存放在GitHub中

#### 创建一个GitHub账号

1. 可以用正常的QQ邮箱去注册，但是GitHub在国内登录时速度较慢，所以可以在微软商店下载一个<**wait Toolkit**>软件加速GitHub网站。

   ![image-20231014163127215](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014163127215.png)

#### 创建存放照片的仓库

账号创建完成后，在GitHub创建一个公有仓库

![image-20231014165932322](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014165932322.png)

![image-20231014170646536](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014170646536.png)

建立完成之后就会有路径名称：账号用户名/仓库名，如下，我的用户名为LiiiiiiiiY，仓库名为Typora。

![image-20231014171006696](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014171006696.png)

#### 获取token密钥

进入右上角的账号头像，点击**设置(Settings)**，往下滑到最后一项**开发者设置(Developer settings)**，生成经典令牌(有classic那一个)，

![image-20231014171928093](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014171928093.png)

![image-20231014171856966](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014171856966.png)

#### 配置Typora

打开Typora，点击**文件**中的**偏好设置**，找到图像，在上传服务中选择**PicGo-Core(command line)**，然后点击下方的**下载**，下载完成后点击**打开配置文件**

将仓库名粘贴到repo中，将获取的密钥粘贴到token中，最后保存并退出文件。

![image-20231014174321798](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014174321798.png)

退出后先停止**wait Toolkit**软件的加速，否则会报错403，然后点击**验证图片上传选项**，显示成功即可正常使用图片上传了，之后可以不用

![image-20231014175137054](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231014175137054.png)

