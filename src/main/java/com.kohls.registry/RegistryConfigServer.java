package com.kohls.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer

//https://docs.pivotal.io/spring-cloud-services/config-server/writing-client-applications.html

public class RegistryConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(RegistryConfigServer.class, args);
	}

}
