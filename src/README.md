# starter开发说明
## 说明
- 该Readme是一个关于如何制作starter项目的说明，该工程有详细的步骤说明，该工程是一个完整的starter工程，要使用该starter只需要在您的项目引入pom依赖即可
，如有版本version变动请自行修改
- 功能说明：定制一个可以便捷打印日志的starter,当引入该starter后，只需要在对应方法上添加注解@Log即可完成日志的自动打印
- 要求：通过yml中配置想mvc.log.enabled 的值来决定是否启用日志打印功能

## 步骤
### 编写配置文件类，用于读取配置文件的信息
因为需要读取配置文件application.yml中配置数据，来决定是否开启日志打印功能，所以先开发配置文件读取类LogProperties

### 编写注解
因为是通过注解实现功能，所以需要我们开发自定义注解，该注解是在代码运行的时候生效，在参数和方法上都可以使用。

### 编写切面功能
定义注解后，需要在改注解使用时实现其功能，所以需要编写切面的切入功能

### 编写启动配置类
定义注解后，需要在改注解使用时实现其功能，所以需要编写切面的切入功能

### 将配置启动类加入spring.factories中
配置starter启动器入口 --resources/META-INF/spring.factories

### 测试
代码完成开发，需要使用maven install安装到本地，然后在其他项目中导入pom依赖即可进行验证

导入pom依赖
```xml
<dependency>
    <groupId>org.yanzige.log</groupId>
    <artifactId>log-aspect-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## 总结
编写starter功能的顺序
- 先编写对应配置文件读取的配置类 LogProperties
- 自定义注解Log
- 编写切面类LogAspect，实现需要的切面功能
- 编写启动配置类 LogAspectEnableAutoConfiguration，将所有需要的组件被正确的扫描，并配置正确的扫描路径，最后配置相应starter启动的条件
- 编写文件 spring.factories 
- 在其他项目只引用pom依赖 + 在配置文件中添加相应的配置以开启starter功能

注：参考总结来源于网络 https://www.bilibili.com/video/BV18X4y1z73R/?spm_id_from=333.337.search-card.all.click&vd_source=5f9e6b35dbb163280676b2a0be0142e9