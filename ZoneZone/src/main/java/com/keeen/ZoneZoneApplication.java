package com.keeen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Slf4j
public class ZoneZoneApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(ZoneZoneApplication.class, args);
        log.info("ZoneZone is online!");
    }
}
