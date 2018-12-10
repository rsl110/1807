package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringCloudApplication
@EnableEurekaClient
@EnableZuulProxy
public class RunAppZuul {

	public static void main(String[] args) {
		SpringApplication.run(RunAppZuul.class, args);

	}

}
