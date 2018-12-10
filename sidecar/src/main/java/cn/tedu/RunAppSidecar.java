package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringCloudApplication
@EnableSidecar
public class RunAppSidecar {
	public static void main(String[] args) {
		SpringApplication.run(RunAppSidecar.class, args);
	}
}
