package com.sean.hyx2021.com.sean.stream;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/29/2020
 */
public class JavaStreamMain {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.withZone(ZoneId.of("UTC+7")));
        System.out.println(clock.getZone());
        Instant instant = clock.instant();
        System.out.println(instant.getNano());
        System.out.println(clock.millis());


    }
}
