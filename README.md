# build-SSM-Framework
This project is the SSM(Spring+Spring MVC+Mybatis) build for the java web project. 

# 工程目录 #
src/main/java下为工程的源码，其中：

* `com.shenqingtong.certification.controller`为controller层
* `com.shenqingtong.certification.dao`为数据持久层
* `com.shenqingtong.certification.model`为model层
* `com.shenqingtong.certification.service`为业务逻辑的接口
* `com.shenqingtong.certification.serviceImpl`为业务逻辑接口的实现类

src/test/java下为工程的测试代码，使用Junit进行测试。



# 使用的框架 #
* spring
* mybatis
* spring mvc
* Jredis

使用maven-3.3.3创建工程，管理jar包。请先安装apache-maven-3.3.3,相关的包依赖在pom.xml中配置，如需其他的jar包，直接在这个文件中配置依赖项。


# spring与mybatis的整合 #
spring与mybatis的整合的配置文件为spring-mybatis.xml.

关于mySQL数据库的连接信息(driver,url,username,password等)都放在`jdbc.properties`文件中，当然这个信息是我在自己电脑上测试时使用的数据库信息，到时候还需要修改。

Jedis的配置信息也在`jdbc.properties`文件中(我还不太清楚这个具体怎么使用，里面的host,port配置信息是我随便写的。。)

`log4j.properties`文件是关于日志信息的配置。

# Spring MVC的配置 #
spring MVC的配置文件为`spring-mvc.xml`,文件中也有详细的配置说明，这里就不再赘述。

# mybatis-generator的使用 #
使用这个工具，可以逆向自动生成持久层的基本代码,可以根据创建的数据库中的数据表逆向自动生成dao层，model层，以及映射文件mapper，一些基本的数据库操作如查询，插入，更新，删除等操作就不用自己去写了。当然其他的一些更复杂的操作还是要自己去写。

这个mybatis-generator放在工程的mybatis-generator文件夹中，在generator.xml中指定数据库的连接信息（包括数据库连接驱动，数据库账户，密码等），生成的文件位置信息（这里我直接指定到src文件夹下），在命令窗中运行`java -jar mybatis-generator-core-1.3.2.jar -configfile generator.xml -overwrite`后，会在src文件夹中自动生成`dao,mapping,model`，将其中的文件拷贝到工程的相应文件位置中，同时记得修改3个文件的包名为工程中对应的包名。更详细的使用说明可以参考[连接](http://qiuguo0205.iteye.com/blog/819100)。