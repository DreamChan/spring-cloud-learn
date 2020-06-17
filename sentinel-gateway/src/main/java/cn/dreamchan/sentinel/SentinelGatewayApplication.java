package cn.dreamchan.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;


@SpringCloudApplication
public class SentinelGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelGatewayApplication.class, args);
	}

}
