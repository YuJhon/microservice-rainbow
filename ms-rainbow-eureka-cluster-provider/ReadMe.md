#### Spring Cloud Ribbon 客户端负载均衡
> Spring Cloud Ribbon有一个拦截器，它能够在这里进行实际调用的时候，自动的去选取服务实例，并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用.

* 1.修改ms-rainbow-eureka-cluster-provider项目，增加三个配置文件，用于模拟开启三个服务提供者，如下图所示：
    ![Cluster-Provider-Project-Struct](./photos/Cluster-Provider-Project-Struct.png)

* 2.使用Idea 配置三个启动类（针对不同的profile进行启动：三个不同的端口号）
    ![Cluster-Provider-Enable-Three-Client](./photos/Cluster-Provider-Enable-Three-Client.png)


* 3.修改ms-rainbow-eureka-cluster-consumer项目，增加Ribbon的依赖
    ```xml
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-ribbon</artifactId>
    </dependency>
    ```
    ![Cluster-Consumer-Project-Struct](../ms-rainbow-eureka-cluster-ribbon-consumer/photos/Cluster-Consumer-Project-Struct.png)

* 4.ms-rainbow-eureka-cluster-consumer项目要实现客户端的负载均衡，需要注入RestTemplate和加上@LoadBalance注解，如下图所示：
    ![Cluster-Consumer-Main-Application](../ms-rainbow-eureka-cluster-ribbon-consumer/photos/Cluster-Consumer-Main-Application.png)
    
* 5.依次启动项目
    * 5.1 MsRainbowEurekaClusterServer2222Application
    * 5.2 MsRainbowEurekaClusterServer3333Application
    * 5.3 MsRainbowEurekaClusterProvider10010Application
    * 5.4 MsRainbowEurekaClusterProvider10020Application
    * 5.5 MsRainbowEurekaClusterProvider10030Application
    * 5.6 MsRainbowEurekaClusterConsumerApplication
    
* 6.查看效果
    * 6.1 Eureka注册中心
    ![Eureka-Cluster-Server节点1注册中心](../ms-rainbow-eureka-cluster-server/photos/Eureka-Cluster-Server节点1注册中心.png)
    ![Eureka-Cluster-Server节点2注册中心](../ms-rainbow-eureka-cluster-server/photos/Eureka-Cluster-Server节点2注册中心.png)
    * 6.2 Eureka Consumer Ribbon效果测试(分别进行三次访问：http://localhost:10011/consumer)
    ![FirstTime_Request](../ms-rainbow-eureka-cluster-server/photos/FirstTime_Request.png)
    ![SecondTime_Request](../ms-rainbow-eureka-cluster-server/photos/SecondTime_Request.png)
    ![ThirdTime_Request](../ms-rainbow-eureka-cluster-server/photos/ThirdTime_Request.png)
    
    