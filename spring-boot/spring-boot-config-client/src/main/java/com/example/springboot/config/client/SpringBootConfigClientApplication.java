package com.example.springboot.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootConfigClientApplication implements CommandLineRunner {

    @Value("${message}")
    private String message;

    private ApplicationContext applicationContext;

    SpringBootConfigClientApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigClientApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Environment environment = applicationContext.getBean(Environment.class);
        System.out.println("environment = " + environment);
        System.out.println("message = " + message);
        System.out.println("environment.getActiveProfiles() = " + Arrays.toString(environment.getActiveProfiles()));
        System.out.println("((AbstractEnvironment)environment).getPropertySourmutablePropertySources = {MutablePropertySources@7030} \"[MapPropertySource {name='server.ports'}, ConfigurationPropertySourcesPropertySource {name='configurationProperties'}, StubPropertySource {name='servletConfigInitParams'}, ServletContextPropertySource {name='servletContextInitParams'}, PropertiesPropertySource {name='systemProperties'}, OriginAwareSystemEnvironmentPropertySource {name='systemEnvironment'}, RandomValuePropertySource {name='random'}, CachedRandomPropertySource {name='cachedrandom'}, MapPropertySource {name='springCloudClientHostInfo'}, OriginTrackedMapPropertySource {name='configserver:C:/Work/pfrog/spring-boot/config-repo/file:C:\\Users\\ravik\\AppData\\Local\\Temp\\config-repo-396022344102397522\\spring-boot-config-client.yml'}, OriginTrackedMapPropertySource {name='configserver:C:/Work/pfrog/spring-boot/config-repo/file:C:\\Users\\ravik\\AppData\\Local\\Temp\\config-repo-396022344102397522\\application.properties'}, MapPropertySource {name='configClient'}, OriginTrackedMapPropertySource {name='Config resource 'class path resource [\"… Viewces() = "
				+ ((AbstractEnvironment) environment).getPropertySources());
        System.out.println("========= Origin Tracked Map PropertySource =========");
		MutablePropertySources mutablePropertySources = ((AbstractEnvironment) environment).getPropertySources();
		mutablePropertySources.stream()
				.filter(propertySource -> propertySource instanceof OriginTrackedMapPropertySource)
                .map(propertySource -> ((OriginTrackedMapPropertySource) propertySource).getPropertyNames())
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
	}
}