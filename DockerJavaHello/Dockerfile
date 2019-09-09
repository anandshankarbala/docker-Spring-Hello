FROM  openjdk:8
ADD target/docker-spring-hello.jar /dockerSpringHello/docker-spring-hello.jar
WORKDIR /dockerSpringHello/
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-hello.jar"]
 