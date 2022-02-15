package com.mamata.fsd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan( basePackages = {"com.mamata.fsd"})
@EnableTransactionManagement
@EnableJpaRepositories("com.mamata.fsd")
@EntityScan(basePackages = {"com.mamata.fsd"})
@EnableConfigurationProperties({
		FileStorageProperties.class
})
@EnableEurekaClient
public class PixogramProjectBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PixogramProjectBackApplication.class, args);
	}

}
