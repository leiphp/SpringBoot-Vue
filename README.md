# SpringBoot-blog
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
### SpringBoot 整合jpa  
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

### SpringBoot热部署  
未完待续...






