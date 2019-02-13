package com.srmasset.srmassetzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SrmAssetZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrmAssetZuulApplication.class, args);
	}

}

