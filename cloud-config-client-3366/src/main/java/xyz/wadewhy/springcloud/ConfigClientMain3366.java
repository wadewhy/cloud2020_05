package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: ConfigClientMain3366
 * @Author: 钟子豪
 * @DATE: 2020/5/18
 * @MONTH_NAME_FULL: 五月
 * @DAY: 18
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2020_5
 **/
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
    public static void main(String[] args) {
        SpringApplication.run( ConfigClientMain3366.class,args);
    }
}