///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS io.github.cdimascio:dotenv-java:2.2.2
//DEPS org.slf4j:slf4j-simple:1.7.32
//DEPS org.projectlombok:lombok:1.18.22

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorld {
    public static void main(String[] args) {
        log.info("Starting");
        System.out.println("Hello world!");
    }

    @Data
    public static class User {
        private Integer id;
        private String name;
    }
}
