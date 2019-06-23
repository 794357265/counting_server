package com.zyb;

import com.alibaba.fastjson.JSONObject;
import com.zyb.response.CommonReturnType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.zyb"} /*,exclude = DataSourceAutoConfiguration.class*/)
@RestController
public class App {

    @RequestMapping("/home")
    public String home()  {
        //CommonReturnType.create("Hello world! spring-boot");
        return JSONObject.toJSONString(CommonReturnType.create("Hello world! spring-boot"));
        //return "hello spring-boot!";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class,args);
    }


}
