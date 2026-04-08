# Bank_account

Experiment-11

in vs-code:

https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.1/junit-platform-console-standalone-1.10.1.jar


javac -cp ".;lib\junit-platform-console-standalone-1.10.1.jar" -d bin Calculator.java CalculatorTest.java


java -jar lib\junit-platform-console-standalone-1.10.1.jar --class-path bin --scan-class-path --details=tree


Experiment-12
Experiment-13

Experiment-14

Jacoco Dependency-file:

<!-- ADD THIS PART -->
  <plugins>
    <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.11</version>

      <executions>
        <!-- Attach JaCoCo agent -->
        <execution>
          <goals>
            <goal>prepare-agent</goal>
          </goals>
        </execution>

        <!-- Generate coverage report -->
        <execution>
          <id>report</id>
          <phase>test</phase>
          <goals>
            <goal>report</goal>
          </goals>
        </execution>
      </executions>

    </plugin>
  </plugins>



  Experiment-16

  Dockerfile

FROM eclipse-temurin:17
WORKDIR /app
COPY . /app
RUN javac Sample.java
CMD ["java", "Sample"]

docker build -t myjavaapp .
docker run myjavaapp


Experiment-17

docker pull nginx

docker volume create myvolume

docker run -d -p 8080:80 -v myvolume:/usr/share/nginx/html --name mycontainer nginx

if port not avaiable:

docker rm mycontainer

docker run -d -p 8081:80 -v myvolume:/usr/share/nginx/html --name mycontainer nginx

Experiment-18

Dockerfile

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . /app
RUN javac Sample.java
CMD ["java", "Sample"]

docker build -t java-app 

docker login
docker tag java-app yourusername/java-app:v1
docker push yourusername/java-app:v1

Experiment-19:

docker build -t myjenkinsapp .
docker run -d -t java-app


  
