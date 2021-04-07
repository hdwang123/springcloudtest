package com.hdwang.springcloudtest.registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	/**
	 * 运行点对点模式（集群模式）时，通过添加VM参数启动不同的注册中心节点实例
	 * 例如：-Dspring.profiles.active=peer2
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
