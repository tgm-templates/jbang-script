jbang app
============

# Features

* jbang-catalog.json
* Gradle Source Set for JBang script

# How to create JBang script

* Create source set for new JBang script: `mkdir src/second`
* Add source in build.gradle

```
second {
  java {
    srcDirs = ['src/hello']
  }
}
```

* Create JBang script from template: `jbang init --template=cli src/second/Hello.java`
* Open IntelliJ IDEA to edit your script

# References

* jbang: https://github.com/jbangdev/jbang
