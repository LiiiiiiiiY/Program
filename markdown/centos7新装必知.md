# centos7新装必知

## 一、网络

### 当前的centos已经淘汰`ifconfig`命令了，取而代之的是`ip addr`

<img src="https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231108193404427.png" alt="image-20231108193404427" style="zoom: 67%;" />

### 新系统安装好后系统不会自动分配IP，因为网卡没有激活，进入`/etc/sysconfig/network-scripts/`路径找，打开网卡配置，网卡是和ip addr现实是对应的

<img src="https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231108193647545.png" alt="image-20231108193647545" style="zoom: 67%;" />

### 进入网卡配置界面后，按下键盘的`I`键，将ONBOOT改为yes，其他的默认，然后点键盘的`ESC`，再点`:WQ`保存退出

<img src="https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231108193900262.png" alt="image-20231108193900262" style="zoom: 67%;" />

### 出来以后重启网卡`service network restart`，就有网络了

<img src="https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/image-20231108194158817.png" alt="image-20231108194158817" style="zoom: 67%;" />

