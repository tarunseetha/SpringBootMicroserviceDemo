# SpringBootMicroserviceDemo

Objective of this is to understand Java Sprinboot Microservices using a simple demo application.

To understand this or to setup this on your local machine, please follow the following sequnece:

1). Refer project named as "spring-eureka-server". From this we are starting Eureka server on its default port 8761. Although we can customize 
it as well by defining port number in application.yml file. 


2). Now first run the above project "spring-eureka-server" to start eureka server. To verify hit localhost:8761 on your browser, you should
see one page which says that as of now there is no microservice registered to it.

3). Now run project "ProductCategoryEurekaClient" to register one miroservice to Eureka server.

4). At last run project "MicroServiceDemo" which is basically a demo application, consuming microservice registered in above step using RestTemplate.

