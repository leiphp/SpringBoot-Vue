# SpringBoot-blog
SpringBoot+vuejs搭建个人博客

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

### SpringBoot热部署 






