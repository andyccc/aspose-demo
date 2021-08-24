#### 编译镜像
    docker build -t libreoffice:01 .

#### 查看镜像 
    docker images
    
    REPOSITORY           TAG                 IMAGE ID            CREATED             VIRTUAL SIZE
    libreoffice           01                 caaa911e050a        16 minutes ago      1.122 GB

#### 启动
    docker run -it -v ~/pdf_data/:/data libreoffice:01 bash

    这里pdf_data是要转换文件所在目录，然后进行转换
   

#### pdf 转 word 
    libreoffice --headless --infilter="writer_pdf_import" --convert-to docx  --outdir /data /data/test.docx.pdf
    

#### 参考链接
    
    https://www.cnblogs.com/jxd283465/p/12486385.html
    https://blog.csdn.net/tangjie200566/article/details/115670119?utm_medium=distribute.pc_feed_404.none-task-blog-2~default~BlogCommendFromBaidu~default-2.nonecase&depth_1-utm_source=distribute.pc_feed_404.none-task-blog-2~default~BlogCommendFromBaidu~default-2.nonecas
    
    https://github.com/EugenMayer/docker-image-jodconverter
    https://blog.csdn.net/lclovehlm/article/details/107371453
    https://www.cnblogs.com/sguozeng/p/7747987.html