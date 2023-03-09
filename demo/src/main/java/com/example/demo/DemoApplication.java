package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		


		
        JSONObject jsonObject = JSON.parseObject(Data.TestData);
        System.out.println(jsonObject.toJSONString());

        SpringApplication.run(DemoApplication.class, args);
	}

}
