package cn.dreamchan.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;


@SpringCloudApplication
public class SentinelFeignProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelFeignProviderApplication.class, args);
	}

}
