#### 一、环境准备

* JDK 1.8
* IDEA
* Maven 3.3.9
* Git

#### 二、工程介绍

|工程名称  |描述|端口|
| ------ |--- |---|
|spring-cloud-smartsport| 父工程 | NA | NA|
|smartsmport-eureka-server  | 服务注册中心 | eureka-server  | 8081|
|smartsport-config-server | 配置中心      | config-server| 8087|
|smartsport-base-disk-service | 磁盘示例服务  | base-disk-service| 8082, 8083|
|smartsport-service-feign | feign负载均衡 | service-feign | 8084|
|smartsport-service-ribbon | ribbon负载均衡 | service-ribbon | 8085|
|smartsport-service-zuul | zuul服务网关 | service-zuul | 8086|


#### 三、编译工程

```script
cd spring-cloud-smartsport
mvn clean install
```

#### 四、运行项目

依次运行

smartsport-eureka-server, smartsport-config-server,
smartsport-base-disk-service(运行两个实例8082，8083), 
smartsport-service-ribbon, smartsport-service-feign, 
smartsport-service-zuul

以smartsport-eureka-server为例

```script
cd smartsport-eureka-server
mvn spring-boot:run
```

#### 访问

http://localhost:8086/api-ribbon/profile

http://localhost:8086/api-feign/profile

交替返回test-6.0from port: 8082 和 test-6.0from port: 8083

