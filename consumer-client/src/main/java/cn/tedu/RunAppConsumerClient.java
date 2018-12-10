package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@EnableEurekaClient
public class RunAppConsumerClient {
	@Bean			//创建RestTemplate(模板)对象
	@LoadBalanced	//实现负载均衡
	public RestTemplate getInstance(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerClient.class, args);

	}

}
