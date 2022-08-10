package icu.lijiaqi.springtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author LeeGaki
 */
@SpringBootApplication
@MapperScan("icu.lijiaqi.springtest.mapper")
@EnableOpenApi
public class Demo1Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
