package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Miraclo Wei on 2020/12/22 22:16
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class CloudAlibabaConfigMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConfigMain3377.class,args);
    }
}
