FROM openjdk:19-jdk-alpine
ADD target/Docker-SpringBoot.jar Docker-SpringBoot.jar
EXPOSE 8085
ENTRYPOINT ["java" , "-jar" ,"Docker-SpringBoot.jar"]
