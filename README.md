# SpringCloud
SpringCloud脚手架

所用组件：  
1、Feign (Finchley版本)  
2、Hystrix (Finchley版本)  
3、Ribbon (Finchley版本)  
4、Sleuth （2.19.2版本，springboot 2.1）  
5、Eureka （Finchley版本)  
6、SBA （基于springboot 2.2.1）  

Sleuth：  
下载链接：
https://repo1.maven.org/maven2/io/zipkin/zipkin-server/  
运行命令：
nohup java -jar zipkin.jar --STORAGE_TYPE=mysql --MYSQL_DB=zipkin --MYSQL_USER=root --MYSQL_PASS=root --MYSQL_HOST=localhost --MYSQL_TCP_PORT=3306 &
运行之前导入zipkin.sql

SBA：
填写邮件的配置信息，或者去掉邮件的配置信息

项目下载即可运行，运行顺序：
1、Sleuth
2、Eureka
3、admin
4、dao
5、web

推荐使用IDEA编辑器

博客链接：
https://blog.csdn.net/W_Meng_H/article/details/103478853
