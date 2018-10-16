package com.yinxianren.study.serviceconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class ServiceConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumeApplication.class, args);
	}



	/**
	 * 获取RestTemplate示例 通过@LoadBalanced注解开启均衡负载能力.
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
