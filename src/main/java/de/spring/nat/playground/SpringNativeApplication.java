package de.spring.nat.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringNativeApplication {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(new SpringApplicationBuilder(SpringNativeApplication.class).run(args)));
    }
}
