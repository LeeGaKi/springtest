package icu.lijiaqi.springtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : LeeGaki
 * @date : 2022/7/16 9:27
 * 面向面试编程 --> 李佳琪
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包下的controller生成api文档
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        //设置文档信息
        return new ApiInfoBuilder()
                .title("小7接口文档")
                .description("小7接口文档")
                .contact(new Contact("李佳琪", "http:localhost:8080/doc.html",
                        "1004102689@qq.com"))
                .version("1.0")
                .build();
    }
}

