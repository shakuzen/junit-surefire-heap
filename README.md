JUnit + Surefire heap issue
=====

This repository reproduces an issue when running tests 
with JUnit 5 and the Maven Surefire plugin 2.20

To cause the error, simply run the only test in this project:

```
./mvnw clean test
```

Even though the tests appear to run successfully, the build
will fail with a reported "Java heap space" cause.

Dropping the `maven-surefire-plugin.version` to `2.19.1`, the
build passes. Alternatively, the equivalent test with JUnit 4
works as is (it can be run with `./mvnw -Pjunit4 test`).

| JUnit version | `maven-surefire-plugin.version` | Build result |
| ------------- | ------------------------------- | ------------ |
|      M4       |         `2.19.1`                |    SUCCESS   |
|      M4       |          `2.20`                 |    FAILURE   |
|   SNAPSHOT*   |          `2.20`                 |    FAILURE   |

\* _As of the time of making this repository._
