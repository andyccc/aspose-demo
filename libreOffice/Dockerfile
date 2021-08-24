FROM centos
# 镜像源，这里使用的是centos

MAINTAINER "andyccc@github"
# 维护人信息，可删去

RUN yum install libreoffice-writer.x86_64 -y  \
          && yum groupinstall "Fonts" -y  \
          && yum groupinstall "Input Methods" -y \
          &&  rm -rf /etc/localtime \
          && ln -s /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

# 上面三条指令是安装libreoffice程序及支持字体

RUN yum -y install langpacks-zh_CN.noarch
# 这几条是添加中文支持

RUN yum -y install glibc-common
RUN yum clean all
# 最后清理yum缓存

ENV LC_ALL zh_CN.utf8
# 设置中文支持环境