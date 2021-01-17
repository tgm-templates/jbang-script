jbang script
============

# Tips

* Generate Picocli command

```
$ cd src/script/jbang
$ jbang init --template=cli Hello.java
```

* jbang-catalog.json for command alias
* Command with Spring Boot support: create SpringBootApp.java under 'src/script/jbang/demo1' with package specified.

```java
///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.springframework.boot:spring-boot-starter:2.4.2
package demo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("started");
    }
}
```

# References

* jbang: https://github.com/jbangdev/jbang
