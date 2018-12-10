package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //标识这是一个Eureka客户端
public class RunAppProviderHello {

	public static void main(String[] args) {
		SpringApplication.run(RunAppProviderHello.class, args);
	}
	
}
