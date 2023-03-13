package com.sean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sean He
 * Date: 2023/3/13
 */
@SpringBootApplication
@Slf4j
public class MySpringBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MySpringBootApplication.class, args);
        log.info("test");

      /*  log.info("test");

        String name = "";
        for(int i = 0; i< 10 ; i++){
            name = name + "123";
        }
        System.out.println(name);

        Integer integer = 1123;

        System.out.println(integer.equals(1));
*/
        String s = "0.00594";
//        double v = Double.parseDouble(s);
//        BigDecimal bigDecimal = BigDecimal.valueOf(Double.parseDouble(s));
//        BigDecimal multiply = bigDecimal.multiply(BigDecimal.valueOf(100)).multiply(new BigDecimal(100));
//        System.out.println(multiply);
//        double a = Double.parseDouble(s) * 100*100;
//        System.out.println(a);
//        System.out.println(Math.round(a));
//        System.out.println();
        Map<String, String > map = new HashMap<>();
        System.out.println(map.get("aa"));

    }
}
