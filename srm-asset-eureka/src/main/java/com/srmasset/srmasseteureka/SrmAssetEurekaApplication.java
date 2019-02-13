package com.srmasset.srmasseteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SrmAssetEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrmAssetEurekaApplication.class, args);
	}

}

