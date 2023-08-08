package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

//访问路径:http://localhost:8080/swagger-ui.html

//把SwaggerConfig配置到项目里面
@Configuration
//开启Swagger2
@EnableSwagger2
public class SwaggerConfig {

    // 配置了swagger的Bean实例
    @Bean
    public Docket docket(Environment environment){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors 配置要扫描接口的方式
                // basePackage(指定要扫描的路径)
                .apis(RequestHandlerSelectors.basePackage("com.itheima.controller"))
                .build()
                ;
    }

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo(){

        //作者信息
        Contact DEFAULT_CONTACT = new Contact("李贵超", "", "");
        return new ApiInfo(
                "swagger",
                "Api Documentation",
                "1.0",
                "urn:tos",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());

    }

}
