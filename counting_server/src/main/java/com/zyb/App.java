package com.zyb;

import com.zyb.response.CommonReturnType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.zyb"} /*,exclude = DataSourceAutoConfiguration.class*/)
@RestController
@MapperScan("com.zyb.mapper")
public class App {

    @RequestMapping("/home")
    public String home()  {
        //CommonReturnType.create("Hello world! spring-boot");
        return CommonReturnType.create("Hello world! spring-boot").toJson();
        //return "hello spring-boot!";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class,args);
    }


}
