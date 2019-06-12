# spring-boot-starter-swagger
swagger自动多模块配置

当我们构建分布式系统的时候，虽然我们可以用Swagger来方便为每个服务自动产出API文档页面。但是随着服务数量的增多，
内部服务间的依赖关系的复杂度增加，每个服务开发人员要关心和查阅的文档变得越来越多。由于每个服务的文档地址可能都不一样，
这使得不得不维护一个文档的索引来方便查阅，并且这个索引还需要不断的去维护更新。

该starter致力于通过配置生成多个swagger的模块，不用在代码中重复定义docket的问题，此外整合spring cloud gateway 也是通过配置重定向到
我们的微服务 

**项目地址**

- Github：https://github.com/fafeidou/spring-boot-starter

# 使用手册

## 版本说明

spring-boot-starter-swagger的使用版本与Spring Boot版本直接相关，对应关系如下；

| Spring Boot版本 | spring-boot-starter-swagger版本 |
|---|---|
|2.1.x|2.1.x|

当前最新版本2.1.0。

## 快速入门 

该工具的时候非常简单，先通过下面几步简单入门：

**第一步**：构建一个基础的Spring Boot应用

**第二步**：在pom.xml中引入依赖

```xml
<dependencies>
    <dependency>
        <groupId>com.batman</groupId>
        <artifactId>spring-boot-starter-swagger</artifactId>
        <version>2.1.0.version</version>
        </dependency>
</dependencies>
```

**第三步**：配置文件
```yaml
batman:
  swagger:
    title: api manage RESTful Content APIs
    description: <font color="red">接口文档</font>
    version: 1.0
    modules:
    - {
      model-name: model_one, #模块名称
      packages: ["com.batman.config.model_one.controller"], #扫描的包路径
      group-name: model_one  #分组名称
    }
    - {
      model-name: model_two,
      packages: ["com.batman.config.model_two.controller"],
      group-name: model_two
    }
```

**第四步**：查看聚合文档。

原生文档：访问`http://localhost:port/swagger-ui.html`

增强文档：访问`http://localhost:port/doc.html`

> 代码示例具体可见`spring-boot-starter-swagger-examples`目录

## 使用spring cloud gateway 中的路由自动配置

**第一步**：在pom.xml中引入依赖

```xml
<dependencies>
    <dependency>
        <groupId>com.batman</groupId>
        <artifactId>spring-cloud-starter-swagger</artifactId>
        <version>2.1.0.version</version>
        </dependency>
</dependencies>
```

**第二步**：配置文件
```yaml
batman:
  swagger-resource:
    nodes:
      - {
        name: provider,
        location: "/service-provider/v2/api-docs?group=provider",
        version: 2.0
      }
```

**第三步**：查看聚合文档。