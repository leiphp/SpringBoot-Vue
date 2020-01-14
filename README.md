# SpringBoot-Vue
SpringBoot+vuejs搭建个人博客

### SpringBoot(主流) 
1. 敏捷开发（整合框架）  
2. 无需Tomcat
3. 减少xml配置（没有xml）,配置文件  
4. SpringCloud+SpringBoot 
5. SpringBoot--和微服务有什么关联 
目前来说SpringCloud(http接口+rest)，基于SpringBoot web组件封装SpringMVC 
### 构建项目
1.图形化构建方式（http://start.spring.io/）  
2.命令行方式（Maven）  
`mvn archetype:generate -DinteractiveMode=false -DgroupId=cn.lxtkj -DartifactId=demoapp-maven -Dversion=1.0.0-SNAPSHOT`  
### 多模块项目 
1. 调整主（父）工程类型（packaging） 
2. 创建子模块工作（module）  
    * 模型层：model  
    * 持久层：persistence 
    * 表示层：web 
3. 子模块依赖管理（dependencyManagement）  
4. 项目打包方式 
   * 构建Jar包 
   * 构建war包
   * 构建ear包  
   打包命令:`mvn -Dmaven.test.skip -U clean package`  
   jar包启动方式：切换到target目录输入命令 `java -jar first-app-demo-0.0.1-SNAPSHOT.jar`  
5. 运行模式
   * IDEA方式
   * JAR/WAR方式  `java -jar first-app-demo-0.0.1-SNAPSHOT.jar`  
   * Maven插件方式  
     * 1.首先回到根目录 `F:\github-project\SpringBoot-blog` 
     * 2.输入命令：`mvn spring-boot:run`  
### 部署Guns  
1. 下载guns源码`https://gitee.com/naan1993/guns` 
2. 修改数据源  
    * 目标：`Fguns\src\main\resources\application.yml`
    * 修改内容：
      * 2.1`spring.datasource` 
      * 2.2`guns.flowable.datasource` 
      * 2.3`guns.flowable.muti-datasource`  
3. 启动Guns
   * 3.1运行java文件[spring boot]
      * guns\src\main\java\cn\stylefeng\guns\GunsApplication.java
      * IDEA编辑器右键：run GunsApplication即可
   
   * 3.2运行jar文件 
      * 对guns进行打包部署
        * 1.找到guns 
        * 2.运行命令，找到maven右上角的命令工具输入：`mvn clean package -Dmaven.test.skip=true` 
        * 3.进入target运行jar文件,java -jar guns.jar
        
   * 3.3运行war包  
     * 准备：修改guns中的pom文件打包方式  
     * 对guns进行打包部署(覆盖之前target)   
        * 1.找到guns 
        * 2.运行命令，找到maven右上角的命令工具输入：`mvn clean package -Dmaven.test.skip=true` 
        * 3.拷贝war包至web服务器Tomcat的webapps中（本地运行：进入target运行war文件,`java -jar guns.war`）
        * 4.将war包改为ROOT.wa，并启动Tomcat
### SpringBoot Web开发（） 
推荐使用模板引擎技术（动态页面静态化），常用的模板引擎有以下几种：  
1. freemaker  
2. velocity  
3. Thymeleaf 
### SpringBoot 整合jdbcTemplate  
JdbcTemplate主要提供以下五类方法： 
* execute方法：可以用于执行任何SQL语句，一般用于执行DDL语句； 
* update方法及batchUpdate方法：update方法用于执行新增、修改、删除等语句；batchUpdate方法用于执行批处理相关语句； 
* query方法及queryForXXX方法：用于执行查询相关语句； 
* call方法：用于执行存储过程、函数相关语句。 

JDK 5.0注解或XML描述对象－关系表的映射关系，并将运行期的实体对象持久化到数据库中。  
1. Java Persistence API（Java 持久层 API）：用于对象持久化的 API

2. 作用：使得应用程序以统一的方式访问持久层

3. JPA 与 Hibernate究竟是什么关系呢：

 * JPA 是 Hibernate 的一个抽象，就像 JDBC 和 JDBC 驱动的关系

 * JPA 是一种 ORM 规范，是 Hibernate 功能的一个子集 (既然 JPA 是规范，Hibernate 对 JPA 进行了扩展，那么说 JPA 是 Hibernate 的一个子集不为过)

 * Hibernate 是 JPA 的一个实现

4.JPA 包括三个方面的技术：

 * ORM 映射元数据，支持 XML 和 JDK 注解两种元数据的形式

 * JPA 的 API

 * 查询语言：JPQL
 
 ### SpringBoot 整合事务   

### SpringBoot热部署  
未完待续...

## 后端技术栈

后端主要采用了：  

1.SpringBoot  
2.SpringSecurity  
3.MyBatis  
4.部分接口遵循Restful风格  
5.MySQL  

## 前端技术栈

前端主要采用了：  

1.Vue  
2.axios  
3.ElementUI  
4.vue-echarts  
5.mavon-editor  
6.vue-router  

还有其他一些琐碎的技术我就不在这里一一列举了。   

# 快速运行  

1.克隆本项目到本地  

```
git@github.com:leiphp/SpringBoot-blog.git
```  

2.找到blogserver项目中resources目录下的vueblog.sql文件，在MySQL数据库中执行  
3.根据自己本地情况修改数据库配置，数据库配置在SpringBoot项目的application.properties中  
4.在IntelliJ IDEA中运行blogserver项目  

**OK，至此，服务端就启动成功了，此时我们直接在地址栏输入```http://localhost:8081/index.html```即可访问我们的项目，如果要做二次开发，请继续看第五、六步。**  

5.进入到vueblog目录中，在命令行依次输入如下命令：  

```
# 安装依赖
npm install

# 在 localhost:8080 启动项目
npm run dev
```  

由于我在vueblog项目中已经配置了端口转发，将数据转发到SpringBoot上，因此项目启动之后，在浏览器中输入```http://localhost:8080```就可以访问我们的前端项目了，所有的请求通过端口转发将数据传到SpringBoot中（注意此时不要关闭SpringBoot项目）。  

6.最后可以用WebStorm等工具打开vueblog项目，继续开发，开发完成后，当项目要上线时，依然进入到vueblog目录，然后执行如下命令：  

```
npm run build
```  

该命令执行成功之后，vueblog目录下生成一个dist文件夹，将该文件夹中的两个文件static和index.html拷贝到SpringBoot项目中resources/static/目录下，然后就可以像第4步那样直接访问了。  


**步骤5中需要大家对NodeJS、NPM等有一定的使用经验，不熟悉的小伙伴可以先自行搜索学习下，推荐[Vue官方教程](https://cn.vuejs.org/v2/guide/)。**  


# 项目依赖  

1.[vue-echarts](https://github.com/Justineo/vue-echarts)  
2.[mavonEditor](https://github.com/hinesboy/mavonEditor)  

# License

MIT

**欢迎小伙伴们star、fork。**  





