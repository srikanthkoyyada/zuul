package com.zuul.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties("app")
@PropertySource("classpath:application.properties")
public class AppProperties {

	private String name="zuul";

	

}
