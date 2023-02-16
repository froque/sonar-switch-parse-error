
## To reproduce

 * https://community.sonarsource.com/t/error-unable-to-parse-source-file-a-switch-expression-should-have-a-default-case/81431
 
### Start SonarQube
```
docker run -d --rm \
    --name sonarqube \
    -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true \
    -p 9000:9000 \
    sonarqube:9.8.0-community
```

### Unable to parse source file error

```
/opt/maven/apache-maven-3.8.7/bin/mvn -q clean package
/opt/maven/apache-maven-3.8.7/bin/mvn -q sonar:sonar \
    -Dsonar.host.url=http://localhost:9000 \
    -Dsonar.login=admin \
    -Dsonar.password=admin
[ERROR] Unable to parse source file : 'module2/src/main/java/org/example/module2/Foo1.java'
[ERROR] Parse error at line 8 column 17: A switch expression should have a default case
```

### No error

```
/opt/maven/apache-maven-3.8.7/bin/mvn -q clean package sonar:sonar \
    -Dsonar.host.url=http://localhost:9000 \
    -Dsonar.login=admin \
    -Dsonar.password=admin

```
